package br.com.estoqueservice.adapters.inbound.entity;

import constants.TipoMovimentacaoEstoque;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "estoque")
@Getter
@Setter
public class EstoqueEntity {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    private Long id;

    @Column(name = "quantidade", nullable = false, length = 100)
    private Integer quantidade;

    @Column(name = "id_produto", nullable = false)
    private  Long idProduto;

    @Column(name = "tipo_movimentacao")
    @Enumerated(EnumType.STRING)
    private TipoMovimentacaoEstoque tipoMovimentacaoEstoque;

    @Column(name = "data_alteracao", nullable = false)
    private LocalDateTime dataAlteracao;
}
