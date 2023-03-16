package br.com.vendasservice.application.ports.in;

import br.com.vendasservice.application.core.domain.Venda;

public interface SalvarVendaPortIn {

    Venda salvarVenda(Venda venda);
}
