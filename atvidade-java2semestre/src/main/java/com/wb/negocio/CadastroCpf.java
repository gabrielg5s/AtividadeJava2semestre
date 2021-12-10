package com.wb.negocio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.wb.io.Entrada;
import com.wb.modelo.CPF;
import com.wb.modelo.Cliente;

public class CadastroCpf extends Cadastro {
    private Cliente cliente;
	private Entrada entrada;

    public CadastroCpf(Cliente cliente) {
        this.cliente = cliente;
        this.entrada = new Entrada();
    }

    @Override
    public void cadastrar() 
        {
            System.out.println("\nCADASTRO DE CPF");
            System.out.print("\nCPF: ");
            String valorRg = entrada.receberTexto();
            
            boolean isValid = false;
            while (!isValid) 
                {
                    try 
                        {
                            System.out.print("Data de Emissão CPF [dd/mm/yyyy]: ");
                            String dataRg = entrada.receberTexto();
                            DateTimeFormatter formatoRg = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                            LocalDate dataEmissaoRg = LocalDate.parse(dataRg, formatoRg);
                            CPF cpf = new CPF(dataEmissaoRg, valorRg);
                            this.cliente.setCpf(cpf);
                            System.out.println("\nCPF cadastrado com sucesso!");
                            isValid = true;
                        }
                    catch(Exception e) 
                        {
                            System.out.println("\nData de emissão inválida!");
                            System.out.println("\nExemplo a seguir: 01/01/2021\n");
                        }
                }
        }
    
}
