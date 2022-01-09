package com.fiveitech.fiveitech.sexos;

public enum Sexos {
	
	MASCULINO("Masculino"),
	FEMININO("Feminino");
	
	private String sexos;
	
	private Sexos(String sexos) {
		this.setSexos(sexos);
	}

	public String getSexos() {
		return sexos;
	}

	public void setSexos(String sexos) {
		this.sexos = sexos;
	}
	
}
