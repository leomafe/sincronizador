package br.com.estoqueservice.application.ports.out;

import br.com.estoqueservice.application.core.domain.Estoque;

import java.util.List;

public interface SalvarEstoquePorOut {

    List<Estoque> salvar(List<Estoque> estoque);
}
