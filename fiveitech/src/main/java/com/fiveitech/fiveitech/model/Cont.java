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
@Table(name = "cont")
public class Cont {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero", length = 8, nullable = false, unique = true)
    private Integer numeroconta;

    @Column(name = "agencia", length = 4, nullable = false)
    private Integer agencia;

    @Column(name = "tipo_conta", length = 20, nullable = false)
    private String tipoconta;

    @Column(name = "saldo", nullable = false)
    private Double saldo;

    public Integer getNumeroconta() {
        return numeroconta;
    }

    public void setNumeroconta(Integer numeroconta) {
        this.numeroconta = numeroconta;
    }

    public String getTipoconta() {
        return tipoconta;
    }

    public void setTipoconta(String tipoconta) {
        this.tipoconta = tipoconta;
    }

    @ManyToOne
    @JoinColumn(name = "titular_conta")
    @JsonIgnoreProperties("conta")
    private Client ownerAccount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Client getOwnerAccount() {
        return ownerAccount;
    }

    public void setOwnerAccount(Client ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

}
