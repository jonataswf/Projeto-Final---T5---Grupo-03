package com.fiveitech.fiveitech.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

import com.fiveitech.fiveitech.model.Cliente;

public interface ClienteDao extends JpaRepository<Cliente, Integer> {
	Cliente getOne (Integer id);
	Optional<Cliente> findById (Long id);
	 
	 public List<Cliente> findByName(String name);
}
