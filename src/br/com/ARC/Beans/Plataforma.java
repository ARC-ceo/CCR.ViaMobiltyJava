package br.com.ARC.Beans;

public class Plataforma {
    private String nuumeroDaPlataforma;
    private int lotacaoAtual;
    private Camera cameras;
    private Sensores sensores;
    private Aplicativo aplicativo;
    private String nomeDaEstacao;

    //metodo construtor vazio
    public Plataforma() {
        super();
    }

    //metodo construtor sem atributo de referencia

    public Plataforma(String nuumeroDaPlataforma, int lotacaoAtual, String nomeDaEstacao) {
        super();
        this.nuumeroDaPlataforma = nuumeroDaPlataforma;
        this.lotacaoAtual = lotacaoAtual;
        this.nomeDaEstacao = nomeDaEstacao;
    }

    //metodos setter e getters

    public String getNuumeroDaPlataforma() {
        return nuumeroDaPlataforma;
    }

    public void setNuumeroDaPlataforma(String nuumeroDaPlataforma) {
        this.nuumeroDaPlataforma = nuumeroDaPlataforma;
    }

    public int getLotacaoAtual() {
        return lotacaoAtual;
    }

    public void setLotacaoAtual(int lotacaoAtual) {
        this.lotacaoAtual = lotacaoAtual;
    }

    public Camera getCameras() {
        return cameras;
    }

    public void setCameras(Camera cameras) {
        this.cameras = cameras;
    }

    public Sensores getSensores() {
        return sensores;
    }

    public void setSensores(Sensores sensores) {
        this.sensores = sensores;
    }

    public Aplicativo getAplicativo() {
        return aplicativo;
    }

    public void setAplicativo(Aplicativo aplicativo) {
        this.aplicativo = aplicativo;
    }

    public String getNomeDaEstacao() {
        return nomeDaEstacao;
    }

    public void setNomeDaEstacao(String nomeDaEstacao) {
        this.nomeDaEstacao = nomeDaEstacao;
    }
}
