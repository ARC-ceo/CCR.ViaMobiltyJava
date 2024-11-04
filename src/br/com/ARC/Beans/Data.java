package br.com.ARC.Beans;

public abstract class Data {
    protected String numberId;
    protected String tipoDado;
    protected String dado;
    protected String timeStamp;
    protected String localizacao;
    protected boolean statusCaptura;

    //metodo Construtor vazio

    public Data() {
        super();
    }

    //metodo Construtor cheio

    public Data(String numberId, String tipoDado, String dado, String timeStamp, String localizacao, boolean statusCaptura) {
        this.numberId = numberId;
        this.tipoDado = tipoDado;
        this.dado = dado;
        this.timeStamp = timeStamp;
        this.localizacao = localizacao;
        this.statusCaptura = statusCaptura;
    }

    // metodos Setter e Getters

    public String getNumberId() {
        return numberId;
    }

    public void setNumberId(String numberId) {
        this.numberId = numberId;
    }

    public String getTipoDado() {
        return tipoDado;
    }

    public void setTipoDado(String tipoDado) {
        this.tipoDado = tipoDado;
    }

    public String getDado() {
        return dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
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

    public boolean isStatusCaptura() {
        return statusCaptura;
    }

    public void setStatusCaptura(boolean statusCaptura) {
        this.statusCaptura = statusCaptura;
    }

    // Frontzinho

    @Override
    public String toString() {
        return "\nData{" +
                "\nnumberId='" + numberId + '\'' +
                "\ntipoDado='" + tipoDado + '\'' +
                "\ndado='" + dado + '\'' +
                "\ntimeStamp='" + timeStamp + '\'' +
                "\nlocalizacao='" + localizacao + '\'' +
                "\nstatusCaptura=" + statusCaptura +
                '}';
    }
}
