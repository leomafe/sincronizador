package com.sync.api.application.config;

import com.sync.api.application.constants.RabbitmqContants;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class RabbitMQConfig {

    private static final  String NOME_EXCHANGE = "amq.direct";
    private  AmqpAdmin amqpAdmin;

    public RabbitMQConfig(AmqpAdmin amqpAdmin) {
        this.amqpAdmin = amqpAdmin;
    }

    private  Queue fila(String nomeFila) {
        return new Queue(nomeFila, true, false, false);
    }

    private DirectExchange trocaDireta() {
        return new DirectExchange(NOME_EXCHANGE);
    }

    private Binding relacionamento (Queue queue, DirectExchange exchange) {

        return new Binding(queue.getName(), Binding.DestinationType.QUEUE, exchange.getName(), queue.getName(), null);

    }

    @PostConstruct
    private void criaFilas() {
      Queue filaCliente =  this.fila(RabbitmqContants.FILA_CLIENTE);
      Queue filaProduto =  this.fila(RabbitmqContants.FILA_PRODUTOS);
      Queue filaEstoque =  this.fila(RabbitmqContants.FILA_ESTOQUE);
      Queue filaVenda =  this.fila(RabbitmqContants.FILA_VENDA);

      DirectExchange troca = this.trocaDireta();

      Binding ligacaoCliente = this.relacionamento(filaCliente, troca);
      Binding ligacaoProduto = this.relacionamento(filaProduto, troca);
      Binding ligacaoEstoque = this.relacionamento(filaEstoque, troca);
      Binding ligacaoVenda = this.relacionamento(filaVenda, troca);

      amqpAdmin.declareQueue(filaCliente);
      amqpAdmin.declareQueue(filaProduto);
      amqpAdmin.declareQueue(filaEstoque);
      amqpAdmin.declareQueue(filaVenda);

      this.amqpAdmin.declareExchange(troca);

      this.amqpAdmin.declareBinding(ligacaoCliente);
      this.amqpAdmin.declareBinding(ligacaoProduto);
      this.amqpAdmin.declareBinding(ligacaoEstoque);
      this.amqpAdmin.declareBinding(ligacaoVenda);
    }

}
