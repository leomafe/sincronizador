package br.com.produtoservice.adapters.outbound.repository;

import br.com.produtoservice.adapters.inbound.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {
}
