package com.example.java_desafio_web.controller;

import com.example.java_desafio_web.dto.FraseDto;
import com.example.java_desafio_web.services.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("series")
public class FraseController {

    @Autowired
    private FraseService _fraseService;

    @GetMapping("/frases")
    public FraseDto buscaAleatoria()
    {
        return _fraseService.fraseAleatoria();
    }
}
