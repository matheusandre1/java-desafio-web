package com.example.java_desafio_web.services;

import com.example.java_desafio_web.dto.FraseDto;
import com.example.java_desafio_web.models.Frase;
import com.example.java_desafio_web.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class FraseService {

    @Autowired
    private FraseRepository _fraseRepository;

    public FraseDto fraseAleatoria()
    {
        Optional<Frase> frase = Optional.ofNullable(_fraseRepository.gerarFraseAleatoria());

        if (frase.isPresent())
        {
            Frase f = frase.get();
            return new FraseDto(f.getTitulo(),f.getFrase(),f.getPersonagem(),f.getPoster());
        }

        return null;
    }




}
