package org.example.projectofinal.controller;

import org.example.projectofinal.Repo.IClientesRepo;
import org.example.projectofinal.model.Clientes;
import org.example.projectofinal.service.IClientesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final IClientesService service;
    @GetMapping
    public Flux<Clientes> findAll() {
        return service.findAll();
    }
    @GetMapping("/{id}")
    public Mono<Clientes> findById(@PathVariable String id) {
        return service.findById(id);
    }
    @PostMapping
    public Mono<Clientes> save(@RequestBody Clientes clientes) {
        return service.save(clientes);
    }
    @PostMapping("/{id}")
    public Mono<Clientes> update(@PathVariable String id, @RequestBody Clientes clientes) {
        return Mono.just(clientes)
                .map(e->{
                    clientes.setId(id);
                    return e;
                })
                .flatMap(e-> service.update(id,e));

    }

    @DeleteMapping("/{id}")
    public Mono<Boolean> delete(@PathVariable String id) {
        return service.delete(id);
    }
}
