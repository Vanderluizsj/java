
package ex8_figurageometrica;

public class Quadrado extends FiguraGeometrica{

    public Quadrado(double base, double altura) {
        super(base, altura);
    }
    
       
    @Override
    public double calculaArea(){
        double area=base*altura;
        System.out.println("Area quadrado: "+area);
        return area;
        
    }
    @Override
     public double calculaPerimetro(){
         double perimetro=4*altura;
         System.out.println("Perimetro quadrado: "+perimetro);
        return perimetro;
       
    }
}
