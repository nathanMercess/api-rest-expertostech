package com.expertostech.api.rest.java.repository;

import com.expertostech.api.rest.java.model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel, Integer> {
}
