package br.com.estoqueservice.adapters.outbound.repository;

import br.com.estoqueservice.adapters.inbound.entity.EstoqueEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EstoqueRepository extends MongoRepository<EstoqueEntity, String> {
}
