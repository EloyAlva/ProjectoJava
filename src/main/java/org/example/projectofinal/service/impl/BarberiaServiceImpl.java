package org.example.projectofinal.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.projectofinal.Repo.IBarberiaRep;
import org.example.projectofinal.model.Barberia;
import org.example.projectofinal.service.IBarberiaService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
@RequiredArgsConstructor
public class BarberiaServiceImpl implements IBarberiaService {

    private final IBarberiaRep repo;

    @Override
    public Mono<Barberia> save (Barberia barberia){
        return repo.save(barberia);
    }
    @Override
    public Mono<Barberia> findById(String id){
        return repo.findById(id);
    }
    @Override
    public Mono<Barberia> update(String id,Barberia barberia){
        return repo.save(barberia);
    }
    @Override
    public Mono<Boolean>  delete(String id){
        return repo.deleteById(id).then(Mono.just(true));
    }

    @Override
    public Flux<Barberia> findAll(){
        return repo.findAll();
    }
}
