package dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class SyncDto implements Serializable {

    private VendaDto venda;

    private ClienteDto cliente;

    private List<ProdutoDto> produtos;

    private List<EstoqueDto> estoques;
}
