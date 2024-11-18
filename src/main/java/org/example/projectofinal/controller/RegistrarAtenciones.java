package org.example.projectofinal.controller;

import lombok.RequiredArgsConstructor;
import org.example.projectofinal.model.Clientes;
import org.example.projectofinal.service.IClientesService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/RegistrarAtenciones")
@RequiredArgsConstructor
public class RegistrarAtenciones {
    private final IClientesService service;
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
}
