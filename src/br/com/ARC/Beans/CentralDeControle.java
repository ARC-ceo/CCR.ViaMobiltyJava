package br.com.ARC.Beans;

public class CentralDeControle {
    private String idDaCentral;
    private boolean statusDoSistema;
    private Data dadosMonitorados;
    private String alertaGerados;

    //metodo construtor vazio

    public CentralDeControle() {
        super();
    }

    //metodo construtor sem atributo de refencia

    public CentralDeControle(String idDaCentral, boolean statusDoSistema, String alertaGerados) {
        super();
        this.idDaCentral = idDaCentral;
        this.statusDoSistema = statusDoSistema;
        this.alertaGerados = alertaGerados;
    }

    //metodos setters e getters

    public String getIdDaCentral() {
        return idDaCentral;
    }

    public void setIdDaCentral(String idDaCentral) {
        this.idDaCentral = idDaCentral;
    }

    public boolean isStatusDoSistema() {
        return statusDoSistema;
    }

    public void setStatusDoSistema(boolean statusDoSistema) {
        this.statusDoSistema = statusDoSistema;
    }

    public Data getDadosMonitorados() {
        return dadosMonitorados;
    }

    public void setDadosMonitorados(Data dadosMonitorados) {
        this.dadosMonitorados = dadosMonitorados;
    }

    public String getAlertaGerados() {
        return alertaGerados;
    }

    public void setAlertaGerados(String alertaGerados) {
        this.alertaGerados = alertaGerados;
    }
}
