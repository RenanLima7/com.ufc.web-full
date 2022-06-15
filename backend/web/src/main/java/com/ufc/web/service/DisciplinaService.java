package com.ufc.web.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.ufc.web.model.Disciplina;
import com.ufc.web.repository.DisciplinaRepository;

@Service
public class DisciplinaService {

	final DisciplinaRepository disciplinaRepository;

	public DisciplinaService(DisciplinaRepository disciplinaRepository) {
		this.disciplinaRepository = disciplinaRepository;
	}

	@Transactional
	public Disciplina save(Disciplina disciplina) {
		return disciplinaRepository.save(disciplina);
	}
	
	public List<Disciplina> getAll() {
		return disciplinaRepository.findAll();
	}
	
	public Optional<Disciplina> getDisciplinaById(int id){
		return disciplinaRepository.findById(id); 
	}
}