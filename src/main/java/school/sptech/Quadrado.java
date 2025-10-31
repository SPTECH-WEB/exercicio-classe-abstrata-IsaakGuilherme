package school.sptech;

public class Quadrado extends Figura{
    private Double lado;

    public Quadrado(){

    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public Double calcularArea(){
        return getLado() * getLado();
    }

    @Override
    public String toString() {
        return "Área do quadrado é: " + calcularArea();
    }
}
