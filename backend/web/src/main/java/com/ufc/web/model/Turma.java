package com.ufc.web.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Turma {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codigo; // UUID
	
	@ManyToOne
	private Disciplina disciplina;
	
	@ManyToMany
	private List<Aluno> alunos = new ArrayList<>();
	
	@Column(nullable = false)
	@ElementCollection
	private List<Date> horarios = new ArrayList<>();
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	public List<Date> getHorarios() {
		return horarios;
	}
	public void setHorarios(List<Date> horarios) {
		this.horarios = horarios;
	}
}