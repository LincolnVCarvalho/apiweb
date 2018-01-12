package io.github.lincolnvcarvalho.ws.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.lincolnvcarvalho.ws.model.Cliente;
import io.github.lincolnvcarvalho.ws.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;
	
	// Negocio
	public Cliente cadastrar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	public Collection<Cliente> buscarTodos() {
		return clienteRepository.findAll();
	}

	public void excluir(Cliente cliente) {
		clienteRepository.delete(cliente);
	}

	public Cliente buscaPorID(Integer id) {
		return clienteRepository.findOne(id);
	}

	public Cliente alterar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
}
