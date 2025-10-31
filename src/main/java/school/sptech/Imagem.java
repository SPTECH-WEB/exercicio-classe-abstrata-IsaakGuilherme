package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras;

    public Imagem() {
        this.figuras = new ArrayList<>();
    }

    public void adicionar(Figura figura){
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        Double somaFiguras = 0.0;
        for (Figura d: figuras){
            somaFiguras += d.calcularArea();
        }

        return somaFiguras;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> figurasMaioque20 = new ArrayList<>();

        for (int i = 0; i < figuras.size(); i++){
            if (figuras.get(i).calcularArea() > 20.0){
                figurasMaioque20.add(figuras.get(i));
            }
        }

        return figurasMaioque20;
    }

    public List<Figura> buscarQuadrados(){
        List<Figura> quadradosFigura = new ArrayList<>();

        for (int i = 0; i < figuras.size(); i++){
            if (figuras.get(i) instanceof Quadrado){
                quadradosFigura.add(figuras.get(i));
            }
        }

        return quadradosFigura;
    }
}
