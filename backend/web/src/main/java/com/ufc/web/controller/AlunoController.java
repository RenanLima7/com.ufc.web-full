package com.ufc.web.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ufc.web.dtos.*;
import com.ufc.web.model.*;
import com.ufc.web.service.TurmaService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/aluno")
public class AlunoController {
	/*
	final TurmaService turmaService;

	public AlunoController(TurmaService turmaService) {
		this.turmaService = turmaService;
	}
	
	@PostMapping
	public ResponseEntity<Object> save(@RequestBody @Valid TurmaDTO turmaDTO){
		var turma = new Turma();		
		BeanUtils.copyProperties(turmaDTO, turma);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(turmaService.save(turma));
	}
	
	@GetMapping
	public ResponseEntity<Object> getAll(){
		return ResponseEntity.status(HttpStatus.OK).body(turmaService.getAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getTurmaById(@PathVariable(value = "id") Integer id){
		Optional<Turma> turmaOptional = turmaService.getTurmaById(id);
		
		if (!turmaOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nenhuma turma encontrada com o id: " + id);
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(turmaOptional.get());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> delete(@PathVariable(value = "id") Integer id){
		Optional<Turma> turmaOptional = turmaService.getTurmaById(id);
		
		if (!turmaOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nenhuma turma encontrada com o id: " + id);
		}
		
		turmaService.delete(turmaOptional.get());
		return ResponseEntity.status(HttpStatus.OK).body("Turma deletada com sucesso!");
	}

	@PutMapping("/id")
	public ResponseEntity<Object> update(@PathVariable(value = "id") Integer id, @RequestBody @Valid TurmaDTO turmaDTO){
		Optional<Turma> turmaOptional = turmaService.getTurmaById(id);
		
		if (!turmaOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nenhuma turma encontrada com o id: " + id);
		}
		
		var turma = turmaOptional.get();
		turma.setDisciplina(turmaDTO.getDisciplina());
		turma.setAlunos(turmaDTO.getAlunos());
		turma.setHorarios(turmaDTO.getHorarios());
				
		return ResponseEntity.status(HttpStatus.OK).body(turmaService.save(turma));
	}*/
}
