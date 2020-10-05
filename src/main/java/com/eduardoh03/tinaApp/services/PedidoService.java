package com.eduardoh03.tinaApp.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardoh03.tinaApp.domain.Pedido;
import com.eduardoh03.tinaApp.repositories.PedidoRepository;
import com.eduardoh03.tinaApp.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;

	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
						"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
		}
}