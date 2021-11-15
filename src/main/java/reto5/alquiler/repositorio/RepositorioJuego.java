/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5.alquiler.repositorio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reto5.alquiler.interfaces.InterfaceJuego;
import reto5.alquiler.modelo.Juego;

/**
 *
 * @author Equipo
 */
@Repository
public class RepositorioJuego {
     @Autowired
    private InterfaceJuego crud;
    

    public List<Juego> getAll(){
        return (List<Juego>) crud.findAll();       
    }
    
    public Optional <Juego> getJuego(int id){
        return crud.findById(id);
    }
    
    public Juego save(Juego juego){
        return crud.save(juego);
    }
      public void delete(Juego juego){
        crud.delete(juego);
    }
}
