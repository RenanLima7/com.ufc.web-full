package com.ufc.web.dtos;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;
import com.ufc.web.model.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TurmaDTO {
	@NotNull
	@NotEmpty
	private Disciplina disciplina;	
	
	//private List<Aluno> alunos;
	
	@NotNull
	@NotEmpty
	private String horarios;
}
