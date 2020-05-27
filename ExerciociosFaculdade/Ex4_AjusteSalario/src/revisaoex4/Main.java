
package revisaoex4;

public class Main {

      public static void main(String[] args) {
        Empregado funcionario1 = new Empregado("Andre", "Oliveira", 2000);
        Empregado funcionario2 = new Empregado("Joao", "Silva", 1500);
        
        funcionario1.imprime();
        funcionario1.salarioAnual(1000);
        
        funcionario2.imprime();
        funcionario2.salarioAnual(500);
        
        
    }
    
}
