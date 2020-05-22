
package revisaoex2;


public class Main {

   
    public static void main(String[] args) {
        Conta conta = new Conta("Andre", 235, 2000);
        
        conta.extrato();
        conta.sacar(500);
        conta.extrato();
        conta.depositar(190.50);
        conta.extrato();
        
    }
    
}
