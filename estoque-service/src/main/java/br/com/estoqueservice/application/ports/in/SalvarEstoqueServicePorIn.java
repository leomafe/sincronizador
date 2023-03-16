package br.com.estoqueservice.application.ports.in;

import br.com.estoqueservice.application.core.domain.Estoque;

import java.util.List;

public interface SalvarEstoqueServicePorIn {

    List<Estoque> salvarEstoque(List<Estoque> estoque);
}
