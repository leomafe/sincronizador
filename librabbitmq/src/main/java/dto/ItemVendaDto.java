package dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
public class ItemVendaDto implements Serializable {

    private Long idProduto;

    private Integer quantidade;

    private BigDecimal valorUnitario;

    private BigDecimal valorTotal;

}
