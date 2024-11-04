package br.com.ARC.Beans;

import java.util.List;

public class Trem {
    private String numeroDoTrem;
    private int capacidade;
    private int sensor;

    //metodos construtor vazio

    public Trem() {
        super();
    }

    //metodo construtor cheio

    public Trem(String numeroDoTrem, int capacidade, Sensores sensor) {
        this.numeroDoTrem = numeroDoTrem;
        this.capacidade = capacidade;
        this.sensor = sensor.getNumPessoas();
    }

    //metodos setters e getters

    public String getNumeroDoTrem() {
        return numeroDoTrem;
    }

    public void setNumeroDoTrem(String numeroDoTrem) {
        this.numeroDoTrem = numeroDoTrem;
    }

    public int getcapacidade() {
        return capacidade;
    }

    public void setcapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getSensor() {
        return sensor;
    }

    public void setSensor(int sensor) {
        this.sensor = sensor;
    }

    // metodo work para calcular lotação

    public String statusOcupacao(){
        if (sensor < capacidade){
            return "Não consta superlotação\n";
        }
        else {
            return "SUPERLOTAÇÃO DETECTADA!\n";
        }
    }

    // Frontzinho

    @Override
    public String toString() {
        return "\n\nVagao{" +
                "\nnumeroDoTrem='" + numeroDoTrem + '\'' +
                "\ncapacidade=" + capacidade +
                "\nOcupação: " + statusOcupacao() +
                '}';
    }
}
