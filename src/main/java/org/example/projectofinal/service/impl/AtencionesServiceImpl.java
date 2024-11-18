package org.example.projectofinal.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.projectofinal.Repo.IAtencionesRepo;
import org.example.projectofinal.Repo.IClientesRepo;
import org.example.projectofinal.controller.RegistrarAtenciones;
import org.example.projectofinal.model.Atenciones;
import org.example.projectofinal.model.Clientes;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AtencionesServiceImpl {

    private final IClientesRepo repo;

    @Override
    public Mono<Atenciones> save (Atenciones atenciones){
        return repo.save(atenciones);
    }
    @Override
    public Mono<Atenciones> findById(String id){
        return repo.findById(id);
    }
    @Override
    public Mono<Atenciones> update(String id,Atenciones atenciones){
        return repo.save(atenciones);
    }
    @Override
    public Mono<Boolean>  delete(String id){
        return repo.deleteById(id).then(Mono.just(true));
    }

    @Override
    public Flux<Clientes> findAll(){
        return repo.findAll();
    }
}
