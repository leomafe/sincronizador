package br.com.vendasservice.adapters.inbound;

import br.com.vendasservice.adapters.inbound.mapper.Mapper;
import br.com.vendasservice.application.ports.in.SalvarVendaPortIn;
import dto.VendaDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VendaConsumer {

    @Autowired
    private Mapper mapper;

    @Autowired
    SalvarVendaPortIn servicePortIn;

    @RabbitListener(queues = "venda")
    private void consumidor(VendaDto request) {
        var venda = mapper.requestToDomain(request);
        servicePortIn.salvarVenda(venda);

    }
}

