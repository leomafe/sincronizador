package br.com.produtoservice.adapters.inbound.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name = "produto")
@Getter
@Setter
public class ProdutoEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "preco", nullable = false)
    private BigDecimal preco;
}
