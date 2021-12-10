package com.wb;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.CPF;
import com.wb.modelo.Cliente;
import com.wb.modelo.Empresa;
import com.wb.modelo.Produto;
import com.wb.modelo.RG;
import com.wb.modelo.Telefone;
import com.wb.negocio.Searchj;
import com.wb.negocio.SearchCliente;
import com.wb.negocio.SearchProduto;
import com.wb.negocio.Cadastro;
import com.wb.negocio.CadastroCliente;
import com.wb.negocio.CadastroConsumo;
import com.wb.negocio.CadastroProduto;
import com.wb.negocio.Listagem;
import com.wb.negocio.ListConsumo;
import com.wb.negocio.ListAllClientes;
import com.wb.negocio.ListAllProdutos;

public class App {
	public static void main(String[] args) {

		System.out.println("\nAgenda de Registro:)\n");
				
		Empresa empresa = new Empresa();
		boolean execucao = true;

		
		//* tive dificuldade com tentar salvar localmente e também não consegui resolver totalmente esse problema

		//* Clientes "SALVOS"

		//*  1
		List<Telefone> telefone1 = new ArrayList<Telefone>();
		String d1 = "02/04/2000";
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao1 = LocalDate.parse(d1, f1);
		CPF cpf1 = new CPF(dataEmissao1, "1");
		Telefone tel1 = new Telefone("12", "1");
		telefone1.add(tel1);
		List<RG> rgs1 = new ArrayList<RG>();
		RG rg1 = new RG(dataEmissao1, "1");
		rgs1.add(rg1);
		Cliente c1 = new Cliente("Cliente1", "1", "Masculino", cpf1, telefone1);		
		c1.setRgs(rg1);
		c1.setTels(telefone1);
		empresa.getClientes().add(c1);

		//*  2
		List<Telefone> telefone2 = new ArrayList<Telefone>();
		String d2 = "03/04/2000";
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao2 = LocalDate.parse(d2, f2);
		CPF cpf2 = new CPF(dataEmissao2, "2");
		Telefone tel2 = new Telefone("12", "2");
		telefone2.add(tel2);
		List<RG> rgs2 = new ArrayList<RG>();
		RG rg2 = new RG(dataEmissao2, "2");
		rgs2.add(rg2);
		Cliente c2 = new Cliente("Cliente2", "2", "Masculino", cpf2, telefone2);		
		c2.setRgs(rg2);
		c2.setTels(telefone2);
		empresa.getClientes().add(c2);

		//*  3
		List<Telefone> telefone3 = new ArrayList<Telefone>();
		String d3 = "03/04/2000";
		DateTimeFormatter f3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao3 = LocalDate.parse(d3, f3);
		CPF cpf3 = new CPF(dataEmissao3, "3");
		Telefone tel3 = new Telefone("13", "3");
		telefone3.add(tel3);
		List<RG> rgs3 = new ArrayList<RG>();
		RG rg3 = new RG(dataEmissao3, "3");
		rgs3.add(rg3);
		Cliente c3 = new Cliente("Cliente3", "3", "Masculino", cpf3, telefone3);		
		c3.setRgs(rg3);
		c3.setTels(telefone3);
		empresa.getClientes().add(c3);

		//*  4
		List<Telefone> telefone4 = new ArrayList<Telefone>();
		String d4 = "04/04/2000";
		DateTimeFormatter f4 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao4 = LocalDate.parse(d4, f4);
		CPF cpf4 = new CPF(dataEmissao4, "4");
		Telefone tel4 = new Telefone("14", "4");
		telefone4.add(tel4);
		List<RG> rgs4 = new ArrayList<RG>();
		RG rg4 = new RG(dataEmissao4, "4");
		rgs4.add(rg4);
		Cliente c4 = new Cliente("Cliente4", "4", "Feminimo", cpf4, telefone4);		
		c4.setRgs(rg4);
		c4.setTels(telefone4);
		empresa.getClientes().add(c4);

		//*  5
		List<Telefone> telefone5 = new ArrayList<Telefone>();
		String d5 = "05/04/2000";
		DateTimeFormatter f5 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao5 = LocalDate.parse(d5, f5);
		CPF cpf5 = new CPF(dataEmissao5, "5");
		Telefone tel5 = new Telefone("15", "5");
		telefone5.add(tel5);
		List<RG> rgs5 = new ArrayList<RG>();
		RG rg5 = new RG(dataEmissao5, "5");
		rgs5.add(rg5);
		Cliente c5 = new Cliente("Cliente5", "5", "Feminino", cpf5, telefone5);		
		c5.setRgs(rg5);
		c5.setTels(telefone5);
		empresa.getClientes().add(c5);

//*  6
		List<Telefone> telefone6 = new ArrayList<Telefone>();
		String d6 = "06/04/2000";
		DateTimeFormatter f6 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao6 = LocalDate.parse(d6, f6);
		CPF cpf6 = new CPF(dataEmissao6, "6");
		Telefone tel6 = new Telefone("16", "6");
		telefone6.add(tel6);
		List<RG> rgs6 = new ArrayList<RG>();
		RG rg6 = new RG(dataEmissao6, "6");
		rgs6.add(rg6);
		Cliente c6 = new Cliente("Cliente6", "6", "Masculino", cpf6, telefone6);		
		c6.setRgs(rg6);
		c6.setTels(telefone6);
		empresa.getClientes().add(c6);

//*  7
		List<Telefone> telefone7 = new ArrayList<Telefone>();
		String d7 = "07/04/2000";
		DateTimeFormatter f7 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao7 = LocalDate.parse(d7, f7);
		CPF cpf7 = new CPF(dataEmissao7, "7");
		Telefone tel7 = new Telefone("17", "7");
		telefone7.add(tel7);
		List<RG> rgs7 = new ArrayList<RG>();
		RG rg7 = new RG(dataEmissao7, "7");
		rgs7.add(rg7);
		Cliente c7 = new Cliente("Cliente7", "7", "Masculino", cpf7, telefone7);		
		c7.setRgs(rg7);
		c7.setTels(telefone7);
		empresa.getClientes().add(c7);
		
//*  8
		List<Telefone> telefone8 = new ArrayList<Telefone>();
		String d8 = "08/04/2000";
		DateTimeFormatter f8 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao8 = LocalDate.parse(d8, f8);
		CPF cpf8 = new CPF(dataEmissao8, "8");
		Telefone tel8 = new Telefone("18", "8");
		telefone8.add(tel8);
		List<RG> rgs8 = new ArrayList<RG>();
		RG rg8 = new RG(dataEmissao8, "8");
		rgs8.add(rg8);
		Cliente c8 = new Cliente("Cliente8", "8", "Masculino", cpf8, telefone8);		
		c8.setRgs(rg8);
		c8.setTels(telefone8);
		empresa.getClientes().add(c8);		

//*  9
		List<Telefone> telefone9 = new ArrayList<Telefone>();
		String d9 = "09/04/2000";
		DateTimeFormatter f9 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao9 = LocalDate.parse(d9, f9);
		CPF cpf9 = new CPF(dataEmissao9, "9");
		Telefone tel9 = new Telefone("19", "9");
		telefone9.add(tel9);
		List<RG> rgs9 = new ArrayList<RG>();
		RG rg9 = new RG(dataEmissao9, "9");
		rgs9.add(rg9);
		Cliente c9 = new Cliente("Cliente9", "9", "Masculino", cpf9, telefone9);		
		c9.setRgs(rg9);
		c9.setTels(telefone9);
		empresa.getClientes().add(c9);		

		//* 10
		List<Telefone> telefone10 = new ArrayList<Telefone>();
		String d10 = "10/04/2000";
		DateTimeFormatter f10 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao10 = LocalDate.parse(d10, f10);
		CPF cpf10 = new CPF(dataEmissao10, "10");
		Telefone tel10 = new Telefone("110", "10");
		telefone10.add(tel10);
		List<RG> rgs10 = new ArrayList<RG>();
		RG rg10 = new RG(dataEmissao10, "10");
		rgs10.add(rg10);
		Cliente c10 = new Cliente("Cliente10", "10", "Feminimo", cpf10, telefone10);		
		c10.setRgs(rg10);
		c10.setTels(telefone10);
		empresa.getClientes().add(c10);

		//* 11
		List<Telefone> telefone11 = new ArrayList<Telefone>();
		String d11 = "11/04/2000";
		DateTimeFormatter f11 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao11 = LocalDate.parse(d11, f11);
		CPF cpf11 = new CPF(dataEmissao11, "11");
		Telefone tel11 = new Telefone("111", "11");
		telefone11.add(tel11);
		List<RG> rgs11 = new ArrayList<RG>();
		RG rg11 = new RG(dataEmissao11, "11");
		rgs11.add(rg11);
		Cliente c11 = new Cliente("Cliente11", "11", "Feminimo", cpf11, telefone11);		
		c11.setRgs(rg11);
		c11.setTels(telefone11);
		empresa.getClientes().add(c11);

		//* 12
		List<Telefone> telefone12 = new ArrayList<Telefone>();
		String d12 = "12/04/2000";
		DateTimeFormatter f12 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao12 = LocalDate.parse(d12, f12);
		CPF cpf12 = new CPF(dataEmissao12, "12");
		Telefone tel12 = new Telefone("121", "12");
		telefone12.add(tel12);
		List<RG> rgs12 = new ArrayList<RG>();
		RG rg12 = new RG(dataEmissao12, "12");
		rgs12.add(rg12);
		Cliente c12 = new Cliente("Cliente12", "12", "Feminimo", cpf12, telefone12);		
		c12.setRgs(rg12);
		c12.setTels(telefone12);
		empresa.getClientes().add(c12);

		//* 13
		List<Telefone> telefone13 = new ArrayList<Telefone>();
		String d13 = "13/04/2000";
		DateTimeFormatter f13 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao13 = LocalDate.parse(d13, f13);
		CPF cpf13 = new CPF(dataEmissao13, "13");
		Telefone tel13 = new Telefone("131", "13");
		telefone13.add(tel13);
		List<RG> rgs13 = new ArrayList<RG>();
		RG rg13 = new RG(dataEmissao13, "13");
		rgs13.add(rg13);
		Cliente c13 = new Cliente("Cliente13", "13", "Feminimo", cpf13, telefone13);		
		c13.setRgs(rg13);
		c13.setTels(telefone13);
		empresa.getClientes().add(c13);

		//* 14
		List<Telefone> telefone14 = new ArrayList<Telefone>();
		String d14 = "14/04/2000";
		DateTimeFormatter f14 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao14 = LocalDate.parse(d14, f14);
		CPF cpf14 = new CPF(dataEmissao14, "14");
		Telefone tel14 = new Telefone("141", "14");
		telefone14.add(tel14);
		List<RG> rgs14 = new ArrayList<RG>();
		RG rg14 = new RG(dataEmissao14, "14");
		rgs14.add(rg14);
		Cliente c14 = new Cliente("Cliente14", "14", "Feminimo", cpf14, telefone14);		
		c14.setRgs(rg14);
		c14.setTels(telefone14);
		empresa.getClientes().add(c14);

		//* 15
		List<Telefone> telefone15 = new ArrayList<Telefone>();
		String d15 = "15/04/2000";
		DateTimeFormatter f15 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao15 = LocalDate.parse(d15, f15);
		CPF cpf15 = new CPF(dataEmissao15, "15");
		Telefone tel15 = new Telefone("151", "15");
		telefone15.add(tel15);
		List<RG> rgs15 = new ArrayList<RG>();
		RG rg15 = new RG(dataEmissao15, "15");
		rgs15.add(rg15);
		Cliente c15 = new Cliente("Cliente15", "15", "Feminimo", cpf15, telefone15);		
		c15.setRgs(rg15);
		c15.setTels(telefone15);
		empresa.getClientes().add(c15);

		//* 16
		List<Telefone> telefone16 = new ArrayList<Telefone>();
		String d16 = "16/04/2000";
		DateTimeFormatter f16 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao16 = LocalDate.parse(d16, f16);
		CPF cpf16 = new CPF(dataEmissao16, "16");
		Telefone tel16 = new Telefone("161", "16");
		telefone16.add(tel16);
		List<RG> rgs16 = new ArrayList<RG>();
		RG rg16 = new RG(dataEmissao16, "16");
		rgs16.add(rg16);
		Cliente c16 = new Cliente("Cliente16", "16", "Feminimo", cpf16, telefone16);		
		c16.setRgs(rg16);
		c16.setTels(telefone16);
		empresa.getClientes().add(c16);

		//* 17
		List<Telefone> telefone17 = new ArrayList<Telefone>();
		String d17 = "17/04/2000";
		DateTimeFormatter f17 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao17 = LocalDate.parse(d17, f17);
		CPF cpf17 = new CPF(dataEmissao17, "17");
		Telefone tel17 = new Telefone("171", "17");
		telefone17.add(tel17);
		List<RG> rgs17 = new ArrayList<RG>();
		RG rg17 = new RG(dataEmissao17, "17");
		rgs17.add(rg17);
		Cliente c17 = new Cliente("Cliente17", "17", "Feminimo", cpf17, telefone17);		
		c17.setRgs(rg17);
		c17.setTels(telefone17);
		empresa.getClientes().add(c17);

		//* 18
		List<Telefone> telefone18 = new ArrayList<Telefone>();
		String d18 = "18/04/2000";
		DateTimeFormatter f18 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao18 = LocalDate.parse(d18, f18);
		CPF cpf18 = new CPF(dataEmissao18, "18");
		Telefone tel18 = new Telefone("181", "18");
		telefone18.add(tel18);
		List<RG> rgs18 = new ArrayList<RG>();
		RG rg18 = new RG(dataEmissao18, "18");
		rgs18.add(rg18);
		Cliente c18 = new Cliente("Cliente18", "18", "Feminimo", cpf18, telefone18);		
		c18.setRgs(rg18);
		c18.setTels(telefone18);
		empresa.getClientes().add(c18);

		//* 19
		List<Telefone> telefone19 = new ArrayList<Telefone>();
		String d19 = "19/04/2000";
		DateTimeFormatter f19 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao19 = LocalDate.parse(d19, f19);
		CPF cpf19 = new CPF(dataEmissao19, "19");
		Telefone tel19 = new Telefone("191", "19");
		telefone19.add(tel19);
		List<RG> rgs19 = new ArrayList<RG>();
		RG rg19 = new RG(dataEmissao19, "19");
		rgs19.add(rg19);
		Cliente c19 = new Cliente("Cliente19", "19", "Masculino", cpf19, telefone19);		
		c19.setRgs(rg19);
		c19.setTels(telefone19);
		empresa.getClientes().add(c19);

		//* 20
		List<Telefone> telefone20 = new ArrayList<Telefone>();
		String d20 = "20/04/2000";
		DateTimeFormatter f20 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao20 = LocalDate.parse(d20, f20);
		CPF cpf20 = new CPF(dataEmissao20, "20");
		Telefone tel20 = new Telefone("201", "20");
		telefone20.add(tel20);
		List<RG> rgs20 = new ArrayList<RG>();
		RG rg20 = new RG(dataEmissao20, "20");
		rgs20.add(rg20);
		Cliente c20 = new Cliente("Cliente20", "20", "Masculino", cpf20, telefone20);		
		c20.setRgs(rg20);
		c20.setTels(telefone20);
		empresa.getClientes().add(c20);

		//* 21
		List<Telefone> telefone21 = new ArrayList<Telefone>();
		String d21 = "21/04/2100";
		DateTimeFormatter f21 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao21 = LocalDate.parse(d21, f21);
		CPF cpf21 = new CPF(dataEmissao21, "21");
		Telefone tel21 = new Telefone("211", "21");
		telefone21.add(tel21);
		List<RG> rgs21 = new ArrayList<RG>();
		RG rg21 = new RG(dataEmissao21, "21");
		rgs21.add(rg21);
		Cliente c21 = new Cliente("Cliente21", "21", "Masculino", cpf21, telefone21);		
		c21.setRgs(rg21);
		c21.setTels(telefone21);
		empresa.getClientes().add(c21);

		//* 22
		List<Telefone> telefone22 = new ArrayList<Telefone>();
		String d22 = "22/04/2200";
		DateTimeFormatter f22 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao22 = LocalDate.parse(d22, f22);
		CPF cpf22 = new CPF(dataEmissao22, "22");
		Telefone tel22 = new Telefone("221", "22");
		telefone22.add(tel22);
		List<RG> rgs22 = new ArrayList<RG>();
		RG rg22 = new RG(dataEmissao22, "22");
		rgs22.add(rg22);
		Cliente c22 = new Cliente("Cliente22", "22", "Masculino", cpf22, telefone22);		
		c22.setRgs(rg22);
		c22.setTels(telefone22);
		empresa.getClientes().add(c22);

		//* 23
		List<Telefone> telefone23 = new ArrayList<Telefone>();
		String d23 = "23/04/2300";
		DateTimeFormatter f23 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao23 = LocalDate.parse(d23, f23);
		CPF cpf23 = new CPF(dataEmissao23, "23");
		Telefone tel23 = new Telefone("231", "23");
		telefone23.add(tel23);
		List<RG> rgs23 = new ArrayList<RG>();
		RG rg23 = new RG(dataEmissao23, "23");
		rgs23.add(rg23);
		Cliente c23 = new Cliente("Cliente23", "23", "Masculino", cpf23, telefone23);		
		c23.setRgs(rg23);
		c23.setTels(telefone23);
		empresa.getClientes().add(c23);

		//* 24
		List<Telefone> telefone24 = new ArrayList<Telefone>();
		String d24 = "24/04/2400";
		DateTimeFormatter f24 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao24 = LocalDate.parse(d24, f24);
		CPF cpf24 = new CPF(dataEmissao24, "24");
		Telefone tel24 = new Telefone("241", "24");
		telefone24.add(tel24);
		List<RG> rgs24 = new ArrayList<RG>();
		RG rg24 = new RG(dataEmissao24, "24");
		rgs24.add(rg24);
		Cliente c24 = new Cliente("Cliente24", "24", "Masculino", cpf24, telefone24);		
		c24.setRgs(rg24);
		c24.setTels(telefone24);
		empresa.getClientes().add(c24);

		//* 25
		List<Telefone> telefone25 = new ArrayList<Telefone>();
		String d25 = "25/04/2500";
		DateTimeFormatter f25 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao25 = LocalDate.parse(d25, f25);
		CPF cpf25 = new CPF(dataEmissao25, "25");
		Telefone tel25 = new Telefone("251", "25");
		telefone25.add(tel25);
		List<RG> rgs25 = new ArrayList<RG>();
		RG rg25 = new RG(dataEmissao25, "25");
		rgs25.add(rg25);
		Cliente c25 = new Cliente("Cliente25", "25", "Masculino", cpf25, telefone25);		
		c25.setRgs(rg25);
		c25.setTels(telefone25);
		empresa.getClientes().add(c25);

		//* 26
		List<Telefone> telefone26 = new ArrayList<Telefone>();
		String d26 = "26/04/2600";
		DateTimeFormatter f26 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao26 = LocalDate.parse(d26, f26);
		CPF cpf26 = new CPF(dataEmissao26, "26");
		Telefone tel26 = new Telefone("261", "26");
		telefone26.add(tel26);
		List<RG> rgs26 = new ArrayList<RG>();
		RG rg26 = new RG(dataEmissao26, "26");
		rgs26.add(rg26);
		Cliente c26 = new Cliente("Cliente26", "26", "Masculino", cpf26, telefone26);		
		c26.setRgs(rg26);
		c26.setTels(telefone26);
		empresa.getClientes().add(c26);

		//* 27
		List<Telefone> telefone27 = new ArrayList<Telefone>();
		String d27 = "27/04/2700";
		DateTimeFormatter f27 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao27 = LocalDate.parse(d27, f27);
		CPF cpf27 = new CPF(dataEmissao27, "27");
		Telefone tel27 = new Telefone("271", "27");
		telefone27.add(tel27);
		List<RG> rgs27 = new ArrayList<RG>();
		RG rg27 = new RG(dataEmissao27, "27");
		rgs27.add(rg27);
		Cliente c27 = new Cliente("Cliente27", "27", "Masculino", cpf27, telefone27);		
		c27.setRgs(rg27);
		c27.setTels(telefone27);
		empresa.getClientes().add(c27);

		//* 28
		List<Telefone> telefone28 = new ArrayList<Telefone>();
		String d28 = "28/04/2800";
		DateTimeFormatter f28 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao28 = LocalDate.parse(d28, f28);
		CPF cpf28 = new CPF(dataEmissao28, "28");
		Telefone tel28 = new Telefone("281", "28");
		telefone28.add(tel28);
		List<RG> rgs28 = new ArrayList<RG>();
		RG rg28 = new RG(dataEmissao28, "28");
		rgs28.add(rg28);
		Cliente c28 = new Cliente("Cliente28", "28", "Masculino", cpf28, telefone28);		
		c28.setRgs(rg28);
		c28.setTels(telefone28);
		empresa.getClientes().add(c28);

		//* 29
		List<Telefone> telefone29 = new ArrayList<Telefone>();
		String d29 = "29/04/2900";
		DateTimeFormatter f29 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao29 = LocalDate.parse(d29, f29);
		CPF cpf29 = new CPF(dataEmissao29, "29");
		Telefone tel29 = new Telefone("291", "29");
		telefone29.add(tel29);
		List<RG> rgs29 = new ArrayList<RG>();
		RG rg29 = new RG(dataEmissao29, "29");
		rgs29.add(rg29);
		Cliente c29 = new Cliente("Cliente29", "29", "Masculino", cpf29, telefone29);		
		c29.setRgs(rg29);
		c29.setTels(telefone29);
		empresa.getClientes().add(c29);

		//* 30
		List<Telefone> telefone30 = new ArrayList<Telefone>();
		String d30 = "30/04/3000";
		DateTimeFormatter f30 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao30 = LocalDate.parse(d30, f30);
		CPF cpf30 = new CPF(dataEmissao30, "30");
		Telefone tel30 = new Telefone("301", "30");
		telefone30.add(tel30);
		List<RG> rgs30 = new ArrayList<RG>();
		RG rg30 = new RG(dataEmissao30, "30");
		rgs30.add(rg30);
		Cliente c30 = new Cliente("Cliente30", "30", "Masculino", cpf30, telefone30);		
		c30.setRgs(rg30);
		c30.setTels(telefone30);
		empresa.getClientes().add(c30);

		//* Produtos Salvos
		
		Produto produto1 = new Produto("Lanche1", 1.0, "Adulto", "01", "Produto");
		empresa.getProdutos().add(produto1);

		
	

		while (execucao) {
								System.out.println("\n OPERAÇÕES\n");
								System.out.println("1- Clientes");
								System.out.println("2- Produtos ou Serviços");
								System.out.println("3- Consumos");
								System.out.println("4- Sair");
								System.out.print("\n Qual operação deseja realizar? ");

			Entrada entrada = new Entrada();
			int operacao = entrada.receberNumeroInteiro();
			switch (operacao)
					 {
							case 1:
								System.out.println("\n CLIENTES\n");
								System.out.println("1- Cadastrar cliente");
								System.out.println("2- Listar clientes");
								System.out.println("3- Buscar cliente");
								System.out.println("4- Voltar");
								System.out.print("\n O que deseja realizar? ");

								Entrada entradaCliente = new Entrada();
								int opCliente = entradaCliente.receberNumeroInteiro();
								switch (opCliente) {
									case 1:
										Cadastro cadastro = new CadastroCliente(empresa.getClientes());
										cadastro.cadastrar();
										break;
									case 2:
										Listagem listagem = new ListAllClientes(empresa.getClientes());
										listagem.listar();
										break;
									case 3:
										Searchj busca = new SearchCliente(empresa.getClientes());
										busca.buscar();
										break;
									case 4:
										break;
									default:
										System.out.println("\nOperação inválida!\n");
						}
				break;
			case 2:
				System.out.println("\nPRODUTOS & SERVIÇOS\n");
				System.out.println("1- Cadastrar Produto/Serviço");
				System.out.println("2- Listar Produtos/Serviços");
				System.out.println("3- Buscar Produto/Serviço");
				System.out.println("4- Voltar");
				System.out.print("\n O que deseja realizar? ");

				Entrada entradaProd = new Entrada();
				int opProd = entradaProd.receberNumeroInteiro();
				switch (opProd) 
						{
								case 1:
									Cadastro cadastroProduto = new CadastroProduto(empresa.getProdutos());
									cadastroProduto.cadastrar();
									break;
								case 2:
									Listagem listagemProdutos = new ListAllProdutos(empresa.getProdutos(), empresa.getConsumos());
									listagemProdutos.listar();
									break;
								case 3:
									Searchj buscaProduto = new SearchProduto(empresa.getProdutos());
									buscaProduto.buscar();
									break;
								case 4:
									break;
								default:
									System.out.println("\n Operação inválida!\n");
						}
				break;
			
			case 3:
				System.out.println("\nCONSUMOS\n");
				System.out.println("1- Registrar consumo");
				System.out.println("2- Listar consumo");
				System.out.println("3- Voltar");
				System.out.print("\n O que deseja realizar? ");
				Entrada entradaConsumo = new Entrada();
				int operacaoConsumo = entradaConsumo.receberNumeroInteiro();

				switch (operacaoConsumo) 
						{
								case 1:
									Cadastro cadastroConsumo = new CadastroConsumo(empresa.getConsumos(), empresa.getClientes(), empresa.getProdutos());
									cadastroConsumo.cadastrar();
									break;
								case 2:
									Listagem listarConsumo = new ListConsumo(empresa.getConsumos());
									listarConsumo.listar();
									break;
								case 3:
									break;
								default:
									System.out.println("\nOperação inválida!\n");
						}
				
				break;
			
			case 4:
				execucao = false;
				System.out.println("\n Programa Finalizado!\n");
				break;
			default:
				System.out.println("\nOperação inválida!\n");
			}
		}
	}
}