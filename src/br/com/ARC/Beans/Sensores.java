package br.com.ARC.Beans;

public class Sensores extends Data{
    private int numPessoas;

    //metodos Construtor vazio

    public Sensores() {
        super();
    }

    //metodo construtor cheio

    public Sensores(String numberId, String tipoDado, String dado, String timeStamp, String localizacao, boolean statusCaptura) {
        super(numberId, tipoDado, dado, timeStamp, localizacao, statusCaptura);
        this.numPessoas = Integer.parseInt(dado);
    }

    // metodos setters e getters

    public int getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }
}

