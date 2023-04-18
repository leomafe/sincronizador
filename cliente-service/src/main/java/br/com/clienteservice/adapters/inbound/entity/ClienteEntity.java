package br.com.clienteservice.adapters.inbound.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "clientes")
@Getter
@Setter
public class ClienteEntity {

    @Id
    private String id;

    private String nome;

    private String rua;

    private String bairro;

    private String cidade;

    private String estado;

    private String cep;

    private String referencia;

    private String observacao;

    private boolean ativo;

    private LocalDateTime dataAlteracao;


}


