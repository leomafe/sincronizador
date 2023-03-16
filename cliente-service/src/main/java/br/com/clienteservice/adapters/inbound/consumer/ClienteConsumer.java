package br.com.clienteservice.adapters.inbound.consumer;

import br.com.clienteservice.adapters.inbound.mapper.Mapper;
import br.com.clienteservice.adapters.inbound.request.ClienteRequest;
import br.com.clienteservice.application.ports.in.SalvarClienteServicePortIn;
import dto.ClienteDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClienteConsumer {

    @Autowired
    private Mapper mapper;

    @Autowired
    SalvarClienteServicePortIn servicePortIn;

    @RabbitListener(queues = "cliente")
    private void consumidor(ClienteDto request) {
        var cliente = mapper.requestToDomain(request);
        servicePortIn.salvarCliente(cliente);

    }
}

