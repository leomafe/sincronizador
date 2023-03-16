package br.com.vendasservice.adapters.outbound;

import br.com.vendasservice.adapters.inbound.mapper.Mapper;
import br.com.vendasservice.adapters.outbound.repository.VendaRepository;
import br.com.vendasservice.application.core.domain.Venda;
import br.com.vendasservice.application.ports.out.SalvarVendaPortOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component

public class SalvarVendaAdapter implements SalvarVendaPortOut {

    @Autowired
    private VendaRepository repository;

    @Autowired
    private Mapper mapper;

    @Transactional
    @Override
    public Venda salvar(Venda venda) {

        var entity = mapper.domainToEntity(venda);
        entity = repository.save(entity);
        return mapper.domainToEntity(entity);
    }
}
