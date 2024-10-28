package br.com.ARC.Beans;

public class Vagao {
    private String numeroDoVagao;
    private int capacidade;
    private int quantidadeDePessoas;
    private int sensoresInternos;

    //metodo construtor vazio

    public Vagao() {
        super ();
    }

    //metodo construtor cheio

    public Vagao(String numeroDoVagao, int capacidade, int quantidadeDePessoas, int sensoresInternos) {
        super ();
        this.numeroDoVagao = numeroDoVagao;
        this.capacidade = capacidade;
        this.quantidadeDePessoas = quantidadeDePessoas;
        this.sensoresInternos = sensoresInternos;
    }

    //metodos setters e getters

    public String getNumeroDoVagao() {
        return numeroDoVagao;
    }

    public void setNumeroDoVagao(String numeroDoVagao) {
        this.numeroDoVagao = numeroDoVagao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQuantidadeDePessoas() {
        return quantidadeDePessoas;
    }

    public void setQuantidadeDePessoas(int quantidadeDePessoas) {
        this.quantidadeDePessoas = quantidadeDePessoas;
    }

    public int getSensoresInternos() {
        return sensoresInternos;
    }

    public void setSensoresInternos(int sensoresInternos) {
        this.sensoresInternos = sensoresInternos;
    }
}
