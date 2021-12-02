package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Produto;

public class CadastroProduto extends Cadastro {
	private List<Produto> produtos;
	private Entrada entrada;
	
	public CadastroProduto(List<Produto> produtos) {
		this.produtos = produtos;
		this.entrada = new Entrada();
	}

	@Override
	public void cadastrar() {
		System.out.println("\nO que deseja?");
		System.out.println("\nInforme: ");
		System.out.print("\nTipo\n\n 1- Produto\n 2- Serviço\n");

		String tipo = "";
		Entrada entradaTipo = new Entrada();
		System.out.print("\n");
		int operacao = entradaTipo.receberNumeroInteiro();
		
		switch (operacao) {
			case 1:
				tipo = "Produto";
				break;
			case 2:
				tipo = "Serviço";
				break;
			default:
				System.out.println("\nOperação inválida!\n");
		}
		System.out.print("\n Nome: ");
		String nome = entrada.receberTexto();
		System.out.print(" Preço: R$ ");
		Double preco = entrada.receberNumeroDouble();
		System.out.print(" Código: ");
		Entrada entradaCod = new Entrada();
		int codigo = entradaCod.receberNumeroInteiro();
		System.out.print("\nCategoria\n\n  - Infantil\n  - Adulto\n  - Todas as idades\n");
		Entrada entradaCategoria = new Entrada();
		System.out.print("\n");
		int c = entradaCategoria.receberNumeroInteiro();
		String categoria = "";

		switch (c) {
			case 1:
				categoria = "Infantil";				
				break;
			case 2:
				categoria = "Adulto";				
				break;
			case 3:
				categoria = "Todas as Idades";				
				break;
			default:
				System.out.println("\nOperação inválida!\n");
		}

		Produto produto = new Produto(nome, preco, categoria, codigo, tipo);
		this.produtos.add(produto);
		ImpressaoCLI impressaoProd = new ImpressaoCLIProduto(produto);
		impressaoProd.imprimir();
		System.out.println("\nProduto/Serviço cadastrado com sucesso!");
		
		
	}

}
