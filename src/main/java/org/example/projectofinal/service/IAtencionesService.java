package org.example.projectofinal.service;

import org.example.projectofinal.model.Atenciones;
import org.example.projectofinal.model.Clientes;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IAtencionesService {
    Mono<Atenciones> save (Atenciones atenciones);
    Mono<Atenciones> findById(String id);
    Mono<Atenciones>  update(String id,Atenciones atenciones);
    Mono<Boolean>  delete(String id);
    Flux<Atenciones> findAll();
}
