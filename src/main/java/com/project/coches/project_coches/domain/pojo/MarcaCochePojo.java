package com.project.coches.project_coches.domain.pojo;


import lombok.Getter;
import lombok.Setter;

/**
 * Pogo de marca coche
 */
@Getter @Setter
public class MarcaCochePojo {

    /**
     * id de la marca
     */
    private Integer id;

    /**
     * Descripcion de la marca
     */
    private String description;
}
