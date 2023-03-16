package br.com.estoqueservice.application.core.service;

import br.com.estoqueservice.application.core.domain.Estoque;
import br.com.estoqueservice.application.ports.in.SalvarEstoqueServicePorIn;
import br.com.estoqueservice.application.ports.out.SalvarEstoquePorOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalvarEstoqueService implements SalvarEstoqueServicePorIn {

    @Autowired
    private SalvarEstoquePorOut salvarEstoquePorOut;


    @Override
    public List<Estoque> salvarEstoque(List<Estoque> estoques) {
        return salvarEstoquePorOut.salvar(estoques);
    }
}
