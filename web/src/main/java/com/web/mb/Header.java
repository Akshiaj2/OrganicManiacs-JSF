package com.web.mb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.web.service.SearchService;
import com.web.service.SearchServiceImpl;

@ManagedBean(name = "header")
@ViewScoped
public class Header implements Serializable {
	private static final long serialVersionUID = 1L;
	private String searchString;

	public String getSearchString() {
		return searchString;
	}

	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}

	public List<String> completeSearch(String str) {
		return SearchServiceImpl.getObject().completeSearch(str);
	}
}
