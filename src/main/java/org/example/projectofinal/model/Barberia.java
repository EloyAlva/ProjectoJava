package org.example.projectofinal.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class Barberia {
    @Id
    private String id;
    @Field
    private String Nombre;
    private String Apellido;
    private Integer AniosExperiencia;
    private Boolean Estado;
}
