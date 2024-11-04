package br.com.ARC.Beans;

public class Plataforma {
    private String numeroDaPlataforma;
    private String nomeDaEstacao;
    private int camera;
    private int sensor;

    //metodo construtor vazio

    public Plataforma() {
        super();
    }

    //metodo construtor cheio

    public Plataforma(String numeroDaPlataforma, String nomeDaEstacao, Camera camera, Sensores sensor) {
        this.numeroDaPlataforma = numeroDaPlataforma;
        this.nomeDaEstacao = nomeDaEstacao;
        this.camera = camera.getNumPessoas();
        this.sensor = sensor.getNumPessoas();
    }

    //metodos setter e getters

    public String getNumeroDaPlataforma() {
        return numeroDaPlataforma;
    }

    public void setNumeroDaPlataforma(String numeroDaPlataforma) {
        this.numeroDaPlataforma = numeroDaPlataforma;
    }

    public String getNomeDaEstacao() {
        return nomeDaEstacao;
    }

    public void setNomeDaEstacao(String nomeDaEstacao) {
        this.nomeDaEstacao = nomeDaEstacao;
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

    public String statusFluxo(){
        double media = (camera + sensor) / 2.0;
        return String.format("%.2f", media);
    }

    // Frontzinho

    @Override
    public String toString() {
        return "\n\nPlataforma{" +
                "\nnumeroDaPlataforma='" + numeroDaPlataforma + '\'' +
                "\nnomeDaEstacao='" + nomeDaEstacao + '\'' +
                "\nFluxo de pessoas: " + statusFluxo() + '\'' +
                '}';
    }
}
