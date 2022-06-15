package com.ufc.web.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.ufc.web.model.Aluno;
import com.ufc.web.repository.AlunoRepository;

@Service
public class AlunoService {

	final AlunoRepository alunoRepository;

	public AlunoService(AlunoRepository alunoRepository) {
		this.alunoRepository = alunoRepository;
	}

	@Transactional
	public Aluno save(Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	public List<Aluno> getAll() {
		return alunoRepository.findAll();
	}
	
	public Optional<Aluno> getAlunoById(int id){
		return alunoRepository.findById(id); 
	}	
}