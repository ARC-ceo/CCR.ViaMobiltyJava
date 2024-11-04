package br.com.ARC.Beans;

public class CamerasInternas extends Data {
    private int numPessoas;

    //metodos construtor vazio

    public CamerasInternas() {
        super();
    }

    //metodo construtor cheio

    public CamerasInternas(String numberId, String tipoDado, String dado, String timeStamp, String localizacao, boolean statusCaptura) {
        super(numberId, tipoDado, dado, timeStamp, localizacao, statusCaptura);
        this.numPessoas = Integer.parseInt(dado);
    }

    //metodos setters e getters

    public int getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }
}
