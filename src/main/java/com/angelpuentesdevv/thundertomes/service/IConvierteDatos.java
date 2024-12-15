package com.angelpuentesdevv.thundertomes.service;

//Interfaz que debe implementar la clase que va a convertir los métodos
public interface IConvierteDatos {
    /*
    La clase que implemente esta interfaz debe tener este método de tipo genérico que recibe un json
    y una clase de tipo genérico
    */
    <T> T obtenerDatos(String json, Class<T> clase);
}
