package br.com.vendasservice.adapters.inbound;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/vendas")
public class VendaController {

//    @Autowired
//    private Mapper mapper;
//
//    @Autowired
//    private SalvarVendaPortIn service;
//
//
//    @PostMapping
//    public ResponseEntity<?> salvarVenda(@RequestBody VendaRequest request) {
//
//        var venda = mapper.requestToDomain(request);
//        venda = service.salvarVenda(venda);
//        return ResponseEntity.created(URI.create("/venda" + venda.getId())).build();
//
//
//    }
}
