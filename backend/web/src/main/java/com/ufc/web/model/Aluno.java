package com.ufc.web.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int matricula;
	
	@Column(nullable = false, length = 100)
	private String nome;
	
	@Column(nullable = false, length = 100)
	private String email;
	
	@Column(nullable = false, length = 20)
	private String telefone;	
	
	@Column(nullable = false, length = 15)
	@Temporal(TemporalType.DATE)
	private Date datNas;	
	
	@Column(nullable = false)
	@Embedded
	private Endereco endereco;
	
	@ManyToMany(mappedBy = "alunos")
	private List<Turma> turmas = new ArrayList<>();
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Date getDatNas() {
		return datNas;
	}
	public void setDatNas(Date datNas) {
		this.datNas = datNas;
	}
}
