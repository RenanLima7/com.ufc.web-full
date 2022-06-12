package com.ufc.web.model;

import javax.persistence.*;

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
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
}
