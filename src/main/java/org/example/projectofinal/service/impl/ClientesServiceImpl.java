package org.example.projectofinal.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.projectofinal.Repo.IClientesRepo;
import org.example.projectofinal.model.Clientes;
import org.example.projectofinal.service.IClientesService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
@RequiredArgsConstructor
public class ClientesServiceImpl implements IClientesService {
    private final IClientesRepo repo;
    @Override
    public Mono<Clientes> save (Clientes clientes){
        return repo.save(clientes);
    }
    @Override
    public Mono<Clientes> findById(String id){
        return repo.findById(id);
    }
    @Override
    public Mono<Clientes> update(String id,Clientes clientes){
        return repo.save(clientes);
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
