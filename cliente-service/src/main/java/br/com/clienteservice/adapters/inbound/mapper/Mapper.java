package br.com.clienteservice.adapters.inbound.mapper;

import br.com.clienteservice.adapters.inbound.entity.ClienteEntity;
import br.com.clienteservice.adapters.inbound.request.ClienteRequest;
import br.com.clienteservice.application.core.domain.Cliente;
import dto.ClienteDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class Mapper {

    public Cliente entityToDomain (ClienteEntity entity) {

        var cliente = new Cliente();
        BeanUtils.copyProperties(entity, cliente);
        return cliente;

    }

    public Cliente requestToDomain (ClienteDto request) {

        var cliente = new Cliente();
        BeanUtils.copyProperties(request, cliente);
        return cliente;

    }

    public ClienteEntity domainToEntity (Cliente cliente) {

        var entity = new ClienteEntity();
        BeanUtils.copyProperties(cliente, entity);
        return entity;


    }
}
