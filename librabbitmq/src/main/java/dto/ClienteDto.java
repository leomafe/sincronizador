package dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ClienteDto implements Serializable {

    private Long id;

    private String nome;

    private String rua;

    private String bairro;

    private String cidade;

    private String estado;

    private String cep;

    private String referencia;

    private String observacao;


}
