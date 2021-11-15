/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5.alquiler.servicios;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reto5.alquiler.modelo.Juego;
import reto5.alquiler.repositorio.RepositorioJuego;

/**
 *
 * @author Equipo
 */
@Service
public class ServiciosJuego {
     @Autowired
    private RepositorioJuego metodosCrud;
    
    public List<Juego> getAll(){
        return metodosCrud.getAll();
    }
    
    public Optional<Juego> getJuego(int idJuego){
        return metodosCrud.getJuego(idJuego);
    }
    
    public Juego save(Juego juego){
        if(juego.getId()==null){
            return metodosCrud.save(juego);
        }else{
            Optional<Juego> evt=metodosCrud.getJuego(juego.getId());
            if(evt.isEmpty()){
                return metodosCrud.save(juego);
            }else{
                return juego;
            }
        }
    }
        public Juego update(Juego juego){
        if(juego.getId()!=null){
            Optional<Juego> e=metodosCrud.getJuego(juego.getId());
            if(!e.isEmpty()){
                if(juego.getName()!=null){
                    e.get().setName(juego.getName());
                }
                if(juego.getDeveloper()!=null){
                    e.get().setDeveloper(juego.getDeveloper());
                }
                if(juego.getYear()!=null){
                    e.get().setYear(juego.getYear());
                }
                if(juego.getDescription()!=null){
                    e.get().setDescription(juego.getDescription());
                }
                if(juego.getCategory()!=null){
                    e.get().setCategory(juego.getCategory());
                }
                metodosCrud.save(e.get());
                return e.get();
            }else{
                return juego;
            }
        }else{
            return juego;
        }
    }


    public boolean deleteJuego(int juegoId) {
        Boolean aBoolean = getJuego(juegoId).map(juego -> {
            metodosCrud.delete(juego);
            return true;
        }).orElse(false);
        return aBoolean;
    }
}
