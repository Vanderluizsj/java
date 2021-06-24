
package conta;

public class ContaCorrente extends Conta{

    public ContaCorrente(String titular, String numero, double saldo) {
        super(titular, numero, saldo);
    }
    @Override
    public void extrato(){
       System.out.println(toString());
    }
}
