
package ex7_conta.corrente.poupança;

public class Corrente extends Conta{

    public Corrente(String titular, int numero, double saldo, double rendimentos) {
        super(titular, numero, saldo, rendimentos);
    }
    @Override
    public void calculaRendimento(){
        saldo *= 1.01;
    }    
}
