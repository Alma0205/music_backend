package com.palmaproject.mapper;

import com.palmaproject.dto.DiscograficaRequestDTO;
import com.palmaproject.dto.DiscograficaResponseDTO;
import com.palmaproject.model.Discografica;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DiscograficaMapper {

    DiscograficaResponseDTO toResponseDTO(Discografica discografica);

    Discografica toEntity(DiscograficaRequestDTO requestDTO);

    List<DiscograficaResponseDTO> toResponseDTOList(List<Discografica> discograficas);
}