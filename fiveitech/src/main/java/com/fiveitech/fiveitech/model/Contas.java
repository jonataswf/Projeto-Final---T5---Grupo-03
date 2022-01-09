package com.fiveitech.fiveitech.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "contas")
public class Contas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "numero")
    private Integer numeroconta;

    @Column(name = "agencia")
    private Integer agencia;

    @Column(name = "tipo_conta")
    private String tipoconta;
    
    @Column(name = "saldo")
    private Double saldo;

    
    

    public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public Integer getNumeroconta() {
		return numeroconta;
	}




	public void setNumeroconta(Integer numeroconta) {
		this.numeroconta = numeroconta;
	}




	public Integer getAgencia() {
		return agencia;
	}




	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}




	public String getTipoconta() {
		return tipoconta;
	}




	public void setTipoconta(String tipoconta) {
		this.tipoconta = tipoconta;
	}



	public Double getSaldo() {
		return saldo;
	}




	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@ManyToOne
    @JoinColumn(name = "titular_conta")
    @JsonIgnoreProperties("contas")
    private Cliente ownerAccount;

   

}
