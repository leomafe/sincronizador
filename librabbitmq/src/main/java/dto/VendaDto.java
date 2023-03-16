package dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class VendaDto implements Serializable {

    private Long idCliente;

    private Integer qtdItens;

    private BigDecimal valorTotal;

    private List<ItemVendaDto> itensVenda;
}


