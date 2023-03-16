package br.com.estoqueservice.adapters.inbound.request;

import constants.TipoMovimentacaoEstoque;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
public class EstoqueRequest implements Serializable {

    private Long id;

    private Integer quantidade;

    private  Long idProduto;

    private TipoMovimentacaoEstoque tipoMovimentacaoEstoque;

    private LocalDateTime dataAlteracao;
}
