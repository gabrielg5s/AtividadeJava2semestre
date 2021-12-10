package com.wb.negocio;

import com.wb.modelo.Produto;

public class PrintProdutoCliente implements PrintCliente {
    Produto produto;

    public PrintProdutoCliente(Produto produto) {
        this.produto = produto;
    }

    public void imprimir() 
        {
            System.out.println("\n" + produto.tipo + ": " + produto.nome);
            System.out.println("Preço: R$ " + produto.preco);
            System.out.println("Categoria: " + produto.categoria);
            System.out.println("Código: " + produto.codigo);
        }
    
}
