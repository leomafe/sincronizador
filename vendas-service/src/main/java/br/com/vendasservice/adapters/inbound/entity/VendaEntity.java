package br.com.vendasservice.adapters.inbound.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "venda")
@Getter
@Setter
public class VendaEntity {


    public VendaEntity() {
        this.itensVenda = new ArrayList<>();
    }

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    private Long id;

    @Column(name = "id_cliente")
    private Long idCliente;

    @Column(name = "qtd_itens")
    private Integer qtdItens;

    @Column(name = "valor_total")
    private BigDecimal valorTotal;

    @OneToMany(mappedBy = "venda", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemVendaEntity> itensVenda;

}
