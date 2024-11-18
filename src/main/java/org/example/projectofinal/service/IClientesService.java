package org.example.projectofinal.service;

import org.example.projectofinal.Repo.IClientesRepo;
import org.example.projectofinal.model.Clientes;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IClientesService {
    Mono<Clientes>  save (Clientes clientes);
    Mono<Clientes> findById(String id);
    Mono<Clientes>  update(String id,Clientes clientes);
    Mono<Boolean>  delete(String id);
    Flux<Clientes>  findAll();
}
