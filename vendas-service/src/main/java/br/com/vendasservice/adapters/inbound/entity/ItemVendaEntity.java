package br.com.vendasservice.adapters.inbound.entity;


import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ItemVendaEntity {

    private Long idProduto;

    private Integer quantidade;

    private BigDecimal valorUnitario;

    private BigDecimal valorTotal;



}
