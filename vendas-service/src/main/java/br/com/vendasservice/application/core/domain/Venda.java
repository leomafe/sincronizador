package br.com.vendasservice.application.core.domain;


import dto.ItemVendaDto;

import java.math.BigDecimal;
import java.util.List;

public class Venda {

    private Long idCliente;

    private Integer qtdItens;

    private BigDecimal valorTotal;

    private List<ItemVendaDto> itensVenda;


    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(Integer qtdItens) {
        this.qtdItens = qtdItens;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<ItemVendaDto> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(List<ItemVendaDto> itensVenda) {
        this.itensVenda = itensVenda;
    }
}
