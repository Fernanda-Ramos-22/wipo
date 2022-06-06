package com.apiwipo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apiwipo.model.Cadastro;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Integer> {

}
