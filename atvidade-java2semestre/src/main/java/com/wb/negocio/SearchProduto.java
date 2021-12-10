package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Produto;

public class SearchProduto extends Searchj {
    private List<Produto> produtos;

    public SearchProduto(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public void buscar() 
        {
            
            System.out.println("\nBusque seu Produto ou Serviço");
            System.out.print("\nInsira o código: ");
            Produto prod = null;
            Entrada entrada = new Entrada();
            int cod = entrada.receberNumeroInteiro();

            for (Produto produto : produtos) 
                {
                    if (produto.getCodigo() == cod) 
                        {
                            prod = produto;
                            PrintCliente impProd = new PrintProdutoCliente(prod);
                            impProd.imprimir();
                            System.out.println("\nAções:");
                            System.out.println("\n1- Editar produto");
                            System.out.println("2- Deletar produto");
                            System.out.println("- Cancelar");
                            System.out.print("\n O que deseja fazer?");       
                            System.out.print("\n❔ ");
                            Entrada novaEntrada = new Entrada();
                            int operacao = novaEntrada.receberNumeroInteiro();
                            switch (operacao) 
                                {
                                    case 1:
                                        Edit edicaoProd = new EditProduto(prod);
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
