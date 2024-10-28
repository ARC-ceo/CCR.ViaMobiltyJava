package br.com.ARC.Beans;

import java.util.List;

public class Trem {
    private String numeroDoTrem;
    private Vagao vagoes;
    private int capacidadeTotal;
    private int quantidadeDeVagoes;

    //metodos construtor vazio
    public Trem() {
        super();
    }

    //metodos construtor sem atributo de referencia
    public Trem(String numeroDoTrem, int capacidadeTotal, int quantidadeDeVagoes) {
        super();
        this.numeroDoTrem = numeroDoTrem;
        this.capacidadeTotal = capacidadeTotal;
        this.quantidadeDeVagoes = quantidadeDeVagoes;
    }

    //metodos setters e getters


    public String getNumeroDoTrem() {
        return numeroDoTrem;
    }

    public void setNumeroDoTrem(String numeroDoTrem) {
        this.numeroDoTrem = numeroDoTrem;
    }

    public Vagao getVagoes() {
        return vagoes;
    }

    public void setVagoes(Vagao vagoes) {
        this.vagoes = vagoes;
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }

    public int getQuantidadeDeVagoes() {
        return quantidadeDeVagoes;
    }

    public void setQuantidadeDeVagoes(int quantidadeDeVagoes) {
        this.quantidadeDeVagoes = quantidadeDeVagoes;
    }
}
