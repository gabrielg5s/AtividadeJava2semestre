package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Telefone;

public class CadastroTelefone extends Cadastro 
{
		private List<Telefone> telefones;
		private Entrada entrada;

		public CadastroTelefone(List<Telefone> telefones) 
			{
				this.telefones = telefones;
				this.entrada = new Entrada();
			}

		@Override
		public void cadastrar() 
			{
				System.out.println("\nCadastro de Telefone: ");
				System.out.print("\nDDD: ");
				String ddd = entrada.receberTexto();
				System.out.print("Número: ");
				String numero = entrada.receberTexto();
				Telefone telefone = new Telefone(ddd, numero);
				this.telefones.add(telefone);
				System.out.println("\nTelefone Cadastrado!\n");
			}
}