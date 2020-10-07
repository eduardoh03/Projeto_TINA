package com.eduardoh03.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduardoh03.cursomc.domain.Cidade;
@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>{
	}
