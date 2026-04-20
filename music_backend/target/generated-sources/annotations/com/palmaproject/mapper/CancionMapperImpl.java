package com.palmaproject.mapper;

import com.palmaproject.dto.CancionRequestDTO;
import com.palmaproject.dto.CancionResponseDTO;
import com.palmaproject.model.Cancion;
import com.palmaproject.model.Productor;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-04-20T15:43:21-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class CancionMapperImpl implements CancionMapper {

    @Override
    public CancionResponseDTO toResponseDTO(Cancion cancion) {
        if ( cancion == null ) {
            return null;
        }

        CancionResponseDTO cancionResponseDTO = new CancionResponseDTO();

        cancionResponseDTO.setProductorNombre( cancionProductorNombre( cancion ) );
        cancionResponseDTO.setId( cancion.getId() );
        cancionResponseDTO.setTitulo( cancion.getTitulo() );

        return cancionResponseDTO;
    }

    @Override
    public Cancion toEntity(CancionRequestDTO requestDTO) {
        if ( requestDTO == null ) {
            return null;
        }

        Cancion cancion = new Cancion();

        cancion.setTitulo( requestDTO.getTitulo() );

        return cancion;
    }

    @Override
    public List<CancionResponseDTO> toResponseDTOList(List<Cancion> canciones) {
        if ( canciones == null ) {
            return null;
        }

        List<CancionResponseDTO> list = new ArrayList<CancionResponseDTO>( canciones.size() );
        for ( Cancion cancion : canciones ) {
            list.add( toResponseDTO( cancion ) );
        }

        return list;
    }

    private String cancionProductorNombre(Cancion cancion) {
        if ( cancion == null ) {
            return null;
        }
        Productor productor = cancion.getProductor();
        if ( productor == null ) {
            return null;
        }
        String nombre = productor.getNombre();
        if ( nombre == null ) {
            return null;
        }
        return nombre;
    }
}
