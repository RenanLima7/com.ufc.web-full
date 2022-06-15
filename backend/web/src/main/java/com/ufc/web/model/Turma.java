package com.ufc.web.model;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Turma {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codigo; // UUID
	
	@ManyToOne
	private Disciplina disciplina;
	
	//@ManyToMany
	//@JoinTable(name = "turma_alunos",
	//		   joinColumns = @JoinColumn(name = "turma_id"),
	//		   inverseJoinColumns = @JoinColumn(name = "aluno_id"))
	//private List<Aluno> alunos;
	
	//@ElementCollection
	//@CollectionTable(name = "turma_horarios", joinColumns = @JoinColumn(name = "turma_codigo"))
	//@Column(name = "turma_horas")
	private String horarios;
}