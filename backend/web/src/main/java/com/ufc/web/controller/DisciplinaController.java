package com.ufc.web.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ufc.web.dtos.DisciplinaDTO;
import com.ufc.web.model.Disciplina;
import com.ufc.web.service.DisciplinaService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/disciplina")
public class DisciplinaController {
	
	final DisciplinaService disciplinaService;

	public DisciplinaController(DisciplinaService disciplinaService) {
		this.disciplinaService = disciplinaService;
	}
	
	@PostMapping
	public ResponseEntity<Object> save(@RequestBody @Valid DisciplinaDTO disciplinaDTO){
		var disciplina = new Disciplina();		
		BeanUtils.copyProperties(disciplinaDTO, disciplina);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(disciplinaService.save(disciplina));
	}
	
	@GetMapping
	public ResponseEntity<Object> getAll(){
		return ResponseEntity.status(HttpStatus.OK).body(disciplinaService.getAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getDisciplinaById(@PathVariable(value = "id") Integer id){
		Optional<Disciplina> disciplinaOptional = disciplinaService.getDisciplinaById(id);
		
		if (!disciplinaOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nenhuma disciplina encontrada com o id: " + id);
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(disciplinaOptional.get());
	}
}
