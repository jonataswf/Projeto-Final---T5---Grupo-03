package com.fiveitech.fiveitech.contas;

public enum tipo_conta {

	CONTA_CORRENTE("01 - Conta Corrente"),
	POUPANCA("02 - Conta Poupança"),
	INVESTIMENTO("03 - Investimento");
	
	private String tipo_conta;

	private tipo_conta(String tipo_conta) {
		this.setTipo_conta(tipo_conta);
	}
	
	public String getTipo_conta() {
		return tipo_conta;
	}

	public void setTipo_conta(String tipo_conta) {
		this.tipo_conta = tipo_conta;
	}
	
	

	
}
