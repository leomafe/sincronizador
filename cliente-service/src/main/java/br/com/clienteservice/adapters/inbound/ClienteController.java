package br.com.clienteservice.adapters.inbound;

import br.com.clienteservice.adapters.inbound.mapper.Mapper;
import br.com.clienteservice.adapters.inbound.request.ClienteRequest;
import br.com.clienteservice.application.ports.in.SalvarClienteServicePortIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

//    @Autowired
//    private Mapper mapper;
//
//    @Autowired
//    private SalvarClienteServicePortIn service;
//
//    @PostMapping
//    public ResponseEntity<?> salvarCliente(@RequestBody ClienteRequest request) {
//
//        var cliente = mapper.requestToDomain(request);
//        cliente = service.salvarCliente(cliente);
//        return  ResponseEntity.created(URI.create("cliente/" + cliente.getId())).build();
//
//
//    }


}
