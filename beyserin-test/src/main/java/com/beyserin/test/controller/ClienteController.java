package com.beyserin.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beyserin.test.dto.ClienteDTO;
import com.beyserin.test.service.ClienteService;


@RestController
@RequestMapping(com.beyserin.test.config.ApiRoutes.ClIENTES)
public class ClienteController {
	
	
	private final ClienteService clienteService;
	
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
    
    @GetMapping("/{tipoDocumento}/{numeroDocumento}")
    public ResponseEntity<ClienteDTO> obtenerCliente(@PathVariable("tipoDocumento") String tipoDocumento, @PathVariable("numeroDocumento") String numeroDocumento) {
    	ClienteDTO cliente= clienteService.obtenerClienteMockeado(tipoDocumento, numeroDocumento);
    	return new ResponseEntity<ClienteDTO>(cliente,HttpStatus.OK);
    }
    

}
