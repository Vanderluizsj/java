
package revisaoex3;

public class Main {

    public static void main(String[] args) {
       Retangulo r1 = new Retangulo(2, 4);
       Retangulo r2 = new Retangulo(2, 6);
        r1.calcularArea();
        r1.calcularPerimetro();
        r1.imprime();
        r2.calcularArea();
        r2.calcularPerimetro();
        r2.imprime();
    }
    
}
