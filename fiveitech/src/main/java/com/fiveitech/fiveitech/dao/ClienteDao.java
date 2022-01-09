package com.fiveitech.fiveitech.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiveitech.fiveitech.model.Cliente;

public interface ClienteDao extends JpaRepository<Cliente, Integer> {
	 Cliente getOne (Integer id);
}
