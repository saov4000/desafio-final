package com.saov.desafiofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saov.desafiofinal.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	//boolean existsAccountNumero(String numero);
}
