package com.palmaproject.mapper;

import com.palmaproject.dto.MusicoRequestDTO;
import com.palmaproject.dto.MusicoResponseDTO;
import com.palmaproject.model.Musico;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MusicoMapper {

    MusicoResponseDTO toResponseDTO(Musico musico);

    Musico toEntity(MusicoRequestDTO requestDTO);

    List<MusicoResponseDTO> toResponseDTOList(List<Musico> musicos);
}