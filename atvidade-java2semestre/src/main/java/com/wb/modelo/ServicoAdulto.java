package com.wb.modelo;

import java.time.LocalDate;

public class ServicoAdulto extends Servico {
	
	public ServicoAdulto(String nome, Double preco, int codigo) {
		this.nome = nome;
		this.preco = preco;
		this.codigo = codigo;
		this.dataCadastro = LocalDate.now();
		this.categoria = "Adulto";
	}

}