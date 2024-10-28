package br.com.ARC.Beans;

public class Passageiros {
    private String nome;
    private int idade;
    private int embarque;
    private int destino;
    private int idPassageiro;

    //metodo construtor vazio
    public Passageiros() {
        super ();
    }

    //metodo construtor cheio
    public Passageiros(String nome, int idade, int embarque, int destino, int idPassageiro) {
        super ();
        this.nome = nome;
        this.idade = idade;
        this.embarque = embarque;
        this.destino = destino;
        this.idPassageiro = idPassageiro;
    }

    // metodos setters e getters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getEmbarque() {
        return embarque;
    }

    public void setEmbarque(int embarque) {
        this.embarque = embarque;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    public int getIdPassageiro() {
        return idPassageiro;
    }

    public void setIdPassageiro(int idPassageiro) {
        this.idPassageiro = idPassageiro;
    }
}
