package com.securityproject.repository;


import com.securityproject.model.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository  extends JpaRepository<UsersModel, Integer> {

    Optional<UsersModel> findByLoginAndPassword(String login, String password)


}
