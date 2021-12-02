package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Cliente;

public class ListarTodosClientes extends Listagem {
	private List<Cliente> clientes;
	private ImpressaoCLI impressao;

	public ListarTodosClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public void listar() {
		
		System.out.println("\nLISTA DE CLIENTES:");
		System.out.println("\nPOR GÊNERO:");
		Entrada entrada = new Entrada();
		System.out.println("\n1- Masculino");
		System.out.println("2- Feminino");
		System.out.println("3- Todos");
		System.out.println("\nPOR CONSUMO:");
		System.out.println("\n4- 5 mais em valor de consumo");
		System.out.println("5- 10 mais em quantidade de produtos");
		System.out.println("6- 10 menos em quantidade de produtos");
		System.out.print("\nO que deseja fazer? ");
		
		int operacao = entrada.receberNumeroInteiro();
		String genero = "T";
		switch (operacao) {
			case 1:
				genero = "Masculino";
				break;
			case 2:
				genero = "Feminino";
				break;
			case 3:
				genero = "Outro";
				break;
			case 4:
				System.out.println("\n Mais em valor de consumo");
				Listagem listar5 = new Listar5(clientes);
				listar5.listar();
				return;
			case 5:
				System.out.println("\n➕ 10 clientes que mais consumiram produtos ou serviços.");
				Listagem listar10Mais = new Listar10MaisConsumo(clientes);
				listar10Mais.listar();
				return;
			case 6:
				System.out.println("\n➖ 10 clientes que menos consumiram produtos ou serviços.");
				Listagem listar10Menos = new Listar10MenosConsumo(clientes);
				listar10Menos.listar();
				return;
			default:
				System.out.println("\nOperação inválida!\n");
				break;
		}
		
		if (genero == "Outro") {
			System.out.println("\nCLIENTES:");
			for (Cliente cliente : clientes) {
				this.impressao = new ImpressaoCLICliente(cliente);
                impressao.imprimir();
			}
		} else {
			System.out.println("\nCLIENTES:");
			for (Cliente cliente : clientes) {
				if (cliente.getGenero().equalsIgnoreCase(genero)) {
					this.impressao = new ImpressaoCLICliente(cliente);
                	impressao.imprimir();
				}
			}
		}

		
	}
}
