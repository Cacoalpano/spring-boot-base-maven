package com.cacoalpano.apicommon.model.account;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountResponse {
    private Long id;
    private String userName;
    private String email;
    private String phoneNumber;
    private Boolean isActive;
    private Long groupId;
    private String groupName;
}
