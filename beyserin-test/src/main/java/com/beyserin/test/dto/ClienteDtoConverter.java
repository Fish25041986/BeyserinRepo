package com.beyserin.test.dto;

import com.beyserin.test.entity.Cliente;

public class ClienteDtoConverter {
	
	public ClienteDTO clienteDTO(Cliente cliente) {
		
		return new ClienteDTO(
				cliente.getPrimerNombre(), cliente.getSegundoNombre(),
				cliente.getPrimerApellido(), cliente.getSegundoApellido(),
				cliente.getTelefono(), cliente.getDireccion(),
				cliente.getCiudad());
	}

}
