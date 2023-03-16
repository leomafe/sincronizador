package br.com.vendasservice.adapters.inbound.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name = "itemvenda")
@Getter
@Setter
public class ItemVendaEntity {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    private Long id;

    @Column(name = "id_produto", nullable = false)
    private Long idProduto;

    @Column(name = "quantidade")
    private Integer quantidade;

    @Column(name = "valor_unitario")
    private BigDecimal valorUnitario;

    @Column(name = "valor_total")
    private BigDecimal valorTotal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_venda")
    private VendaEntity venda;



}
