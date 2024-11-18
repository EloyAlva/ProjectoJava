package org.example.projectofinal.Repo;

import org.example.projectofinal.model.Clientes;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IAtencionesRepo extends ReactiveMongoRepository<Clientes,String> {

}
