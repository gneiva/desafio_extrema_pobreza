package br.com.desafio.model;

import java.util.Date;
import java.util.List;


public class Paginacao {

	
	int page;
	int pages;
	int per_page;
	int total;
	String sourceid;
	// Date lastupdated;
	
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getPer_page() {
		return per_page;
	}
	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getSourceid() {
		return sourceid;
	}
	public void setSourceid(String sourceid) {
		this.sourceid = sourceid;
	}
//	public Date getLastupdated() {
//		return lastupdated;
//	}
//	public void setLastupdated(Date lastupdated) {
//		this.lastupdated = lastupdated;
//	}

	
	
	
}
