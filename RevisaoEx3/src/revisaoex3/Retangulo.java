
package revisaoex3;

public class Retangulo {
    private float altura;
    private float largura;

    public Retangulo(float altura, float largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }
    
    public float calcularArea(){
        float area;
        area=altura*largura;
    return area;
    }
     public float calcularPerimetro(){
        float perimetro;
        perimetro=(altura*2)+(largura*2);
    return perimetro;
    }
    
   
    @Override
    public String toString() {
        return "Retangulo{" + "altura=" + altura + ", largura=" + largura + ", Area=" + calcularArea()+ ", Perimetro=" + calcularPerimetro() +'}';
    }
    public void imprime(){
        System.out.println(toString());
    }
    
    
    
}
