package com.wb.negocio;

import com.wb.io.Entrada;
import com.wb.modelo.Produto;

public class EdicaoProduto extends Edicao {
    private Produto produto;

    public EdicaoProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public void editar() {
        
        System.out.println("\nEDITAR PRODUTO/SERVIÇO");
        boolean execucao = true;
        while (execucao) {
            System.out.println("\nEditar:\n");
            System.out.println("1- Tipo");
            System.out.println("2- Categoria");
			System.out.println("3- Nome");
			System.out.println("4- Preço");
			System.out.println("5- Código");
            System.out.println("6- Sair");
            System.out.print("\nO que deseja fazer? ");
            

			Entrada entrada = new Entrada();
			int operacao = entrada.receberNumeroInteiro();
            switch (operacao) {
                case 1:
                    String tipo = "";
                    boolean exec = true;
                    while (exec) {
                        System.out.println("\nTipo: ");
                        System.out.print("\n1- Produto\n2- Serviço\n");
                        System.out.print("\n O que deseja fazer?");                       
                        int operacaoGenero = entrada.receberNumeroInteiro();
                        switch (operacaoGenero) {
                            case 1:
                                tipo = "Produto";
                                exec = false;
                                break;
                            case 2:
                                tipo = "Serviço";
                                exec = false;
                                break;
                            default:
                                System.out.println("\nOperação inválida!\n");
                        }
                    }
                    produto.setTipo(tipo);
                    System.out.println("\nTipo editado com sucesso!");
                    break;
                case 2:
                    String categoria = "";
                    boolean execCategoria = true;
                    while (execCategoria) {
                        System.out.println("\nCategoria: ");
                        System.out.print("\n1- Adulto\n2- Infantil\n3- Todas as Idades\n");
                        System.out.print("\n O que deseja fazer?");       
                        int operacaoGenero = entrada.receberNumeroInteiro();
                        switch (operacaoGenero) {
                            case 1:
                                categoria = "Adulto";
                                execCategoria = false;
                                break;
                            case 2:
                                categoria = "Infantil";
                                execCategoria = false;
                                break;
                            case 3:
                                categoria = "Todas as Idades";
                                execCategoria = false;
                                break;
                            default:
                                System.out.println("\nOperação inválida!\n");
                        }
                    }
                    produto.setCategoria(categoria);
                    System.out.println("\nSucesso!");
                    break;
                case 3:
                    Entrada entradaNome = new Entrada();
                    System.out.print("\nNovo nome: ");
                    String nome = entradaNome.receberTexto();
                    produto.nome = nome;
                    System.out.println("\nSucesso!\n");
                    break;
                case 4:
                    Entrada entradaPreco = new Entrada();
                    System.out.print("\nNovo preço: R$ ");
                    Double preco = entradaPreco.receberNumeroDouble();
                    produto.preco = preco;
                    System.out.println("\nSucesso!\n");
                    break;
                case 5:
                    Entrada entradaCod = new Entrada();
                    System.out.print("\nNovo código: ");
                    int codigo = entradaCod.receberNumeroInteiro();
                    produto.codigo = codigo;
                    System.out.println("\nSucesso!\n");
                    break;
                case 6:
                    execucao = false;
                    break;
                default:
                    System.out.println("\nInválido!\n");
            }
        }
    }
    
}
