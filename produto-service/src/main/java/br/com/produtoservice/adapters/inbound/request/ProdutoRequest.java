package br.com.produtoservice.adapters.inbound.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
public class ProdutoRequest implements Serializable {

    private Long id;

    private String nome;

    private BigDecimal preco;
}
