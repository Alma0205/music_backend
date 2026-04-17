package com.palmaproject.service;

import com.palmaproject.dto.DiscograficaRequestDTO;
import com.palmaproject.dto.DiscograficaResponseDTO;
import com.palmaproject.exception.ResourceNotFoundException;
import com.palmaproject.mapper.DiscograficaMapper;
import com.palmaproject.model.Discografica;
import com.palmaproject.repository.DiscograficaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscograficaService {

    @Autowired
    private DiscograficaRepository repository;

    @Autowired
    private DiscograficaMapper mapper;

    public List<DiscograficaResponseDTO> findAll() {
        List<Discografica> discograficas = repository.findAll();
        return mapper.toResponseDTOList(discograficas);
    }

    public DiscograficaResponseDTO findById(Long id) {
        Discografica discografica = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Discografica not found with id: " + id));
        return mapper.toResponseDTO(discografica);
    }

    public DiscograficaResponseDTO save(DiscograficaRequestDTO requestDTO) {
        Discografica discografica = mapper.toEntity(requestDTO);
        discografica = repository.save(discografica);
        return mapper.toResponseDTO(discografica);
    }

    public DiscograficaResponseDTO update(Long id, DiscograficaRequestDTO requestDTO) {
        Discografica discografica = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Discografica not found with id: " + id));
        discografica.setNombre(requestDTO.getNombre());
        discografica.setDireccion(requestDTO.getDireccion());
        discografica = repository.save(discografica);
        return mapper.toResponseDTO(discografica);
    }

    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Discografica not found with id: " + id);
        }
        repository.deleteById(id);
    }
}