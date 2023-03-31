package com.project.coches.project_coches.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Entidad de marca coche
 */

@Getter @Setter
@Entity
@Table(name = "marca_coche")
public class MarcaCocheEntity {

    /**
     * No podemos usar el mero INT es muy primitivo
     * //@Column(name = "id" ) Cuando tiene un id con nombre diferente se pone el nombre aqui
     *
     */


    /**
     * id de la marca
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    /**
     * Descripcion de la marca
     */
    @Column(name = "descripcion")
    private String description;
}

