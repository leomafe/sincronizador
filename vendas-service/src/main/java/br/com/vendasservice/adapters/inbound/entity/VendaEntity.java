package br.com.vendasservice.adapters.inbound.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "venda")
@Getter
@Setter
public class VendaEntity {


    public VendaEntity() {
        this.itensVenda = new ArrayList<>();
    }

    @Id
    private String id;

    private String idCliente;

    private Integer qtdItens;

    private BigDecimal valorTotal;

    private List<ItemVendaEntity> itensVenda;

}
