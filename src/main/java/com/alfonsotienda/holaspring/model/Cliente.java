package com.alfonsotienda.holaspring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
@Table(name = "cliente")

public class Cliente ( 
    @IdClass// prima d key no nula
    @GeneratedValue(strategy = GenerationType.AUTO) // autoincrement
    private Integer Id;

    @NotNull
    private String nombre;

    @NotNull //no nulo
    @Size()
    private String apellido;

    @NotNull
    @Min(value = 16) //limita edad a más de 15
    @Max(value = 65) // y menor de 65. sino saltará error 500
    private Integer edad;
    )

    public Cliente() {}
        
    public Cliente(@NotNull final String nombre, 
                    @NotNull final String apellido, 
                    @NotNull final Integer edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
        }
    }
 
