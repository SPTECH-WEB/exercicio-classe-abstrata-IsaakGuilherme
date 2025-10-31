package school.sptech;

public class Triangulo extends Figura{
    private Double base;
    private Double altura;

    public Triangulo(){

    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public Double calcularArea(){
        return (getBase() * getAltura())/2;
    }

    @Override
    public String toString() {
        return "Área do triângulo é: " + calcularArea();
    }
}
