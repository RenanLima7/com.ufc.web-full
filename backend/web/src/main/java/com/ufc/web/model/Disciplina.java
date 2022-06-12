package com.ufc.web.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Disciplina {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codigo;
	@Column(nullable = false, length = 100)
	private String nome;
	@Column(nullable = false, length = 5)
	private int creditos;
	@OneToMany(mappedBy = "disciplina")
	private List<Turma> turmas = new ArrayList<>();
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}	
}
