package br.com.produtoservice.adapters.inbound.consumer;

import br.com.produtoservice.adapters.inbound.mapper.Mapper;
import br.com.produtoservice.application.core.domain.Produto;
import br.com.produtoservice.application.ports.in.SalvarProdutoServicePortIn;
import dto.ProdutoDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProdutoConsumer {

    @Autowired
    private Mapper mapper;

    @Autowired
    SalvarProdutoServicePortIn servicePortIn;

    @RabbitListener(queues = "produto")
    private void consumidor(List<ProdutoDto> request) {
        List<Produto> produtos = mapper.requestToDomain(request);
        servicePortIn.salvarProduto(produtos);

    }
}

