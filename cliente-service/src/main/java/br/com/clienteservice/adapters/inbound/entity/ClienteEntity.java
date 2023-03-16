package br.com.clienteservice.adapters.inbound.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "cliente")
@Getter
@Setter
public class ClienteEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nome", nullable = false,length = 100)
    private String nome;

    @Column(name = "rua", nullable = true, length = 100)
    private String rua;

    @Column(name = "bairro", nullable = true, length = 100)
    private String bairro;

    @Column(name = "cidade", nullable = true, length = 100)
    private String cidade;

    @Column(name = "estado", nullable = true, length = 2)
    private String estado;

    @Column(name = "cep", nullable = true, length = 8)
    private String cep;

    @Column(name = "referencia", nullable = true, length = 100)
    private String referencia;

    @Column(name = "observacao", nullable = true)
    private String observacao;

    @Column(name = "ativo", nullable = false)
    private boolean ativo;

    @Column(name = "data_alteracao", nullable = false)
    private LocalDateTime dataAlteracao;


}


