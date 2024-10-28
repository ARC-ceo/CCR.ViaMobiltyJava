package br.com.ARC.Beans;

public class CamerasInternas {
    private String numeroCamera;
    private int quantidadePessoasDetectadas;
    private String status;
    private Data dadosCapturados;


    //metodos construtor vazio

    public CamerasInternas() {
        super();
    }


    //metodos construtor sem atributo de refencia

    public CamerasInternas(String numeroCamera, int quantidadePessoasDetectadas, String status) {
        super();
        this.numeroCamera = numeroCamera;
        this.quantidadePessoasDetectadas = quantidadePessoasDetectadas;
        this.status = status;
    }


    //metodos setters e getters

    public String getNumeroCamera() {
        return numeroCamera;
    }

    public void setNumeroCamera(String numeroCamera) {
        this.numeroCamera = numeroCamera;
    }

    public int getQuantidadePessoasDetectadas() {
        return quantidadePessoasDetectadas;
    }

    public void setQuantidadePessoasDetectadas(int quantidadePessoasDetectadas) {
        this.quantidadePessoasDetectadas = quantidadePessoasDetectadas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Data getDadosCapturados() {
        return dadosCapturados;
    }

    public void setDadosCapturados(Data dadosCapturados) {
        this.dadosCapturados = dadosCapturados;
    }
}
