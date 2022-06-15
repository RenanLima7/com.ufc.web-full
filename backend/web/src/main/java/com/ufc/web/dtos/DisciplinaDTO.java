package com.ufc.web.dtos;

import java.util.List;

import javax.validation.constraints.*;
import com.ufc.web.model.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DisciplinaDTO {
	@NotNull
	@NotEmpty
	private String nome;
	
	@NotNull
	@NotEmpty
	private int creditos;
		
	private List<Turma> turmas;
}
