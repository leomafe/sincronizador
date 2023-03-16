package br.com.clienteservice.application.core.service;


import br.com.clienteservice.application.core.domain.Cliente;
import br.com.clienteservice.application.ports.in.SalvarClienteServicePortIn;
import br.com.clienteservice.application.ports.out.SalvarClientePortOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalvarClienteService implements SalvarClienteServicePortIn {

    @Autowired
    private SalvarClientePortOut salvarClientePortOut;


    @Override
    public Cliente salvarCliente(Cliente cliente) {
        return salvarClientePortOut.salvar(cliente);
    }
}
