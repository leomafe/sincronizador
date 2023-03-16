package br.com.produtoservice.application.core.service;

import br.com.produtoservice.application.core.domain.Produto;
import br.com.produtoservice.application.ports.in.SalvarProdutoServicePortIn;
import br.com.produtoservice.application.ports.out.SalvarProdutoPortOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalvarProdutoService implements SalvarProdutoServicePortIn {

    @Autowired
    private SalvarProdutoPortOut salvarProdutoPortOut;


    @Override
    public List<Produto> salvarProduto(List<Produto> produtos) {
        return salvarProdutoPortOut.salvar(produtos);
    }
}
