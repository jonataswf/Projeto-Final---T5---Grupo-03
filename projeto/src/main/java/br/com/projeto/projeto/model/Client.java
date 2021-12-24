package br.com.projeto.projeto.model;

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
@Table(name = "cliente")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod;
    
    @Column(name = "nome", length = 100, nullable = false)
    private String name;

    @Column(length = 11, nullable = false, unique = true)
    private Long cpf;

    @Column(length = 50, nullable = false, unique = true)
    private String email;

    @Column(name = "data_nascimento", length = 10, nullable = false)
    private String birthDate;

    @Column(name = "endereco", length = 100, nullable = false)
    private String address;


    @OneToMany(mappedBy = "ownerAccount")
    @JsonIgnoreProperties("ownerAccount")
    private List<Account> accounts;


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


    public Long getCpf() {
        return cpf;
    }


    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getBirthDate() {
        return birthDate;
    }


    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public List<Account> getAccounts() {
        return accounts;
    }


    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

}
