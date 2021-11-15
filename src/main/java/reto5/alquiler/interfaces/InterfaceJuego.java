/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package reto5.alquiler.interfaces;

import org.springframework.data.repository.CrudRepository;
import reto5.alquiler.modelo.Juego;

/**
 *
 * @author Equipo
 */
public interface InterfaceJuego extends CrudRepository<Juego,Integer> {
    
}
