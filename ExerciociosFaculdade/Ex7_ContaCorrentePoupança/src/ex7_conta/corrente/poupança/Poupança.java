
package ex7_conta.corrente.poupança;

public class Poupança extends Conta{
    
    //chamada aos atributos da classe mae
    public Poupança(String titular, int numero, double saldo, double rendimentos) {
        super(titular, numero, saldo, rendimentos);
    }
  
    
    @Override   //metodo subscrito
    public void calculaRendimento(){
        saldo *= 1.05;
    }   
}
