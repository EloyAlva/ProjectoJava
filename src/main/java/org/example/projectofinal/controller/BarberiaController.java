package org.example.projectofinal.controller;

import lombok.RequiredArgsConstructor;
import org.example.projectofinal.model.Barberia;
import org.example.projectofinal.model.Clientes;
import org.example.projectofinal.service.IBarberiaService;
import org.example.projectofinal.service.IClientesService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@RestController
@RequestMapping("/barberia")
@RequiredArgsConstructor
public class BarberiaController {
    private final IBarberiaService service;
    @GetMapping
    public Flux<Barberia> findAll() {
        return service.findAll();
    }
    @GetMapping("/{id}")
    public Mono<Barberia> findById(@PathVariable String id) {
        return service.findById(id);
    }
    @PostMapping
    public Mono<Clientes> save(@RequestBody Barberia barberia) {
        return service.save(Barberia);
    }
    @PostMapping("/{id}")
    public Mono<Barberia> update(@PathVariable String id, @RequestBody Clientes clientes) {
        return Mono.just(barberia)
                .map(e->{
                    barberia.setId(id);
                    return e;
                })
                .flatMap(e-> service.update(id,e));

    }

    @DeleteMapping("/{id}")
    public Mono<Boolean> delete(@PathVariable String id) {
        return service.delete(id);
    }
}
