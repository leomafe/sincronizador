package com.sync.api.domain.service;

import com.sync.api.application.constants.RabbitmqContants;
import dto.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SincronizacaoServiceImpl implements SincronizacaoService {

    @Autowired
    private RabbitTemplate rabbitTemplate;


    @Override
    public void enviar(SyncDto dto) {

       enviarCliente(dto.getCliente());
       enviarProdutos(dto.getProdutos());
       enviarEstoques(dto.getEstoques());
       enviarVenda(dto.getVenda());
    }

    private void enviarCliente(ClienteDto dto) {

        rabbitTemplate.convertAndSend( RabbitmqContants.FILA_CLIENTE, dto);
    }

    private void enviarProdutos(List<ProdutoDto> produtos) {

        rabbitTemplate.convertAndSend( RabbitmqContants.FILA_PRODUTOS, produtos);
    }

    private void enviarEstoques(List<EstoqueDto> estoques) {

        rabbitTemplate.convertAndSend( RabbitmqContants.FILA_ESTOQUE, estoques);
    }

    private void enviarVenda(VendaDto venda) {

        rabbitTemplate.convertAndSend( RabbitmqContants.FILA_VENDA, venda);
    }
}
