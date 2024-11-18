package org.example.projectofinal.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

public class Atenciones {
    @Id
    private String id;
    @Field
    private Date FechaAtencion;
    private Class Barberia;
    private Class Cliente;
    private Boolean Estado;
}
