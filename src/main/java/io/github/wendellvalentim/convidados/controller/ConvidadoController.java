package io.github.wendellvalentim.convidados.controller;

import io.github.wendellvalentim.convidados.model.Convidado;
import io.github.wendellvalentim.convidados.repository.ConvidadoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ConvidadoController {

    private final ConvidadoRepository repository;

    @GetMapping
    public List<Convidado> getConvidados() {
        return repository.findAll();
    }

}
