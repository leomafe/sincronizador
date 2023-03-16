package br.com.estoqueservice.adapters.inbound;

import br.com.estoqueservice.adapters.inbound.mapper.Mapper;
import br.com.estoqueservice.application.core.domain.Estoque;
import br.com.estoqueservice.application.ports.in.SalvarEstoqueServicePorIn;
import dto.EstoqueDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EstoqueConsumer {

    @Autowired
    private Mapper mapper;

    @Autowired
    SalvarEstoqueServicePorIn servicePortIn;

    @RabbitListener(queues = "estoque")
    private void consumidor(List<EstoqueDto> request) {
        List<Estoque> estoques = mapper.requestToDomain(request);
        servicePortIn.salvarEstoque(estoques);

    }
}

