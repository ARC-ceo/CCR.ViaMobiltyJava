package br.com.ARC.Beans;

public class Sensores {
    private boolean status;
    private String localizacao;
    private String idSensores;
    private String tipoSensores;
    private Data dadosCapturados;

    //metodos Construtor vazio

    public Sensores() {
        super();
    }

    //metodos Construtor sem atributo de refenciia

    public Sensores(boolean status, String localizacao, String idSensores, String tipoSensores) {
        super();
        this.status = status;
        this.localizacao = localizacao;
        this.idSensores = idSensores;
        this.tipoSensores = tipoSensores;
    }

    // metodos setters e getters

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getIdSensores() {
        return idSensores;
    }

    public void setIdSensores(String idSensores) {
        this.idSensores = idSensores;
    }

    public String getTipoSensores() {
        return tipoSensores;
    }

    public void setTipoSensores(String tipoSensores) {
        this.tipoSensores = tipoSensores;
    }

    public Data getDadosCapturados() {
        return dadosCapturados;
    }

    public void setDadosCapturados(Data dadosCapturados) {
        this.dadosCapturados = dadosCapturados;
    }
}
