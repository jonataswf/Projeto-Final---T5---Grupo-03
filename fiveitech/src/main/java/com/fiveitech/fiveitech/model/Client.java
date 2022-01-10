package com.fiveitech.fiveitech.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod;
    
    @Column(name = "nome", length = 100, nullable = false)
    private String name;

     @Column(length = 13, nullable = false, unique = true)
    private String cpf;

    @Column(name = "profissao", length = 100, nullable = false)
    private String profissao;

    @Column(name = "cep", length = 9, nullable = false, unique = true)
    private String cep;



    @Column(name = "endereco", length = 150, nullable = false)
    private String endereco;

    @Column(name = "complemento", length = 100, nullable = false)
    private String complemento;

    @Column(length = 10, nullable = false, unique = true)
    private Long numero;

    @Column(name = "bairro", length = 50, nullable = false)
    private String bairro;

    @Column(name = "cidade", length = 120, nullable = false)
    private String cidade;

    @Column(name = "uf", length = 2, nullable = false)
    private String uf;

    @Column(length = 15, nullable = false, unique = true)
    private String celular;

    @Column(name = "sexo", length = 15, nullable = false)
    private String sexo;

    @Column(name = "data_nascimento", length = 10, nullable = false)
    private String data_nascimento;

    @OneToMany(mappedBy = "ownerAccount")
    @JsonIgnoreProperties("ownerAccount")

    private List<Cont> conta;
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Long getCod() {
        return cod;
    }

    public void setCod(Long cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public List<Cont> getConta() {
        return conta;
    }

    public void setConta(List<Cont> conta) {
        this.conta = conta;
    }

   



}
