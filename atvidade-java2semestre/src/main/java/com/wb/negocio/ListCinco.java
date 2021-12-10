package com.wb.negocio;

import java.util.Collections;
import java.util.List;


import com.wb.modelo.Cliente;

public class ListCinco extends Listagem {
    private List<Cliente> clientes;
    private PrintCliente impressao;

    public ListCinco(List<Cliente> clientes) 
        {
            this.clientes = clientes;
        }

    @Override
	public void listar() 
        {
            Collections.sort(clientes, new ComparadorValorConsumo());
            Collections.reverse(clientes);
            if (clientes.size() > 5) 
                {
                    for (int i = 0; i < 5; ++i) {
                        System.out.println("\nCliente Nº " + i+1);
                        this.impressao = new PrintClienteCLI(clientes.get(i));
                        impressao.imprimir();
                    }
                } 
            else{
                    int c = 1;
                    for(Cliente cliente : clientes) 
                        {
                            System.out.println("\nCliente Nº " + c);
                            this.impressao = new PrintClienteCLI(cliente);
                            impressao.imprimir();
                            c+=1;
                        }
                }
        }

}
