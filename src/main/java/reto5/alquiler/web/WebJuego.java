/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5.alquiler.web;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reto5.alquiler.modelo.Juego;
import reto5.alquiler.servicios.ServiciosJuego;

/**
 *
 * @author Equipo
 */
@RestController
@RequestMapping("/api/Game")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class WebJuego {
    @GetMapping("/holaMundo")
    public String saludad(){
    return "Hola Mundo Game";
    }

    
    @Autowired
    private ServiciosJuego servicio;
    @GetMapping("all")
    public List <Juego> getJuego(){
        return servicio.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Juego> getJuego(@PathVariable("id") int idJuego) {
        return servicio.getJuego(idJuego);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Juego save(@RequestBody Juego juego) {
        return servicio.save(juego);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Juego update(@RequestBody Juego juego) {
        return servicio.update(juego);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int juegoId) {
        return servicio.deleteJuego(juegoId);
    }
}
