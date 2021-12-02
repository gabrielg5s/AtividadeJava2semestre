package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Cliente;

public class BuscaCliente extends Busca {
    
    private List<Cliente> clientes;
	private ImpressaoCLI impressao;

    public BuscaCliente(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public void buscar() {
        
        System.out.println("\nBUSCAR CLIENTE");
        System.out.print("\nInsira o CPF: ");
        Cliente c = null;
        Entrada entrada = new Entrada();
        String cpf = entrada.receberTexto();

        for (Cliente cli : clientes) {
            if (cli.getCpf().getValor().equals(cpf)) {
                c = cli;
                impressao = new ImpressaoCLICliente(c);
                impressao.imprimir();
                System.out.println("\nAções:");
                System.out.println("\n1- Editar cliente");
		        System.out.println("2- Deletar cliente");
                System.out.println("3- Cancelar");
                System.out.print("\nOperação desejada: ");
                Entrada novaEntrada = new Entrada();
                int operacao = novaEntrada.receberNumeroInteiro();
                switch (operacao) {
                    case 1:
                        Edicao edicaoCliente = new EdicaoCliente(cli);
                        edicaoCliente.editar();
                        break;
                    case 2:
                        clientes.remove(cli);
                        System.out.println("\nliente removido com sucesso!");
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("\nOperação inválida!\n");
                }
                break;
            }
        }

        if (c == null) System.out.println("\nNão foi possível encontrar o cliente informado!");
        
    }
    
}
