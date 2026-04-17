package com.palmaproject.mapper;

import com.palmaproject.dto.ProductorRequestDTO;
import com.palmaproject.dto.ProductorResponseDTO;
import com.palmaproject.model.Productor;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-04-17T16:20:17-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.46.0.v20260407-0427, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class ProductorMapperImpl implements ProductorMapper {

    @Override
    public ProductorResponseDTO toResponseDTO(Productor productor) {
        if ( productor == null ) {
            return null;
        }

        ProductorResponseDTO productorResponseDTO = new ProductorResponseDTO();

        productorResponseDTO.setId( productor.getId() );
        productorResponseDTO.setNombre( productor.getNombre() );
        productorResponseDTO.setApellido( productor.getApellido() );
        productorResponseDTO.setEspecialidad( productor.getEspecialidad() );

        return productorResponseDTO;
    }

    @Override
    public Productor toEntity(ProductorRequestDTO requestDTO) {
        if ( requestDTO == null ) {
            return null;
        }

        Productor productor = new Productor();

        productor.setNombre( requestDTO.getNombre() );
        productor.setApellido( requestDTO.getApellido() );
        productor.setEspecialidad( requestDTO.getEspecialidad() );

        return productor;
    }

    @Override
    public List<ProductorResponseDTO> toResponseDTOList(List<Productor> productores) {
        if ( productores == null ) {
            return null;
        }

        List<ProductorResponseDTO> list = new ArrayList<ProductorResponseDTO>( productores.size() );
        for ( Productor productor : productores ) {
            list.add( toResponseDTO( productor ) );
        }

        return list;
    }
}
