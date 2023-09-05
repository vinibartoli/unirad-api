package com.bartoli.domain;

public class Usuario {

	private Integer id;
	private String email;
	private String nome;
	private String login;
	private String senha;
	private Tenant tenant;
	private Integer tenantativo;
	private Integer gtenantatiovo;
	private Boolean status;
	private String gtenant;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Tenant getTenant() {
		return tenant;
	}
	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}
	public Integer getTenantativo() {
		return tenantativo;
	}
	public void setTenantativo(Integer tenantativo) {
		this.tenantativo = tenantativo;
	}
	public Integer getGtenantatiovo() {
		return gtenantatiovo;
	}
	public void setGtenantatiovo(Integer gtenantatiovo) {
		this.gtenantatiovo = gtenantatiovo;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public String getGtenant() {
		return gtenant;
	}
	public void setGtenant(String gtenant) {
		this.gtenant = gtenant;
	}
	public Usuario(Integer id, String email, String nome, String login, String senha, Tenant tenant,
			Integer tenantativo, Integer gtenantatiovo, Boolean status, String gtenant) {
		super();
		this.id = id;
		this.email = email;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.tenant = tenant;
		this.tenantativo = tenantativo;
		this.gtenantatiovo = gtenantatiovo;
		this.status = status;
		this.gtenant = gtenant;
	}
	public Usuario() {
		super();
	}
	
	
	
}
