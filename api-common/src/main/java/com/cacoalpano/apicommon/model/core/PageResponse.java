package com.cacoalpano.apicommon.model.core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
public class PageResponse<T> implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<T> list;
    private int page;
    private int total;
    public int limit;
}
