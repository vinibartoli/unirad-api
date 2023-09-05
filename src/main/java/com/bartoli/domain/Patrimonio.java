package com.bartoli.domain;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class Patrimonio {

	private Integer id;
	private String descricao;
	private OffsetDateTime dataaquisicao;
	private BigDecimal valor;
	private Tenant tenant;
	private Empresa empresa;
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
	public OffsetDateTime getDataaquisicao() {
		return dataaquisicao;
	}
	public void setDataaquisicao(OffsetDateTime dataaquisicao) {
		this.dataaquisicao = dataaquisicao;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Tenant getTenant() {
		return tenant;
	}
	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Patrimonio(Integer id, String descricao, OffsetDateTime dataaquisicao, BigDecimal valor, Tenant tenant,
			Empresa empresa, Boolean status) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.dataaquisicao = dataaquisicao;
		this.valor = valor;
		this.tenant = tenant;
		this.empresa = empresa;
		this.status = status;
	}
	public Patrimonio() {
		super();
	}
	
	
	
}
