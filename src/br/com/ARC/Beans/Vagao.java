package br.com.ARC.Beans;

public class Vagao {
    private String numeroDoVagao;
    private int capacidade;
    private int camera;
    private int sensor;

    //metodo construtor vazio

    public Vagao() {
        super ();
    }

    //metodo construtor cheio

    public Vagao(String numeroDoVagao, int capacidade, CamerasInternas camera, Sensores sensor) {
        this.numeroDoVagao = numeroDoVagao;
        this.capacidade = capacidade;
        this.camera = camera.getNumPessoas();
        this.sensor = sensor.getNumPessoas();
    }

    //metodos setters e getters

    public String getNumeroDoVagao() {
        return numeroDoVagao;
    }

    public void setNumeroDoVagao(String numeroDoVagao) {
        this.numeroDoVagao = numeroDoVagao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getSensor() {
        return sensor;
    }

    public void setSensor(int sensor) {
        this.sensor = sensor;
    }

    // metodo work para calcular lotação

    public String statusOcupacao(){
        double media = (camera + sensor) / 2.0;
        if (media < capacidade){
            return "Não consta superlotação\n";
        }
        else {
            return "SUPERLOTAÇÃO DETECTADA!\n";
        }
    }

    // Frontzinho

    @Override
    public String toString() {
        return "\n\nVagao{" +
                "\nnumeroDoVagao='" + numeroDoVagao + '\'' +
                "\ncapacidade=" + capacidade +
                "\nOcupação: " + statusOcupacao() +
                '}';
    }
}
