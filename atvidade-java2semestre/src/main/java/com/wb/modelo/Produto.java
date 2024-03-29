package com.wb.modelo;

import java.time.LocalDate;

public class Produto implements Comparable<Produto> {
	public String nome;
	public Double preco;
	public String categoria;
	public int codigo;
	public LocalDate dataCadastro;
	public String tipo;

	public Produto(String nome, Double preco, String categoria, int codigo, String tipo) {
		this.nome = nome;
		this.preco = preco;
		this.categoria = categoria;
		this.codigo = codigo;
		this.tipo = tipo;
		this.dataCadastro = LocalDate.now();
	}
	
	public Produto(String nome2, String string, String categoria2, String string2, String tipo2) {
    }

    public Produto(String nome2, Double preco2, String categoria2, String codigo2, String tipo2) {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public int compareTo(Produto o) {
		return 0;
	}
}