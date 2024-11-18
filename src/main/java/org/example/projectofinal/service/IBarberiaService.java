package org.example.projectofinal.service;

import org.example.projectofinal.model.Barberia;
import org.example.projectofinal.model.Clientes;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IBarberiaService {
    Mono<Barberia> save (Barberia barberia);
    Mono<Barberia> findById(String id);
    Mono<Barberia>  update(String id,Barberia barberia);
    Mono<Boolean>  delete(String id);
    Flux<Barberia> findAll();
}
