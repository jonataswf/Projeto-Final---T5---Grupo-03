package com.projeto.projeto.repository;

import org.springframework.data.repository.CrudRepository;

import com.projeto.projeto.model.Account;

public interface AccountRepository extends CrudRepository<Account, Long>{
    
}
