package br.com.estoqueservice.adapters.inbound.entity;

import constants.TipoMovimentacaoEstoque;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "estoque")
@Getter
@Setter
public class EstoqueEntity {

    @Id
    private String id;

    private Integer quantidade;

    private  Long idProduto;

    private TipoMovimentacaoEstoque tipoMovimentacaoEstoque;

    private LocalDateTime dataAlteracao;
}
