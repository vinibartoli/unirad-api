package com.bartoli.domain;

import java.math.BigDecimal;

public class ExameConvenio {

	private Exame exame;
	private Convenio convenio;
	private Boolean status;
	private Tenant tenant;
	private BigDecimal preco;
	
	
	public Exame getExame() {
		return exame;
	}
	public void setExame(Exame exame) {
		this.exame = exame;
	}
	public Convenio getConvenio() {
		return convenio;
	}
	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Tenant getTenant() {
		return tenant;
	}
	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public ExameConvenio(Exame exame, Convenio convenio, Boolean status, Tenant tenant, BigDecimal preco) {
		super();
		this.exame = exame;
		this.convenio = convenio;
		this.status = status;
		this.tenant = tenant;
		this.preco = preco;
	}
	public ExameConvenio() {
		super();
	}
	
	
	
}
