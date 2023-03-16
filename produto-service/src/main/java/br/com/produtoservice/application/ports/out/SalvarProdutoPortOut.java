package br.com.produtoservice.application.ports.out;

import br.com.produtoservice.application.core.domain.Produto;

import java.util.List;

public interface SalvarProdutoPortOut {

    List<Produto> salvar (List<Produto> produtos);
}
