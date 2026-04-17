package com.palmaproject.service;

import com.palmaproject.dto.CancionRequestDTO;
import com.palmaproject.dto.CancionResponseDTO;
import com.palmaproject.exception.ResourceNotFoundException;
import com.palmaproject.mapper.CancionMapper;
import com.palmaproject.model.Cancion;
import com.palmaproject.model.Productor;
import com.palmaproject.repository.CancionRepository;
import com.palmaproject.repository.ProductorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CancionService {

    @Autowired
    private CancionRepository repository;

    @Autowired
    private CancionMapper mapper;

    @Autowired
    private ProductorRepository productorRepository;

    public List<CancionResponseDTO> findAll() {
        List<Cancion> canciones = repository.findAll();
        return mapper.toResponseDTOList(canciones);
    }

    public CancionResponseDTO findById(Long id) {
        Cancion cancion = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cancion not found with id: " + id));
        return mapper.toResponseDTO(cancion);
    }

    public CancionResponseDTO save(CancionRequestDTO requestDTO) {
        Cancion cancion = mapper.toEntity(requestDTO);
        if (requestDTO.getProductorId() != null) {
            Productor productor = productorRepository.findById(requestDTO.getProductorId())
                    .orElseThrow(() -> new ResourceNotFoundException("Productor not found with id: " + requestDTO.getProductorId()));
            cancion.setProductor(productor);
        }
        cancion = repository.save(cancion);
        return mapper.toResponseDTO(cancion);
    }

    public CancionResponseDTO update(Long id, CancionRequestDTO requestDTO) {
        Cancion cancion = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cancion not found with id: " + id));
        cancion.setTitulo(requestDTO.getTitulo());
        if (requestDTO.getProductorId() != null) {
            Productor productor = productorRepository.findById(requestDTO.getProductorId())
                    .orElseThrow(() -> new ResourceNotFoundException("Productor not found with id: " + requestDTO.getProductorId()));
            cancion.setProductor(productor);
        }
        cancion = repository.save(cancion);
        return mapper.toResponseDTO(cancion);
    }

    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Cancion not found with id: " + id);
        }
        repository.deleteById(id);
    }
}