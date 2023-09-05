package com.bartoli.domain;

public class Tenant {

	private Integer id;
	private String descricao;
	
	
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
	public Tenant(Integer id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}
	public Tenant() {
		super();
	}
	
	
	
}
