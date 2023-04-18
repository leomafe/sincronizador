package br.com.produtoservice.adapters.inbound.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(collection = "produto")
@Getter
@Setter
public class ProdutoEntity {

    @Id
    private String id;

    private String nome;

    private BigDecimal preco;
}
