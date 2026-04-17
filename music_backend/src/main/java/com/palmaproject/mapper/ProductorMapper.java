package com.palmaproject.mapper;

import com.palmaproject.dto.ProductorRequestDTO;
import com.palmaproject.dto.ProductorResponseDTO;
import com.palmaproject.model.Productor;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductorMapper {

    ProductorResponseDTO toResponseDTO(Productor productor);

    Productor toEntity(ProductorRequestDTO requestDTO);

    List<ProductorResponseDTO> toResponseDTOList(List<Productor> productores);
}