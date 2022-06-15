package com.ufc.web.model;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
	
	//@ManyToMany(mappedBy = "alunos")
	//private List<Turma> turmas;
}
