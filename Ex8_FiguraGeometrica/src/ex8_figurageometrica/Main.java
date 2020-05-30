
package ex8_figurageometrica;

public class Main {

    public static void main(String[] args) {
        FiguraGeometrica q1 = new Quadrado(2, 2);
        FiguraGeometrica t1 = new Triangulo(3, 3);
        q1.calculaArea();
        q1.calculaPerimetro();
        t1.calculaArea();
        t1.calculaPerimetro();
        
    }
    
}
