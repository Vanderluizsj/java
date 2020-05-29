
package ex7_conta.corrente.poupança;

public class Poupança extends Conta{

    public Poupança(String titular, int numero, double saldo, double rendimentos) {
        super(titular, numero, saldo, rendimentos);
    }
  
    
    @Override
    public void calculaRendimento(){
        saldo *= 1.05;
    }   
}
