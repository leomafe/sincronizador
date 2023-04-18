package br.com.vendasservice.adapters.inbound.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class VendaRequest implements Serializable {

    private String id;

    private String idCliente;

    private Integer qtdItens;

    private BigDecimal valorTotal;

    private List<ItemVendaRequest> itensVenda;
}
