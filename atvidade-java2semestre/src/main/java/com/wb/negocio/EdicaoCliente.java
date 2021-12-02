package com.wb.negocio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.wb.io.Entrada;
import com.wb.modelo.CPF;
import com.wb.modelo.Cliente;
import com.wb.modelo.Telefone;

public class EdicaoCliente extends Edicao{
    private Cliente cliente;

    public EdicaoCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void editar() {
        System.out.println("\nEDITAR CLIENTE");
        boolean execucao = true;
        while (execucao) {
            System.out.println("\nEditar:\n");
			System.out.println("1️- Nome");
			System.out.println("2️- Nome Social");
			System.out.println("3️- CPF");
			System.out.println("4️- Gênero");
			System.out.println("5️- Telefone");
            System.out.println("6️- Sair");
            System.out.print("\nO que deseja fazer?");

			Entrada entrada = new Entrada();
			int operacao = entrada.receberNumeroInteiro();
            switch (operacao) {
                case 1:
                    Entrada entradaNome = new Entrada();
                    System.out.print("\nNovo nome: ");
                    String nome = entradaNome.receberTexto();
                    cliente.nome = nome;
                    System.out.println("\nSucesso!\n");
                    break;
                case 2:
                    Entrada entradaNomeSocial = new Entrada();
                    System.out.print("\nNovo nome social: ");
                    String nomeSocial = entradaNomeSocial.receberTexto();
                    cliente.nomeSocial = nomeSocial;
                    System.out.println("\nSucesso!\n");
                    break;
                case 3:
                    entrada = new Entrada();
                    System.out.print("\nCPF: ");
                    String valor = entrada.receberTexto();
                    System.out.print("Data de Emissão CPF [dd/mm/yyyy]: ");
                    String data = entrada.receberTexto();
                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate dataEmissao = LocalDate.parse(data, formato);
                    CPF cpf = new CPF(dataEmissao, valor);
                    cliente.setCpf(cpf);
                    System.out.println("\nSucesso!");
                    break;
                case 4:
                    String g = "";
                    boolean exec = true;
                    while (exec) {
                        System.out.println("\nGênero: ");
                        System.out.print("\n1️- Masculino\n2️- Feminino\n3️- Outro\n");
                        System.out.print("\nOperação desejada: ");
                        int operacaoGenero = entrada.receberNumeroInteiro();
                        switch (operacaoGenero) {
                            case 1:
                                g = "Masculino";
                                exec = false;
                                break;
                            case 2:
                                g = "Feminimo";
                                exec = false;
                                break;
                            case 3:
                                g = "Outro";
                                exec = false;
                                break;
                            default:
                                break;
                        }
                    }
                    cliente.setGenero(g);
                    System.out.println("\nGênero editado com sucesso!");
                    break;
                case 5:
                    boolean execEdicaoTel = true;
                    while (execEdicaoTel) {
                        System.out.println("\nAções:\n");
                        System.out.println("1️- Editar telefone");
                        System.out.println("2️- Adicionar telefone");
                        System.out.println("3️- Apagar telefone");
                        System.out.println("4️- Voltar");
                        System.out.print("\nO que deseja fazer? ");
                        Entrada entradaEdicaoTel = new Entrada();
                        int operacaoTel = entradaEdicaoTel.receberNumeroInteiro(); 
                        switch (operacaoTel) {
                            case 1:
                                Edicao edicaoTel = new EdicaoTelefone(cliente.getTelefones());
                                edicaoTel.editar();
                                break;
                            case 2:
                                Cadastro cadastroTel = new CadastroTelefone(cliente.getTelefones());
                                cadastroTel.cadastrar();
                                break;
                            case 3:
                                int i = 0;
                                System.out.println("\nTelefones:\n");
                                for (Telefone telefone : cliente.getTelefones()) {
                                    System.out.println(" [" + Integer.sum(i,1) + "] " + "(" + telefone.getDdd() + ") " + telefone.getNumero());
                                    ++i;
                                }
                                System.out.print("\n Qual telefone deseja deletar? ");
                                Entrada entradaDelTel = new Entrada();
                                int operacaoDelTel = entradaDelTel.receberNumeroInteiro();
                                while (operacaoDelTel < 1 || operacaoDelTel > cliente.getTelefones().size()) {
                                    System.out.println("\n Telefone inválido!");
                                    System.out.print("\n Qual telefone deseja deletar? ");
                                    operacaoDelTel = entrada.receberNumeroInteiro();
                                }
                                cliente.getTelefones().remove(operacaoDelTel-1);
                                System.out.println("\nTSucesso!");
                                break;
                            case 4:
                                execEdicaoTel = false;
                                break;
                            default:
                                System.out.println("\nOperação inválida!\n");
                        }
                    }
                    break;
                case 6:
                    execucao = false;
                    break;
                default:
                    System.out.println("\nOperação inválida!\n");
            }
        }
    }
    
}
