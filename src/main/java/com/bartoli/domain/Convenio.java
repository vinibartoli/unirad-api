package com.bartoli.domain;

public class Convenio {

	private Integer id;
	private String descricao;
	private Tenant tenant;
	private Boolean status;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Tenant getTenant() {
		return tenant;
	}
	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Convenio(Integer id, String descricao, Tenant tenant, Boolean status) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.tenant = tenant;
		this.status = status;
	}
	public Convenio() {
		super();
	}
	
	
	
}
