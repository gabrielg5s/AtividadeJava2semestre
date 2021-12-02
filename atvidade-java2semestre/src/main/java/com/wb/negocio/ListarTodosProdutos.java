package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Consumo;
import com.wb.modelo.Produto;

public class ListarTodosProdutos extends Listagem {
	private List<Produto> produtos;
	private List<Consumo> consumos;

	public ListarTodosProdutos(List<Produto> produtos, List<Consumo> consumos) {
		this.produtos = produtos;
		this.consumos = consumos;
	}

	@Override
	public void listar() {
		System.out.println("\nLISTA DE PRODUTOS/SERVIÇOS");
		System.out.println("\nPOR TIPO:");
		Entrada entrada = new Entrada();
		System.out.println("\n1️- Produto");
		System.out.println("2️- Serviço");
		System.out.println("3️- Todos");
		System.out.println("4️- Mais consumidos");
		System.out.print("\nO que deseja fazer? ");
		int operacao = entrada.receberNumeroInteiro();
		String filtro = "";

		switch (operacao) {
			case 1:
				filtro = "Produto";
				System.out.println("\nPRODUTOS");
				break;
			case 2:
				filtro = "Serviço";
				System.out.println("\nSERVIÇOS");
				break;
			case 3:
				filtro = "Todos";
				System.out.println("\nPRODUTOS & SERVIÇOS");
				break;
			case 4:
				System.out.println("\nPRODUTOS & SERVIÇOS MAIS CONSUMIDOS");
				Listagem listaMaisConsumidos = new ListarMaisConsumidos(produtos, consumos);
				listaMaisConsumidos.listar();
				return;
			default:
				System.out.println("\nOperação inválida!\n");
		}

		for (Produto produto : produtos) {
			if (filtro.equals("Todos")) {
				ImpressaoCLI impressaoProd = new ImpressaoCLIProduto(produto);
				impressaoProd.imprimir();
			} else {
				if (filtro.equals(produto.tipo)) {
					ImpressaoCLI impressaoProd = new ImpressaoCLIProduto(produto);
					impressaoProd.imprimir();
				}
			}
			
		}
	}

}
