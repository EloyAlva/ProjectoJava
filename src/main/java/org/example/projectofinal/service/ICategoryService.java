package org.example.projectofinal.service;

import org.example.projectofinal.model.Clientes;
import reactor.core.publisher.Mono;

public interface ICategoryService {
    Mono<Clientes>  save (Clientes clientes);
    Mono<Clientes> findById(Integer id);
    Mono<Clientes>  update(Integer id,Clientes clientes);
    Mono<Clientes>  delete(Integer id);
    Mono<Clientes>  findAll();
}
