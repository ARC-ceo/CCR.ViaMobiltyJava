package br.com.ARC.Beans;

public class CentroControle {
    private String linha4Status;
    private String linha5Status;
    private String linha8Status;
    private String linha9Status;

    public CentroControle() {
        super();
    }

    // Construtor que inicializa as linhas como "Normal"

    public CentroControle(String linha4Status, String linha5Status, String linha8Status, String linha9Status) {
        this.linha4Status = linha4Status;
        this.linha5Status = linha5Status;
        this.linha8Status = linha8Status;
        this.linha9Status = linha9Status;
    }

    // Métodos para atualizar o status de cada linha

    public String getLinha4Status() {
        return linha4Status;
    }

    public void setLinha4Status(String linha4Status) {
        this.linha4Status = linha4Status;
    }

    public String getLinha5Status() {
        return linha5Status;
    }

    public void setLinha5Status(String linha5Status) {
        this.linha5Status = linha5Status;
    }

    public String getLinha8Status() {
        return linha8Status;
    }

    public void setLinha8Status(String linha8Status) {
        this.linha8Status = linha8Status;
    }

    public String getLinha9Status() {
        return linha9Status;
    }

    public void setLinha9Status(String linha9Status) {
        this.linha9Status = linha9Status;
    }

    public String statusLinha(){
        return  "\nlinha 4 Status= " + linha4Status +
                "\nlinha 5 Status= " + linha5Status +
                "\nlinha 8 Status= " + linha8Status +
                "\nlinha 9 Status= " + linha9Status;
    }

    @Override
    public String toString() {
        return "\nCentroControle{" +
                "\nlinha 4 Status= '" + linha4Status + '\'' +
                "\nlinha 5 Status= '" + linha5Status + '\'' +
                "\nlinha 8 Status= '" + linha8Status + '\'' +
                "\nlinha 9 Status= '" + linha9Status + '\'' +
                '}';
    }
}