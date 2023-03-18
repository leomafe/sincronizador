package com.sync.api.application.endpoint;

import com.sync.api.domain.service.SincronizacaoService;
import dto.SyncDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.net.URI;

@Component
@Path("/sincronizar")
public class SyncEndPoint {

    @Autowired
    private SincronizacaoService service;

    @POST
    public Response sincronizar(SyncDto dto) {
        service.enviar(dto);
        return  Response.created(URI.create("/sincronizar")).build();
    }


}
