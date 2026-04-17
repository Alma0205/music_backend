package com.palmaproject.mapper;

import com.palmaproject.dto.MusicoRequestDTO;
import com.palmaproject.dto.MusicoResponseDTO;
import com.palmaproject.model.Musico;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-04-17T16:19:00-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.46.0.v20260407-0427, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class MusicoMapperImpl implements MusicoMapper {

    @Override
    public MusicoResponseDTO toResponseDTO(Musico musico) {
        if ( musico == null ) {
            return null;
        }

        MusicoResponseDTO musicoResponseDTO = new MusicoResponseDTO();

        musicoResponseDTO.setId( musico.getId() );
        musicoResponseDTO.setNombre( musico.getNombre() );
        musicoResponseDTO.setApellido( musico.getApellido() );
        musicoResponseDTO.setGenero( musico.getGenero() );
        musicoResponseDTO.setInstrumento( musico.getInstrumento() );

        return musicoResponseDTO;
    }

    @Override
    public Musico toEntity(MusicoRequestDTO requestDTO) {
        if ( requestDTO == null ) {
            return null;
        }

        Musico musico = new Musico();

        musico.setNombre( requestDTO.getNombre() );
        musico.setApellido( requestDTO.getApellido() );
        musico.setGenero( requestDTO.getGenero() );
        musico.setInstrumento( requestDTO.getInstrumento() );

        return musico;
    }

    @Override
    public List<MusicoResponseDTO> toResponseDTOList(List<Musico> musicos) {
        if ( musicos == null ) {
            return null;
        }

        List<MusicoResponseDTO> list = new ArrayList<MusicoResponseDTO>( musicos.size() );
        for ( Musico musico : musicos ) {
            list.add( toResponseDTO( musico ) );
        }

        return list;
    }
}
