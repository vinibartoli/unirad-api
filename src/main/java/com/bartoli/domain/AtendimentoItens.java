package com.bartoli.domain;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class AtendimentoItens {

		private Exame exame;
		private Integer codigo;
		private Convenio convenio;
		private Atendimento atendimento;
		private OffsetDateTime dataatendimento;
		private Boolean status;
		private BigDecimal preco;
		private Tenant tenant;
		private BigDecimal desconto;
		private BigDecimal total;
		private String acesso;
		
		
		public Exame getExame() {
			return exame;
		}
		public void setExame(Exame exame) {
			this.exame = exame;
		}
		public Integer getCodigo() {
			return codigo;
		}
		public void setCodigo(Integer codigo) {
			this.codigo = codigo;
		}
		public Convenio getConvenio() {
			return convenio;
		}
		public void setConvenio(Convenio convenio) {
			this.convenio = convenio;
		}
		public Atendimento getAtendimento() {
			return atendimento;
		}
		public void setAtendimento(Atendimento atendimento) {
			this.atendimento = atendimento;
		}
		public OffsetDateTime getDataatendimento() {
			return dataatendimento;
		}
		public void setDataatendimento(OffsetDateTime dataatendimento) {
			this.dataatendimento = dataatendimento;
		}
		public Boolean getStatus() {
			return status;
		}
		public void setStatus(Boolean status) {
			this.status = status;
		}
		public BigDecimal getPreco() {
			return preco;
		}
		public void setPreco(BigDecimal preco) {
			this.preco = preco;
		}
		public Tenant getTenant() {
			return tenant;
		}
		public void setTenant(Tenant tenant) {
			this.tenant = tenant;
		}
		public BigDecimal getDesconto() {
			return desconto;
		}
		public void setDesconto(BigDecimal desconto) {
			this.desconto = desconto;
		}
		public BigDecimal getTotal() {
			return total;
		}
		public void setTotal(BigDecimal total) {
			this.total = total;
		}
		public String getAcesso() {
			return acesso;
		}
		public void setAcesso(String acesso) {
			this.acesso = acesso;
		}
		public AtendimentoItens(Exame exame, Integer codigo, Convenio convenio, Atendimento atendimento,
				OffsetDateTime dataatendimento, Boolean status, BigDecimal preco, Tenant tenant, BigDecimal desconto,
				BigDecimal total, String acesso) {
			super();
			this.exame = exame;
			this.codigo = codigo;
			this.convenio = convenio;
			this.atendimento = atendimento;
			this.dataatendimento = dataatendimento;
			this.status = status;
			this.preco = preco;
			this.tenant = tenant;
			this.desconto = desconto;
			this.total = total;
			this.acesso = acesso;
		}
		public AtendimentoItens() {
			super();
		}
	
		
		
}
