package school.sptech;

public class Circulo extends Figura{
    private Double raio;

    public Circulo(){

    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double calcularArea(){
        return Math.pow(getRaio(), 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Área do circulo é: " + calcularArea();
    }
}
