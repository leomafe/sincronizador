package dto;

import constants.TipoMovimentacaoEstoque;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class EstoqueDto implements Serializable {

    private Integer quantidade;

    private  String idProduto;

    private TipoMovimentacaoEstoque tipoMovimentacaoEstoque;

}
