
package conta;

public class Poupanca extends Conta{
    private double rendimento;

    public Poupanca(double rendimento, String titular, String numero, double saldo) {
        super(titular, numero, saldo);
        this.rendimento = rendimento;
    }
    
    public double calculaRendimento(){
        saldo*=1.03;
        return saldo;
    }
    
    @Override
    public void extrato(){
       System.out.println(toString());
    }
}
