package com.wb.modelo;

import java.time.LocalDate;

public class ServicoInfantil extends Servico {
	
	public	ServicoInfantil(String nome, Double preco, int codigo) {
		this.nome = nome;
		this.preco = preco;
		this.codigo = codigo;
		this.dataCadastro = LocalDate.now();
		this.categoria = "Infantil";
	}

}