package com.ufc.web.model;

import java.util.List;
import javax.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
	private List<Turma> turmas;
}
