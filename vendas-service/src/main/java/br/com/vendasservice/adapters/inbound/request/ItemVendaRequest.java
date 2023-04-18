package br.com.vendasservice.adapters.inbound.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
public class ItemVendaRequest implements Serializable {

    private String idProduto;

    private Integer quantidade;

    private BigDecimal valorUnitario;

    private BigDecimal valorTotal;

}
