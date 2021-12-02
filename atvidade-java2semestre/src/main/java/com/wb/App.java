package com.wb;

import com.wb.io.Entrada;
import com.wb.modelo.Empresa;
import com.wb.negocio.Busca;
import com.wb.negocio.BuscaCliente;
import com.wb.negocio.BuscaProduto;
import com.wb.negocio.Cadastro;
import com.wb.negocio.CadastroCliente;
import com.wb.negocio.CadastroConsumo;
import com.wb.negocio.CadastroProduto;
import com.wb.negocio.Listagem;
import com.wb.negocio.ListarConsumo;
import com.wb.negocio.ListarTodosClientes;
import com.wb.negocio.ListarTodosProdutos;

public class App {
	public static void main(String[] args) {

		System.out.println("\nBem vindo a Mundo Estranho :)\n");
				
		Empresa empresa = new Empresa();
		boolean execucao = true;

		while (execucao) {
			System.out.println("\n OPERAÇÕES\n");
			System.out.println("1- Clientes");
			System.out.println("2- Produtos ou Serviços");
			System.out.println("3- Consumos");
			System.out.println("4- Sair");
			System.out.print("\n Qual operação deseja realizar? ");

			Entrada entrada = new Entrada();
			int operacao = entrada.receberNumeroInteiro();
			switch (operacao) {
			case 1:
				System.out.println("\n CLIENTES\n");
				System.out.println("1- Cadastrar cliente");
				System.out.println("2- Listar clientes");
				System.out.println("3- Buscar cliente");
				System.out.println("4- Voltar");
				System.out.print("\n O que deseja realizar? ");

				Entrada entradaCliente = new Entrada();
				int opCliente = entradaCliente.receberNumeroInteiro();
				switch (opCliente) {
					case 1:
						Cadastro cadastro = new CadastroCliente(empresa.getClientes());
						cadastro.cadastrar();
						break;
					case 2:
						Listagem listagem = new ListarTodosClientes(empresa.getClientes());
						listagem.listar();
						break;
					case 3:
						Busca busca = new BuscaCliente(empresa.getClientes());
						busca.buscar();
						break;
					case 4:
						break;
					default:
						System.out.println("\nOperação inválida!\n");
				}
				break;
			case 2:
				System.out.println("\nPRODUTOS & SERVIÇOS\n");
				System.out.println("1- Cadastrar Produto/Serviço");
				System.out.println("2- Listar Produtos/Serviços");
				System.out.println("3- Buscar Produto/Serviço");
				System.out.println("4- Voltar");
				System.out.print("\n O que deseja realizar? ");

				Entrada entradaProd = new Entrada();
				int opProd = entradaProd.receberNumeroInteiro();
				switch (opProd) {
					case 1:
						Cadastro cadastroProduto = new CadastroProduto(empresa.getProdutos());
						cadastroProduto.cadastrar();
						break;
					case 2:
						Listagem listagemProdutos = new ListarTodosProdutos(empresa.getProdutos(), empresa.getConsumos());
						listagemProdutos.listar();
						break;
					case 3:
						Busca buscaProduto = new BuscaProduto(empresa.getProdutos());
						buscaProduto.buscar();
						break;
					case 4:
						break;
					default:
						System.out.println("\n Operação inválida!\n");
				}
				
				break;
			
			case 3:
				System.out.println("\nCONSUMOS\n");
				System.out.println("1- Registrar consumo");
				System.out.println("2- Listar consumo");
				System.out.println("3- Voltar");
				System.out.print("\n O que deseja realizar? ");
				Entrada entradaConsumo = new Entrada();
				int operacaoConsumo = entradaConsumo.receberNumeroInteiro();

				switch (operacaoConsumo) {
					case 1:
						Cadastro cadastroConsumo = new CadastroConsumo(empresa.getConsumos(), empresa.getClientes(), empresa.getProdutos());
						cadastroConsumo.cadastrar();
						break;
					case 2:
						Listagem listarConsumo = new ListarConsumo(empresa.getConsumos());
						listarConsumo.listar();
						break;
					case 3:
						break;
					default:
						System.out.println("\nOperação inválida!\n");
				}
				
				break;
			
			case 10:
				execucao = false;
				System.out.println("\nAté outra vez!\n");
				break;
			default:
				System.out.println("\nOperação inválida!\n");
			}
		}
	}
}