package dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
public class ProdutoDto implements Serializable {

    private Long id;

    private String nome;

    private BigDecimal preco;
}
