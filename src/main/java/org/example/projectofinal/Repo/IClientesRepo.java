package org.example.projectofinal.Repo;
import org.example.projectofinal.model.Clientes;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface IClientesRepo extends ReactiveMongoRepository<Clientes,String>{
}
