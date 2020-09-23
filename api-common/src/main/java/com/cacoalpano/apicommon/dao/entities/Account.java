package com.cacoalpano.apicommon.dao.entities;

import com.cacoalpano.apicommon.converter.CryptoConverter;
import com.cacoalpano.apicommon.dao.entities.audit.Audit;
import com.cacoalpano.apicommon.dao.entities.audit.AuditListener;
import com.cacoalpano.apicommon.dao.entities.audit.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="accounts")
@EntityListeners(AuditListener.class)
public class Account implements Auditable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    @Convert(converter = CryptoConverter.class)
    private String password;
    @Column(name = "email")
    @Convert(converter = CryptoConverter.class)
    private String email;
    @Column(name = "phone_number")
    @Convert(converter = CryptoConverter.class)
    private String phoneNumber;
    @Column(name ="is_active")
    private Boolean isActive;
    @Column(name = "group_id")
    private Long groupId;

    @Embedded
    private Audit audit;

}
