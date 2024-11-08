package com.example.demo.controllers;

import com.example.demo.entities.Position;
import com.example.demo.services.PositionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/positions")
public class PositionController {

    private final PositionService positionService;

    public PositionController(PositionService positionService) {
        this.positionService = positionService;
    }

    @GetMapping("/{id}")
    public Position findPositionById(@PathVariable Long id) {
        return positionService.findPositionById(id);
    }
}
