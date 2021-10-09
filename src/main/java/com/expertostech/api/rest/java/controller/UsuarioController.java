package com.expertostech.api.rest.java.controller;

import com.expertostech.api.rest.java.model.UsuarioModel;
import com.expertostech.api.rest.java.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping(path = "/api/usuario/{codigo}")
    public ResponseEntity<UsuarioModel> pegarUsuarioPorId(@PathVariable("codigo") Integer codigo) {
        return repository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public UsuarioModel salvarUsuario(@RequestBody UsuarioModel usuario) {
        return repository.save(usuario);
    }
}
