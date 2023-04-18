package br.com.clienteservice.adapters.inbound.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ClienteRequest implements Serializable {

    private String id;

    private String nome;

    private String rua;

    private String bairro;

    private String cidade;

    private String estado;

    private String cep;

    private String referencia;

    private String observacao;



}


