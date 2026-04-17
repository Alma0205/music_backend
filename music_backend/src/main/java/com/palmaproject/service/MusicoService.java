package com.palmaproject.service;

import com.palmaproject.dto.MusicoRequestDTO;
import com.palmaproject.dto.MusicoResponseDTO;
import com.palmaproject.exception.ResourceNotFoundException;
import com.palmaproject.mapper.MusicoMapper;
import com.palmaproject.model.Musico;
import com.palmaproject.repository.MusicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicoService {

    @Autowired
    private MusicoRepository repository;

    @Autowired
    private MusicoMapper mapper;

    public List<MusicoResponseDTO> findAll() {
        List<Musico> musicos = repository.findAll();
        return mapper.toResponseDTOList(musicos);
    }

    public MusicoResponseDTO findById(Long id) {
        Musico musico = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Musico not found with id: " + id));
        return mapper.toResponseDTO(musico);
    }

    public MusicoResponseDTO save(MusicoRequestDTO requestDTO) {
        Musico musico = mapper.toEntity(requestDTO);
        musico = repository.save(musico);
        return mapper.toResponseDTO(musico);
    }

    public MusicoResponseDTO update(Long id, MusicoRequestDTO requestDTO) {
        Musico musico = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Musico not found with id: " + id));
        musico.setNombre(requestDTO.getNombre());
        musico.setApellido(requestDTO.getApellido());
        musico.setGenero(requestDTO.getGenero());
        musico.setInstrumento(requestDTO.getInstrumento());
        musico = repository.save(musico);
        return mapper.toResponseDTO(musico);
    }

    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Musico not found with id: " + id);
        }
        repository.deleteById(id);
    }
    }
