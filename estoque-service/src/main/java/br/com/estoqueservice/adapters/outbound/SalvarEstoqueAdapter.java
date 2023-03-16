package br.com.estoqueservice.adapters.outbound;

import br.com.estoqueservice.adapters.inbound.entity.EstoqueEntity;
import br.com.estoqueservice.adapters.inbound.mapper.Mapper;
import br.com.estoqueservice.adapters.outbound.repository.EstoqueRepository;
import br.com.estoqueservice.application.core.domain.Estoque;
import br.com.estoqueservice.application.ports.out.SalvarEstoquePorOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalvarEstoqueAdapter implements SalvarEstoquePorOut {

    @Autowired
    private EstoqueRepository repository;

    @Autowired
    private Mapper mapper;


    @Override
    public List<Estoque> salvar(List<Estoque> estoques) {

        List<EstoqueEntity> entities = mapper.domainToEntity(estoques);
        entities = repository.saveAll(entities);
        return mapper.entityToDomain(entities);
    }
}
