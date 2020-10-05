package com.eduardoh03.tinaApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduardoh03.tinaApp.domain.Pedido;
@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{
	}
