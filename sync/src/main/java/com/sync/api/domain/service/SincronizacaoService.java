package com.sync.api.domain.service;


import dto.SyncDto;

public interface SincronizacaoService {

    void enviar(SyncDto dto);
}
