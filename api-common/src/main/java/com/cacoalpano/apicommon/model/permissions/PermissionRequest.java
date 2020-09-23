package com.cacoalpano.apicommon.model.permissions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PermissionRequest {
    private String code;
    private String name;
    private String description;
}
