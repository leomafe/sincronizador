package br.com.produtoservice.adapters.inbound.mapper;

import br.com.produtoservice.adapters.inbound.entity.ProdutoEntity;
import br.com.produtoservice.application.core.domain.Produto;
import dto.ProdutoDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Mapper {

    public List<Produto> entityToDomain(List<ProdutoEntity> entities) {

        List<Produto> produtos = new ArrayList<>();

        entities.forEach(entity -> {
            var produto = new Produto();
            BeanUtils.copyProperties(produto, entity);
            produtos.add(produto);
        });
        return  produtos;

    }

    public List<Produto> requestToDomain(List<ProdutoDto> request) {

        List<Produto> produtos = new ArrayList<>();

        request.forEach(r -> {
            var produto = new Produto();
            BeanUtils.copyProperties(r, produto);
            produtos.add(produto);
        });
        return  produtos;


    }

    public List<ProdutoEntity> domainToEntity(List<Produto> produtos) {

        List<ProdutoEntity> entities = new ArrayList<>();
        produtos.forEach(produto -> {
            var entity = new ProdutoEntity();
            BeanUtils.copyProperties(produto, entity);
            entities.add(entity);
        });

        return entities;

    }





}
