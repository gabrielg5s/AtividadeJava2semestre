package com.wb.negocio;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

import com.wb.modelo.Cliente;
import com.wb.modelo.Consumo;
import com.wb.modelo.Produto;

public class ListDezMaisConsumo extends Listagem {
    private List<Cliente> clientes;

    public ListDezMaisConsumo(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public void listar() 
        {
            Map<Cliente, Integer> myDict = new HashMap<Cliente, Integer>();

            for (Cliente cliente : clientes) 
                {
                    int totalProdutos = 0;
                    List<Consumo> consumos = cliente.getListaConsumo();
                    for (Consumo consumo : consumos) {
                        List<Produto> produtos = consumo.getProdutosConsumidos();
                        totalProdutos += produtos.size();
                    }
                    myDict.put(cliente, totalProdutos);
                }
            Map<Cliente, Integer> reverseSortedMap = new TreeMap<Cliente, Integer>(Collections.reverseOrder());
            reverseSortedMap.putAll(myDict);
            
            int c = 1;
            if (myDict.size() <= 10) 
                {
                    for (Entry<Cliente, Integer> entry : myDict.entrySet()) 
                        {
                            String key = entry.getKey().nome;
                            Object val = entry.getValue();
                            System.out.println("\nCliente Nº " + c);
                            System.out.println("\nNome: " + key);
                            System.out.println("Produtos Consumidos: " + val);
                            c++;
                        }
                } 
            else {
                for (Entry<Cliente, Integer> entry : myDict.entrySet()) 
                    {
                        String key = entry.getKey().nome;
                        Object val = entry.getValue();
                        System.out.println("\nCliente Nº " + c);
                        System.out.println("\nNome: " + key);
                        System.out.println("Produtos Consumidos: " + val);
                        c++;
                        if (c > 10) 
                            {
                                break;
                            }
                    }
                
            }
            
        }
    
}
