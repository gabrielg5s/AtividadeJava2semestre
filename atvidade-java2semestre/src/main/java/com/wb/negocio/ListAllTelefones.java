package com.wb.negocio;

import java.util.List;
import com.wb.modelo.Telefone;

public class ListAllTelefones extends Listagem {
	private List<Telefone> telefones;

	public ListAllTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	@Override
	public void listar() 
		{
			System.out.println("Lista de todos os serviços:");
			for (Telefone telefone : telefones) 
				{
					System.out.println("(" + telefone.getDdd() + ") " + telefone.getNumero());
				}
		}

}
