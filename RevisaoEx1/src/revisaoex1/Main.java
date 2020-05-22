
package revisaoex1;


public class Main {

    public static void main(String[] args) {
        //declaração de objetos
        Pessoa pessoa = new Pessoa("Andre", 70, 45);
        Pessoa pessoa2 = new Pessoa("Jose",70, 50);
        
        //chamadas aos metodos
        pessoa.come();
        pessoa2.caminha();
        pessoa.fazAniversario();        
        pessoa.imprime();
        pessoa2.imprime();
        
        
        
    }
    
}
