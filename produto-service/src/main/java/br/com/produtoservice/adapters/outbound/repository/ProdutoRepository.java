package br.com.produtoservice.adapters.outbound.repository;

import br.com.produtoservice.adapters.inbound.entity.ProdutoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdutoRepository extends MongoRepository<ProdutoEntity, String> {
}
