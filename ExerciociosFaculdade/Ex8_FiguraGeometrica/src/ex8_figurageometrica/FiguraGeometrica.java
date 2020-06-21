
package ex8_figurageometrica;

public class FiguraGeometrica {
    protected double base;
    protected double altura;

    public FiguraGeometrica(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calculaArea(){
        return 0;
       
    }
     public double calculaPerimetro(){
        return 0;
       
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "base=" + base + ", altura=" + altura + '}';
    }
     
}
