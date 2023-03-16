package br.com.vendasservice.application.ports.out;

import br.com.vendasservice.application.core.domain.Venda;

public interface SalvarVendaPortOut {

    Venda salvar(Venda venda);
}
