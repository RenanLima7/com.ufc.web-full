package com.ufc.web.model;

import javax.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Endereco {
	
	@Column(nullable = false, length = 2)
	private String estado;
	
	@Column(nullable = false, length = 100)
	private String cidade;
	
	@Column(nullable = false, length = 100)
	private String logradouro;
	
	@Column(nullable = false, length = 10)
	private String numero;	
	
	@Column(nullable = false, length = 10)
	private int cep;
}
