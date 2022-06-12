package com.ufc.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ufc.web.model.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Integer>{

}
