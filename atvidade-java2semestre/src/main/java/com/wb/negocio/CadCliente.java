package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.CPF;
import com.wb.modelo.Cliente;
import com.wb.modelo.RG;
import com.wb.modelo.Telefone;

public class CadCliente extends Cad {
	private List<Cliente> clientes;
	private List<Telefone> telefones;
	private List<RG> rgs;
	private CPF cpf;
	private Entrada entrada;

	public CadCliente(List<Cliente> clientes) {
		this.clientes = clientes;
		this.entrada = new Entrada();
	}

	@Override
	public void cadastrar() 
			{
					System.out.println("\nCADASTRO DE CLIENTE:");
					System.out.println("\nInforme: ");
					System.out.print("\nNome: ");
					String nome = entrada.receberTexto();
					System.out.print("Nome Social: ");
					String nomeSocial = entrada.receberTexto();
					String g = "";

					boolean exec = true;
					while (exec) 
						{
								System.out.println("\nGênero: ");
								System.out.print("\n1- Masculino\n2- Feminino\n3- Outro\n");
								System.out.print("\nOperação desejada: ");
								int operacao = entrada.receberNumeroInteiro();
								switch (operacao) {
									case 1:
										g = "Masculinho";
										exec = false;
										break;
									case 2:
										g = "Feminino";
										exec = false;
										break;
									case 3:
										g = "Outro";
										exec = false;
										break;
									default:
									System.out.println("\ninválido!");
										break;
						}
			}

			String genero = g;

			Cliente cliente = new Cliente(nome, nomeSocial, genero, cpf, telefones, rgs);
	
			Cad cadastroCpf = new CadCpf(cliente);
			cadastroCpf.cadastrar();
	
			Cad cadastroRg = new CadRg(cliente.getRgs());
			cadastroRg.cadastrar();

		int flagRg = 1;
		while(flagRg == 1) 
		
		{
			System.out.print("Outro Telefone para contato?\n\n1️ -Sim\n2️ -Não\n");			
			System.out.print("\nOperação desejada: ");

			int operacao = entrada.receberNumeroInteiro();
			switch(operacao) 
			{
				case 2:
					flagRg = 0;
					break;
				case 1:
					cadastroRg.cadastrar();
					break;
				default:
					System.out.println("\ninválido!\n");
					break;
			}

		}

		Cad cadastroTelefone = new CadTelefone(cliente.getTelefones());
		cadastroTelefone.cadastrar();
		
		int flag = 1;
		while(flag == 1) {
			System.out.print("\nCadastrar outro telefone?\n\n1- Sim\n1- Não\n");
			Entrada entrada = new Entrada();
			String operacao = entrada.receberTexto();
			switch(operacao) {
				case "2":
					flag = 0;
					break;
				case "1":
					cadastroTelefone.cadastrar();
					break;
				default:
					System.out.println("\ninválido!\n");
					break;
			}
		}
		
		this.clientes.add(cliente);
		System.out.println("\nCliente cadastrado com sucesso!");
	}
}