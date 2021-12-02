package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.ServicoInfantil;
import com.wb.modelo.ServicoAdulto;
import com.wb.modelo.Servico;

public class CadastroServico extends Cadastro {
	private List<Servico> servicos;
	private Entrada entrada;
	
	public CadastroServico(List<Servico> servicos) {
		this.servicos = servicos;
		this.entrada = new Entrada();
	}

	@Override
	public void cadastrar() {
		System.out.println("\nCADASTRO DE SERVIÇO:");
		System.out.println("\nInforme: ");
		System.out.print("\nNome do serviço: ");
		String nome = entrada.receberTexto();
		System.out.print("Preço: R$ ");
		Double preco = entrada.receberNumeroDouble();
		System.out.print("Código do Produto: ");
		int codigo = entrada.receberNumeroInteiro();
		
		System.out.print("\nCategoria do produto\n\n1- Infantil\n2- Adulto\n");
		int categoria = entrada.receberNumeroInteiro();
		switch (categoria) {
			case 1:
				Servico servicoF = new ServicoInfantil(nome, preco, codigo);
				this.servicos.add(servicoF);
				System.out.println("\nProduto Cadastrado!\n");
				break;
			case 2:
				Servico servicoM = new ServicoAdulto(nome, preco, codigo);
				this.servicos.add(servicoM);
				System.out.println("\nServiço Cadastrado!\n");
				break;
			default:
				System.out.println("\nOperação inválida!\n");
		}
		
	}

}
