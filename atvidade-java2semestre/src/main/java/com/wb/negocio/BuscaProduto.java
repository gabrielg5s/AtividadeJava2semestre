package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Produto;

public class BuscaProduto extends Busca {
    private List<Produto> produtos;

    public BuscaProduto(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public void buscar() {
        
        System.out.println("\nBUSCAR PRODUTO/SERVIÇO");
        System.out.print("\nInsira o código: ");
        Produto prod = null;
        Entrada entrada = new Entrada();
        int cod = entrada.receberNumeroInteiro();

        for (Produto produto : produtos) {
            if (produto.getCodigo() == cod) {
                prod = produto;
                ImpressaoCLI impProd = new ImpressaoCLIProduto(prod);
                impProd.imprimir();
                System.out.println("\nAções:");
                System.out.println("\n1- Editar produto");
		        System.out.println("2- Deletar produto");
                System.out.println("- Cancelar");
                System.out.print("\n O que deseja fazer?");       
                System.out.print("\n❔ ");
                Entrada novaEntrada = new Entrada();
                int operacao = novaEntrada.receberNumeroInteiro();
                switch (operacao) {
                    case 1:
                        Edicao edicaoProd = new EdicaoProduto(prod);
                        edicaoProd.editar();
                        break;
                    case 2:
                        produtos.remove(produto);
                        System.out.println("\nProduto removido com sucesso!");
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("\nOperação inválida!\n");
                }
                break;
            }
        }
        if (prod == null) System.out.println("\nNão foi possível encontrar");      
    }

    
}
