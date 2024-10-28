package br.com.ARC.Beans;

public class Aplicativo {
    private String nome;
    private String notificacoes;
    private Data dadosCapturados;

    //metodos construtor vazio

    public Aplicativo() {
        super();
    }

    //metodos construtor sem atributo de refencia

    public Aplicativo(String nome, String notificacoes) {
        super();
        this.nome = nome;
        this.notificacoes = notificacoes;
    }

    // metodos Setters e getters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNotificacoes() {
        return notificacoes;
    }

    public void setNotificacoes(String notificacoes) {
        this.notificacoes = notificacoes;
    }

    public Data getDadosCapturados() {
        return dadosCapturados;
    }

    public void setDadosCapturados(Data dadosCapturados) {
        this.dadosCapturados = dadosCapturados;
    }
}
