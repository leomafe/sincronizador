package br.com.estoqueservice.adapters.inbound.mapper;

import br.com.estoqueservice.adapters.inbound.entity.EstoqueEntity;
import br.com.estoqueservice.application.core.domain.Estoque;
import dto.EstoqueDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class Mapper {

    public List<Estoque> entityToDomain(List<EstoqueEntity> entities) {

        List<Estoque> estoques = new ArrayList<>();
        entities.forEach(entity -> {
            var estoque = new Estoque();
            BeanUtils.copyProperties(entity, estoque);
            estoques.add(estoque);

        });
        return estoques;


    }

    public List<Estoque> requestToDomain(List<EstoqueDto> request) {

        List<Estoque> estoques = new ArrayList<>();
        request.forEach(r -> {
            var estoque = new Estoque();
            BeanUtils.copyProperties(r, estoque);
            estoques.add(estoque);

        });
        return estoques;

    }

    public List<EstoqueEntity> domainToEntity(List<Estoque> estoques) {

        List<EstoqueEntity> entities = new ArrayList<>();

        estoques.forEach(estoque -> {
            var entity = new EstoqueEntity();
            BeanUtils.copyProperties(estoque, entity);
            entity.setDataAlteracao(LocalDateTime.now());
            entities.add(entity);

        });

       return entities;

    }
}
