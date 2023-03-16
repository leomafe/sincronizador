package br.com.clienteservice.application.ports.out;

import br.com.clienteservice.application.core.domain.Cliente;

public interface SalvarClientePortOut {

    Cliente salvar(Cliente cliente);
}
