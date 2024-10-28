package br.com.ARC.Beans;

public class Camera {
    private boolean status;
    private String localizacao;
    private String idCamera;
    private Data dadosCapturados;

    //metodos construtor vazio

    public Camera() {
        super();
    }


    //metodos construtor sem atributo de refencia
    public Camera(boolean status, String localizacao, String idCamera) {
        super();
        this.status = status;
        this.localizacao = localizacao;
        this.idCamera = idCamera;
    }


    //metodos setters e getters
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

    public String getIdCamera() {
        return idCamera;
    }

    public void setIdCamera(String idCamera) {
        this.idCamera = idCamera;
    }

    public Data getDadosCapturados() {
        return dadosCapturados;
    }

    public void setDadosCapturados(Data dadosCapturados) {
        this.dadosCapturados = dadosCapturados;
    }
}
