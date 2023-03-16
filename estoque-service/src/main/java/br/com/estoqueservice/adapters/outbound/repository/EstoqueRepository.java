package br.com.estoqueservice.adapters.outbound.repository;

import br.com.estoqueservice.adapters.inbound.entity.EstoqueEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<EstoqueEntity, Long> {
}
