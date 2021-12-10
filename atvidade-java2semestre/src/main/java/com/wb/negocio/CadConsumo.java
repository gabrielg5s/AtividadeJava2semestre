package com.wb.negocio;

import java.util.ArrayList;
import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Cliente;
import com.wb.modelo.Consumo;
import com.wb.modelo.Produto;


public class CadConsumo extends Cad {

	private List<Consumo> consumos = new ArrayList<Consumo>();
	private List<Cliente> clientes;
	private List<Produto> produtosConsumidos = new ArrayList<Produto>();
	private List<Produto> todosProdutos;
	private Entrada entrada;
	
	public CadConsumo(List<Consumo> consumos, List<Cliente> clientes, List<Produto> todosProdutos) {
		this.consumos = consumos;
		this.clientes = clientes;
		this.todosProdutos = todosProdutos;
		this.entrada = new Entrada();
	}

	@Override
	public void cadastrar() {
		Double valorTotal = 0.0;
		String cpf = null;
		Cliente cliente = null;

		System.out.println("\nCONSUMO");
		boolean execucao = true;
		while(execucao) 
		{
			System.out.print("\nCliente já cadastrado?\n\n1  - Sim\n2 - Não\n");
			
			System.out.print("\n❔ ");
			int operacao = entrada.receberNumeroInteiro();
			switch(operacao) 
				{
					case 1:
						System.out.println("\nInforme");
						System.out.print("\nCPF: ");
						entrada = new Entrada();
						cpf = entrada.receberTexto();
						execucao = false;
						break;
					case 2:
						Cad cadastroCliente = new CadCliente(clientes);
						cadastroCliente.cadastrar();
						cliente = clientes.get(clientes.size() - 1);
						cpf = cliente.getCpf().getValor();
						execucao = false;
						break;
					default:
						System.out.println("\nOperação inválida!\n");
				}
		}

		if (cpf != "") 
		{
			for (Cliente c : clientes) {
				if (cpf.equals(c.getCpf().getValor())) {
					cliente = c;
					PrintCliente impressaoCliente = new PrintClienteCLI(cliente);
					impressaoCliente.imprimir();
					break;
				}
			}
		} 
		
		if (cliente == null) {
			System.out.println("\nNão foi possível encontrar o cliente!");
			return;
		}

		System.out.println("\nCONSUMO");
		boolean exec = true;
		while (exec) {
			Entrada entradaCod = new Entrada();
			System.out.println("\nInforme");
			System.out.print("\nCódigo do produto: ");
			int codigoProd = entradaCod.receberNumeroInteiro();
			boolean flag = true;
			for (Produto prod : todosProdutos) 
			{
				if (codigoProd == prod.codigo) 
				{
						this.produtosConsumidos.add(prod);
						flag = false;
						PrintCliente impressaoProd = new PrintProdutoCliente(prod);
						impressaoProd.imprimir();
						System.out.println("\n"+ prod.getTipo() + " adicionado ao consumo!");
						System.out.print("\n Adicionar outro produto/serviço?\n\n1️ -Sim\n2️  -Não\n");
						System.out.print("\n?");
						Entrada entradaCont = new Entrada();
						int oper = entradaCont.receberNumeroInteiro();
					switch (oper) 
					{
						case 1:
							break;
						case 2:
							exec = false;
							break;
						default:
							System.out.println("\nOperação inválida!\n");
					}
					break;
				}
			}
			if (flag) 
			{
				System.out.println("\nNão foi possível encontrar o produto!");
				System.out.print("\nTentar novamente?\n\n1 - Sim\n2 - Não\n");
				System.out.print("\n");
				Entrada entradaAcao = new Entrada();
				int op = entradaAcao.receberNumeroInteiro();
				switch (op) 
				{
					case 1:
						break;
					case 2:
						exec = false;
						break;
					default:
						System.out.println("\nOperação inválida!\n");
				}
			}
		}

		for (Produto produtoConsumido : produtosConsumidos) 
			{
				valorTotal +=  produtoConsumido.getPreco();
			}
		Consumo novoConsumo = new Consumo(produtosConsumidos, valorTotal, cliente);
		cliente.getListaConsumo().add(novoConsumo);
		cliente.setConsumoTotal();
		this.consumos.add(novoConsumo);

		System.out.println("\nConsumo cadastrado!");
		System.out.print("\nCliente: " + cliente.nome);
		System.out.print("\nCPF: " + cliente.getCpf().getValor());
		System.out.println("\nTotal: R$ " + valorTotal);

		for(Produto prod : novoConsumo.getProdutosConsumidos()) {
			System.out.print("\n" + prod.getTipo() + ": " + prod.getNome());
			System.out.println("\nPreço: R$ " + prod.getPreco());
		}

		
		
	}
}