package org.example.projectofinal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

//import lombok.AllArgsContructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "clientes")
public class Clientes {

    @Id
    private String id;
    @Field
    private String Nombre;
    private String Apellido;
    private String DNI;
    private int Edad;
}
