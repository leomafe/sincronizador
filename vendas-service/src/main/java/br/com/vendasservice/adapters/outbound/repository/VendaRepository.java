package br.com.vendasservice.adapters.outbound.repository;

import br.com.vendasservice.adapters.inbound.entity.VendaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepository extends JpaRepository<VendaEntity, Long> {
}
