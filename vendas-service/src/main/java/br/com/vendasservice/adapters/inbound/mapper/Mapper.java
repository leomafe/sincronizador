package br.com.vendasservice.adapters.inbound.mapper;

import br.com.vendasservice.adapters.inbound.entity.ItemVendaEntity;
import br.com.vendasservice.adapters.inbound.entity.VendaEntity;
import br.com.vendasservice.application.core.domain.Venda;
import dto.ItemVendaDto;
import dto.VendaDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Mapper {

    public Venda domainToEntity(VendaEntity entity) {

        Venda venda = new Venda();
        BeanUtils.copyProperties(entity, venda);
        return venda;
    }

    public Venda requestToDomain(VendaDto request) {

        Venda venda = new Venda();
        BeanUtils.copyProperties(request, venda);
        return venda;
    }

    public VendaEntity domainToEntity(Venda venda) {

        VendaEntity entity = new VendaEntity();
        BeanUtils.copyProperties(venda, entity );
        List<ItemVendaDto> itemVendas =  venda.getItensVenda();
        itemVendas.forEach( itensVenda -> {
            ItemVendaEntity itemVendaEntity = new ItemVendaEntity();
            BeanUtils.copyProperties(itensVenda, itemVendaEntity);
            entity.getItensVenda().add(itemVendaEntity);
        });

        return entity;
    }
}
