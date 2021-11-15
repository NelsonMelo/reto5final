//Categoria, Mensajes, Reservacion, Cliente, Juego
//1.Modelo o Entidad
//2.Interface
//3.Repositorio
//4.Servicios
//5.Controlador o Web

package reto5.alquiler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"reto5.alquiler.modelo"})
public class AlquilerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlquilerApplication.class, args);
	}

}
