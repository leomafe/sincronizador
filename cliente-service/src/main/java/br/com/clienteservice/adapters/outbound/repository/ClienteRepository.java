package br.com.clienteservice.adapters.outbound.repository;

import br.com.clienteservice.adapters.inbound.entity.ClienteEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<ClienteEntity, String> {
}
