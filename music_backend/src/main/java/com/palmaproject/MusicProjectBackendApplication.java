package com.palmaproject;

import com.palmaproject.dto.*;
import com.palmaproject.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MusicProjectBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicProjectBackendApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(MusicoService musicoService, ProductorService productorService, DiscograficaService discograficaService, CancionService cancionService) {
        return args -> {
            System.out.println("--- Inicializando datos de prueba ---");

            // Crear discografica
            DiscograficaRequestDTO discograficaDTO = new DiscograficaRequestDTO();
            discograficaDTO.setNombre("Sony Music");
            discograficaDTO.setDireccion("Hollywood Blvd 123");
            DiscograficaResponseDTO discografica = discograficaService.save(discograficaDTO);
            System.out.println("Guardada Discografica: " + discografica);

            // Crear productor
            ProductorRequestDTO productorDTO = new ProductorRequestDTO();
            productorDTO.setNombre("Rick");
            productorDTO.setApellido("Rubin");
            productorDTO.setEspecialidad("Rock Production");
            ProductorResponseDTO productor = productorService.save(productorDTO);
            System.out.println("Guardado Productor: " + productor);

            // Crear cancion
            CancionRequestDTO cancionDTO = new CancionRequestDTO();
            cancionDTO.setTitulo("Stairway to Heaven");
            cancionDTO.setProductorId(productor.getId());
            CancionResponseDTO cancion = cancionService.save(cancionDTO);
            System.out.println("Guardada Cancion: " + cancion);

            // Crear musico
            MusicoRequestDTO musicoDTO = new MusicoRequestDTO();
            musicoDTO.setNombre("Jimmy");
            musicoDTO.setApellido("Page");
            musicoDTO.setGenero("Rock");
            musicoDTO.setInstrumento("Guitar");
            MusicoResponseDTO musico = musicoService.save(musicoDTO);
            System.out.println("Guardado Musico: " + musico);
        };
    }
}