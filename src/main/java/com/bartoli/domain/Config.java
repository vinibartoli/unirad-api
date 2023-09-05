package com.bartoli.domain;

public class Config {

	private Integer idconfig;
	private String version;
	
	
	public Integer getIdconfig() {
		return idconfig;
	}
	public void setIdconfig(Integer idconfig) {
		this.idconfig = idconfig;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Config(Integer idconfig, String version) {
		super();
		this.idconfig = idconfig;
		this.version = version;
	}
	public Config() {
		super();
	}
	
	
	
}
