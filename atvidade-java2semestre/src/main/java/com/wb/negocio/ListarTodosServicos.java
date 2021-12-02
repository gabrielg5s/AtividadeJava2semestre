package com.wb.negocio;

import java.util.List;

import com.wb.modelo.Servico;

public class ListarTodosServicos extends Listagem {
	private List<Servico> servicos;

	public ListarTodosServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}

	@Override
	public void listar() {
		System.out.println("\nLISTA DE SERVIÇOS:");
		for (Servico servico : servicos) {
			System.out.println("\nNome: " + servico.nome);
			System.out.println("Preço: " + servico.preco);
			System.out.println("Categoria: " + servico.categoria);
			System.out.println("Código: " + servico.codigo);
		}
	}

}
