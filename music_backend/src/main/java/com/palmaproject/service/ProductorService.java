package com.palmaproject.service;

import com.palmaproject.dto.ProductorRequestDTO;
import com.palmaproject.dto.ProductorResponseDTO;
import com.palmaproject.exception.ResourceNotFoundException;
import com.palmaproject.mapper.ProductorMapper;
import com.palmaproject.model.Productor;
import com.palmaproject.repository.ProductorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductorService {

    @Autowired
    private ProductorRepository repository;

    @Autowired
    private ProductorMapper mapper;

    public List<ProductorResponseDTO> findAll() {
        List<Productor> productores = repository.findAll();
        return mapper.toResponseDTOList(productores);
    }

    public ProductorResponseDTO findById(Long id) {
        Productor productor = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Productor not found with id: " + id));
        return mapper.toResponseDTO(productor);
    }

    public ProductorResponseDTO save(ProductorRequestDTO requestDTO) {
        Productor productor = mapper.toEntity(requestDTO);
        productor = repository.save(productor);
        return mapper.toResponseDTO(productor);
    }

    public ProductorResponseDTO update(Long id, ProductorRequestDTO requestDTO) {
        Productor productor = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Productor not found with id: " + id));
        productor.setNombre(requestDTO.getNombre());
        productor.setApellido(requestDTO.getApellido());
        productor.setEspecialidad(requestDTO.getEspecialidad());
        productor = repository.save(productor);
        return mapper.toResponseDTO(productor);
    }

    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Productor not found with id: " + id);
        }
        repository.deleteById(id);
    }
}