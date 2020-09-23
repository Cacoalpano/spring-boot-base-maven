package com.cacoalpano.apidemo.config.jwt;

import com.cacoalpano.apicommon.config.core.BaseConfig;
import com.cacoalpano.apicommon.dao.entities.Account;
import com.cacoalpano.apidemo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Base64;

@Component
public class JwtTokenProvider {
    private String secretKey;
    @Autowired
    BaseConfig baseConfig;

    @Autowired
    private JwtAccountDetailService accountDetailService;

    @Autowired
    AccountService accountService;

    @PostConstruct
    protected void init() {
        secretKey = Base64.getEncoder().encodeToString(baseConfig.getSecretKeyJwt().getBytes());
    }

    public JwtResponse createToken(String username) {
        Account account = ((JwtUserDetails) userDetailsService.loadUserByUsername(username)).user;
        Claims claims = Jwts.claims().setSubject(username);
        claims.put("userName", account.getUserName());
        claims.put("code", account.getCode());
        Date now = new Date();
        Date validity = new Date(now.getTime() + validityInMilliseconds);
        String token = Jwts.builder()//
                .setClaims(claims)//
                .setIssuedAt(now)//
                .setExpiration(validity)//
                .signWith(SignatureAlgorithm.HS512, secretKey)//
                .compact();

        JwtResponse response = new JwtResponse();
        response.token = token;
        response.userName = account.getUserName();
        response.displayName = account.getDisplayName();
        return response;
    }

    public Authentication getAuthentication(String token) {
        UserDetails userDetails = this.userDetailsService.loadUserByUsername(getUsername(token));
        return new UsernamePasswordAuthenticationToken(userDetails, "", userDetails.getAuthorities());
    }

    public String getUsername(String token) {
        return Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody().getSubject();
    }

    public String resolveToken(HttpServletRequest req) {
        String token = req.getHeader("access-token");
        String bearerToken = token != null ? token : req.getHeader("Authorization");
        if (bearerToken != null && bearerToken.startsWith("Bearer ")) {
            return bearerToken.substring(7);
        } else {
            return null;
        }
    }

    public boolean validateToken(String token) {
        try {
            Jws<Claims> claims = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token);
            if (claims.getBody().getExpiration().before(new Date())) {
                return false;
            }
            return true;
        } catch (JwtException | IllegalArgumentException e) {
            return false;
        }
    }

}
