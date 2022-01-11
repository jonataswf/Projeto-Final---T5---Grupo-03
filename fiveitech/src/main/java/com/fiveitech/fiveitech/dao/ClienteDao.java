package com.fiveitech.fiveitech.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

import com.fiveitech.fiveitech.model.Cliente;

public interface ClienteDao extends JpaRepository<Cliente, Long> {
	Cliente getOne (Long id);
	Optional<Cliente> findById (Long id);
	 
}
