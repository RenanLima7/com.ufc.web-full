package com.ufc.web.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.ufc.web.model.Turma;
import com.ufc.web.repository.TurmaRepository;

@Service
public class TurmaService {

	final TurmaRepository turmaRepository;

	public TurmaService(TurmaRepository turmaRepository) {
		this.turmaRepository = turmaRepository;
	}

	@Transactional
	public Turma save(Turma turma) {
		return turmaRepository.save(turma);
	}
	
	public List<Turma> getAll() {
		return turmaRepository.findAll();
	}
	
	public Optional<Turma> getTurmaById(int id){
		return turmaRepository.findById(id); 
	}
	
	@Transactional
	public void delete(Turma turma){
		turmaRepository.delete(turma); 
	}
}