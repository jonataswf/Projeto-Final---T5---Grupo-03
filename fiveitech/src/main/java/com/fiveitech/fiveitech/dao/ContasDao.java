package com.fiveitech.fiveitech.dao;


import java.util.Optional;

import com.fiveitech.fiveitech.model.Contas;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContasDao extends JpaRepository<Contas, Long> {
	Optional<Contas>  findById(Long id);
	Contas getOne (Long id);

}
