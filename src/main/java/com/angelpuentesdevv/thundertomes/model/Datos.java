package com.angelpuentesdevv.thundertomes.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

//Propiedad para ignorar las propiedades que no se mapeen
@JsonIgnoreProperties(ignoreUnknown = true)
public record Datos(
        //Este record va a mapear una lista de tipo DatosLibros
        @JsonAlias("results") List<DatosLibros> resultados
) {
}
