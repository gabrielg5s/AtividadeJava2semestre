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
	public void cadastrar() 
	{
		System.out.println("\nCadastro de produtos e serviços");
		String tipo = "";
		String categoria = "";
				
				boolean exec = true;
		while (exec) 
			{
				System.out.print("\n1 -Produto\n2 -Serviço\n");
				
				Entrada entradaTipo = new Entrada();
				System.out.print("\nInforme o tipo: ");
				String operacao = entradaTipo.receberTexto();
				switch (operacao) 
					{
						case "1":
							tipo = "Produto";
							exec = false;
							break;
						case "2":
							tipo = "Serviço";
							exec = false;
							break;
						default:
							System.out.println("\ninválido!");
					}
			}

			Double preco = 0.0;
			String codigo = "0";
			System.out.print("\nℹ️  Nome: ");
			String nome = entrada.receberTexto();
			boolean execPreco = true;
			while (execPreco) 
				{
					try 
						{
							Entrada entradaPreco = new Entrada();
							System.out.print("ℹ️  Preço: R$ ");
							String p = entradaPreco.receberTexto();
							preco = Double.parseDouble(p);
							System.out.print("ℹ️  Código: ");
							Entrada entradaCod = new Entrada();
							codigo = entradaCod.receberTexto();
							execPreco = false;
						} 
					catch (Exception e) 
						{
							System.out.println("\nPreço inválido!");
							System.out.println("\n Exemplo a seguir: 42.00");
						}
				}

			boolean execCategoria = true;
			while (execCategoria) 
				{
					System.out.print("\n🔵 Categoria\n\n1 -Adulto\n2️- Infantil\n3 -Todas as Idades\n");
					Entrada entradaCategoria = new Entrada();
					System.out.print("\nSelecione a opção: ");
					String c = entradaCategoria.receberTexto();
					switch (c) 
						{
							case "1":
								categoria = "Adulto";
								execCategoria = false;
								break;
							case "2":
								categoria = "Infantil";
								execCategoria = false;
								break;
							case "3":
								categoria = "Todas as Idades";
								execCategoria = false;
								break;
							default:
								System.out.println("\ninválido!");
						}
				}

				Produto produto = new Produto(nome, preco, categoria, codigo, tipo);
				this.produtos.add(produto);
				PrintCliente impressaoProd = new PrintProdutoCliente(produto);
				impressaoProd.imprimir();
				System.out.println("\ncadastrado com sucesso!");
			
			}
		
		}
		