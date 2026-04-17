package com.palmaproject.mapper;

import com.palmaproject.dto.CancionRequestDTO;
import com.palmaproject.dto.CancionResponseDTO;
import com.palmaproject.model.Cancion;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CancionMapper {

    @Mapping(target = "productorNombre", source = "productor.nombre")
    CancionResponseDTO toResponseDTO(Cancion cancion);

    @Mapping(target = "productor", ignore = true)
    Cancion toEntity(CancionRequestDTO requestDTO);

    List<CancionResponseDTO> toResponseDTOList(List<Cancion> canciones);
}