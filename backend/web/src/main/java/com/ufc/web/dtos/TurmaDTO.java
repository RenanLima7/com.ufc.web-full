package com.ufc.web.dtos;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;
import com.ufc.web.model.*;

public class TurmaDTO {
	@NotNull
	@NotEmpty
	private Disciplina disciplina;	
	
	private List<Aluno> alunos;
	
	@NotNull
	@NotEmpty
	private List<Date> horarios;

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
