package br.com.projeto.projeto.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.projeto.projeto.model.Account;

public interface AccountRepository extends CrudRepository<Account, Long>{
    
}
