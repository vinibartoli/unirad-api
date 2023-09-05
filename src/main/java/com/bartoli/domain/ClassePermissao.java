package com.bartoli.domain;

public class ClassePermissao {

	private Integer id;
	private String nome;
	private Tenant tenant;
	private String permission;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Tenant getTenant() {
		return tenant;
	}
	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}
	public String getPermission() {
		return permission;
	}
	public void setPermission(String permission) {
		this.permission = permission;
	}
	public ClassePermissao(Integer id, String nome, Tenant tenant, String permission) {
		super();
		this.id = id;
		this.nome = nome;
		this.tenant = tenant;
		this.permission = permission;
	}
	public ClassePermissao() {
		super();
	}
	
	
	
}
