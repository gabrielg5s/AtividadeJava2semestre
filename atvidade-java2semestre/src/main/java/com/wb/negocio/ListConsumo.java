package com.wb.negocio;

import java.util.List;
import com.wb.modelo.Consumo;
import com.wb.modelo.Produto;

public class ListConsumo extends Listagem {
    private List<Consumo> consumos;

    public ListConsumo(List<Consumo> consumos) {
        this.consumos = consumos;
    }

    @Override
    public void listar() 
        {

            System.out.println("\nCONSUMOS:");
            int c = 1;
            for (Consumo consumo : consumos) 
                {
                    System.out.println("\nVenda Nº " + c);
                    c += 1;
                    System.out.print("\nCliente: " + consumo.getCliente().nome);
                    System.out.print("\nValor: R$ " + consumo.getPrecoTotal());
                    System.out.println("\nData: " + consumo.getDataConsumo());
                    for (Produto prodCons : consumo.getProdutosConsumidos()) {
                        System.out.print("\nProduto: " + prodCons.getNome());
                        System.out.println("\nPreço: R$ " + prodCons.getPreco());
                    }
                }
        }
}
