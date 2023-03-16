package br.com.produtoservice.adapters.inbound;


import br.com.produtoservice.adapters.inbound.mapper.Mapper;
import br.com.produtoservice.adapters.inbound.request.ProdutoRequest;
import br.com.produtoservice.application.ports.in.SalvarProdutoServicePortIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

//    @Autowired
//    private Mapper mapper;
//
//    @Autowired
//    private SalvarProdutoServicePortIn service;
//
//    @PostMapping
//    public ResponseEntity<?> salvarProduto(@RequestBody ProdutoRequest request) {
//
//        var produto = mapper.requestToDomain(request);
//        produto = service.salvarProduto(produto);
//        return ResponseEntity.created(URI.create("produto/" + produto.getId())).build();
//
//    }
}
