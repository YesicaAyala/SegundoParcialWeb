package com.example.demo.services;

import com.example.demo.entities.Position;
import com.example.demo.repositories.PositionRepository;
import org.springframework.stereotype.Service;

@Service
public class PositionService {
    private final PositionRepository positionRepository;

    public PositionService(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    public Position findPositionById(Long id) {
        return positionRepository.findById(id).orElse(null);
    }
}
