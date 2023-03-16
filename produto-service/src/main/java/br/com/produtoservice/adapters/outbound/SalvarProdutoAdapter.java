package br.com.produtoservice.adapters.outbound;

import br.com.produtoservice.adapters.inbound.mapper.Mapper;
import br.com.produtoservice.adapters.outbound.repository.ProdutoRepository;
import br.com.produtoservice.application.core.domain.Produto;
import br.com.produtoservice.application.ports.out.SalvarProdutoPortOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalvarProdutoAdapter implements SalvarProdutoPortOut {

    @Autowired
    private ProdutoRepository repository;

    @Autowired
    private Mapper mapper;

    @Override
    public List<Produto> salvar(List<Produto> produtos) {

        var entities = mapper.domainToEntity(produtos);
        entities = repository.saveAll(entities);
        return mapper.entityToDomain(entities);
    }
}
