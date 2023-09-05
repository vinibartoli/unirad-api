package com.bartoli.domain;

public class UsuarioEmpresa {

	private Usuario usuario;
	private Empresa empresa;
	private String empresapadrao;
	private Tenant tenant;
	
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public String getEmpresapadrao() {
		return empresapadrao;
	}
	public void setEmpresapadrao(String empresapadrao) {
		this.empresapadrao = empresapadrao;
	}
	public Tenant getTenant() {
		return tenant;
	}
	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}
	public UsuarioEmpresa(Usuario usuario, Empresa empresa, String empresapadrao, Tenant tenant) {
		super();
		this.usuario = usuario;
		this.empresa = empresa;
		this.empresapadrao = empresapadrao;
		this.tenant = tenant;
	}
	public UsuarioEmpresa() {
		super();
	}
	
	
	
}
