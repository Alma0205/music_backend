package com.palmaproject.mapper;

import com.palmaproject.dto.DiscograficaRequestDTO;
import com.palmaproject.dto.DiscograficaResponseDTO;
import com.palmaproject.model.Discografica;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-04-20T15:43:22-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class DiscograficaMapperImpl implements DiscograficaMapper {

    @Override
    public DiscograficaResponseDTO toResponseDTO(Discografica discografica) {
        if ( discografica == null ) {
            return null;
        }

        DiscograficaResponseDTO discograficaResponseDTO = new DiscograficaResponseDTO();

        discograficaResponseDTO.setId( discografica.getId() );
        discograficaResponseDTO.setNombre( discografica.getNombre() );
        discograficaResponseDTO.setDireccion( discografica.getDireccion() );

        return discograficaResponseDTO;
    }

    @Override
    public Discografica toEntity(DiscograficaRequestDTO requestDTO) {
        if ( requestDTO == null ) {
            return null;
        }

        Discografica discografica = new Discografica();

        discografica.setNombre( requestDTO.getNombre() );
        discografica.setDireccion( requestDTO.getDireccion() );

        return discografica;
    }

    @Override
    public List<DiscograficaResponseDTO> toResponseDTOList(List<Discografica> discograficas) {
        if ( discograficas == null ) {
            return null;
        }

        List<DiscograficaResponseDTO> list = new ArrayList<DiscograficaResponseDTO>( discograficas.size() );
        for ( Discografica discografica : discograficas ) {
            list.add( toResponseDTO( discografica ) );
        }

        return list;
    }
}
