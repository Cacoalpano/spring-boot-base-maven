package com.cacoalpano.apicommon.model.core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PageRequest {
    private Integer page;
    private Integer limit;
    private String direction;
    private String property;
}

