package br.com.vendasservice.adapters.outbound.repository;

import br.com.vendasservice.adapters.inbound.entity.VendaEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VendaRepository extends MongoRepository<VendaEntity, String> {
}
