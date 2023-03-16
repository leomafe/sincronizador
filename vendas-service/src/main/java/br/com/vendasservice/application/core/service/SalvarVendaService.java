package br.com.vendasservice.application.core.service;

import br.com.vendasservice.application.core.domain.Venda;
import br.com.vendasservice.application.ports.in.SalvarVendaPortIn;
import br.com.vendasservice.application.ports.out.SalvarVendaPortOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalvarVendaService implements SalvarVendaPortIn {

    @Autowired
    private SalvarVendaPortOut salvarVendaPortOut;


    @Override
    public Venda salvarVenda(Venda venda) {
        return salvarVendaPortOut.salvar(venda);
    }
}
