package com.fiveitech.fiveitech.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.fiveitech.fiveitech.model.Contas;

public interface ContasDao extends JpaRepository<Contas, Integer> {
	Contas getOne (Integer id);
	
}
