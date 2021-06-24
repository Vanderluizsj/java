
package conta;

public class Conta {
   protected String titular;
   protected String numero;
   protected double saldo;

    public Conta(String titular, String numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   
   public void depositar(double valor){
       saldo+=valor;
   }
   
   public void sacar(double valor){
       saldo+=valor;
   }
   
   public void extrato(){
       System.out.println(toString());
   }

    @Override
    public String toString() {
        return "Conta{" + "titular=" + titular + ", numero=" + numero + ", saldo=" + saldo + '}';
    }
   
   
}
