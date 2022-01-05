package com.projeto.projeto.repository;

import org.springframework.data.repository.CrudRepository;

import com.projeto.projeto.model.Client;

public interface ClientRepository extends CrudRepository<Client, Long>{
    
}
