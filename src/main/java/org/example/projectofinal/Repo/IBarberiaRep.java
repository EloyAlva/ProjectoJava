package org.example.projectofinal.Repo;

import org.example.projectofinal.model.Barberia;
import org.example.projectofinal.model.Clientes;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IBarberiaRep extends ReactiveMongoRepository<Barberia,String> {
}
