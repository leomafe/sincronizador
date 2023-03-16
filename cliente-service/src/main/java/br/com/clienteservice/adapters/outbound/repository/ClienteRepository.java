package br.com.clienteservice.adapters.outbound.repository;

import br.com.clienteservice.adapters.inbound.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
}
