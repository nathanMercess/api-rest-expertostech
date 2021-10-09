package com.expertostech.api.rest.java.repository;

import com.expertostech.api.rest.java.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
}
