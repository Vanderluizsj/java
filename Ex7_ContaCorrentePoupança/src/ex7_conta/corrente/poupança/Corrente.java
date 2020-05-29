
package ex7_conta.corrente.poupança;

public class Corrente extends Conta{

    //chamada aos atributos da classe mae
    public Corrente(String titular, int numero, double saldo, double rendimentos) {
        super(titular, numero, saldo, rendimentos);
    }
    @Override           //metodo subscrito
    public void calculaRendimento(){
        saldo *= 1.01;
    }    
}
