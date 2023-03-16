package br.com.clienteservice.application.ports.in;

import br.com.clienteservice.application.core.domain.Cliente;

public interface SalvarClienteServicePortIn {

    Cliente salvarCliente(Cliente cliente);
}
