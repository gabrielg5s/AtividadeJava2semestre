package com.wb.modelo;

public class ConsumoProduto implements Comparable<ConsumoProduto> {
    public Integer qantConsumo;
    public String nome;

    public ConsumoProduto(Integer qantConsumo, String nome) {
        this.qantConsumo = qantConsumo;
        this.nome = nome;
    }

    @Override
    public int compareTo(ConsumoProduto o) {
        return o.qantConsumo.compareTo(this.qantConsumo);
    }
    
}
