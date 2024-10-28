package br.com.ARC.Beans;

public class Data {
    private String tipoDado;
    private String valor;
    private String timeStamp;
    private String localizacao;
    private String sensoresID;
    private boolean status;

    //metodo Construtor vazio
    public Data() {
        super();
    }

    //metodo Construtor cheio

    public Data(String tipoDado, String valor, String timeStamp, String localizacao, String sensoresID, boolean status) {
        super ();
        this.tipoDado = tipoDado;
        this.valor = valor;
        this.timeStamp = timeStamp;
        this.localizacao = localizacao;
        this.sensoresID = sensoresID;
        this.status = status;
    }

    // metodos Setter e Getters

    public String getTipoDado() {
        return tipoDado;
    }

    public void setTipoDado(String tipoDado) {
        this.tipoDado = tipoDado;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getSensoresID() {
        return sensoresID;
    }

    public void setSensoresID(String sensoresID) {
        this.sensoresID = sensoresID;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
