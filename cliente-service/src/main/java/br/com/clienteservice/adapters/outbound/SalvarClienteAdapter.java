package br.com.clienteservice.adapters.outbound;

import br.com.clienteservice.adapters.inbound.mapper.Mapper;
import br.com.clienteservice.adapters.outbound.repository.ClienteRepository;
import br.com.clienteservice.application.core.domain.Cliente;
import br.com.clienteservice.application.ports.out.SalvarClientePortOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class SalvarClienteAdapter implements SalvarClientePortOut {

    @Autowired
    private ClienteRepository repository;

    @Autowired
    private Mapper mapper;


    @Override
    public Cliente salvar(Cliente cliente) {

        var entity = mapper.domainToEntity(cliente);
        entity.setAtivo(true);
        entity.setDataAlteracao(LocalDateTime.now());
        entity = repository.save(entity);
        return mapper.entityToDomain(entity);
    }
}
