
package ex8_figurageometrica;

public class Triangulo extends FiguraGeometrica{

    public Triangulo(double base, double altura) {
        super(base, altura);
    }
     
        
    @Override
    public double calculaArea(){
        double area = (base*altura)/2;
        System.out.println("Area triangulo"+area);
        return area;
       
    }
    @Override
     public double calculaPerimetro(){
        double perimetro = base*3;
        System.out.println("Perimetro triangulo"+perimetro);
        return perimetro;
       
    }
}
