package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Telefone;

public class EditTelefone extends Edit{
    private List<Telefone> telefones;

    public EditTelefone(List<Telefone> telefones) 
        {
            this.telefones = telefones;
        }

    @Override
    public void editar() 
        {
            int i = 0;
            System.out.println("\nTelefones:\n");
            for (Telefone telefone : telefones) 
                {
                    System.out.println("[" + Integer.sum(i,1) + "] " + "(" + telefone.getDdd() + ") " + telefone.getNumero());
                    ++i;
                }
            System.out.print("\nQual telefone deseja editar?");
            Entrada entrada = new Entrada();
            int operacao = entrada.receberNumeroInteiro();
            while (operacao < 1 || operacao > telefones.size()) 
                {
                    System.out.println("\nTelefone inválido!");
                    System.out.print("\nQual telefone deseja editar? ");
                    operacao = entrada.receberNumeroInteiro();
                }
            telefones.remove(operacao-1);
            System.out.print("\nDDD: ");
            Entrada novaEntrada = new Entrada();
            String ddd = novaEntrada.receberTexto();
            System.out.print("Número: ");
            String numero = novaEntrada.receberTexto();
            Telefone novoTel = new Telefone(ddd, numero);
            telefones.add(novoTel);
            System.out.println("\nTelefone editado com sucesso!\n");
        }
}
