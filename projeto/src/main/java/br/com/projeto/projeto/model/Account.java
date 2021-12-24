package br.com.projeto.projeto.model;

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
@Table(name = "conta")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero", length = 8, nullable = false, unique = true)
    private Integer accountNumber;

    @Column(name = "agencia", length = 4, nullable = false)
    private Integer agency;

    @Column(name = "tipo_conta", length = 20, nullable = false)
    private String typeAccount;

    @Column(name = "saldo", nullable = false)
    private Double balance;

    @ManyToOne
    @JoinColumn(name = "titular_conta")
    @JsonIgnoreProperties("accounts")
    private Client ownerAccount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getAgency() {
        return agency;
    }

    public void setAgency(Integer agency) {
        this.agency = agency;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Client getOwnerAccount() {
        return ownerAccount;
    }

    public void setOwnerAccount(Client ownerAccount) {
        this.ownerAccount = ownerAccount;
    }
}
