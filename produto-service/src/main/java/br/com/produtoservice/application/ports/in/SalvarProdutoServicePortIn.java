package br.com.produtoservice.application.ports.in;

import br.com.produtoservice.application.core.domain.Produto;

import java.util.List;

public interface SalvarProdutoServicePortIn {

    List<Produto> salvarProduto(List<Produto> produtos);
}
