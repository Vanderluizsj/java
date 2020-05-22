
package revisaoex2;

public class Conta {
  private String titular;
  private int numero;
  private float saldo;
  
  
  //contrutor
  public Conta(String titular, int numero, float saldo){
  this.titular=titular;
  this.numero=numero;
  this.saldo=saldo;  
  }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
  
  public void sacar(double valor){ //verifica se saldo>valor e realiza o saque se true
      if(getSaldo()>=valor){
        saldo-=valor;
      }
      else{
        System.out.println("Saldo insuficiente");   
      }
  
  }
  public void depositar(double valor){  //incrementa o saldo com o valor depositado
  saldo+=valor;
  }

    @Override
    public String toString() {          //reune os dados da conta e converte em String
        return "Conta{" + "titular=" + titular + ", numero=" + numero + ", saldo=" + saldo + '}';
    }

    
    public void extrato(){      //imprime dados da conta atraves do toString
        System.out.println(toString());
    }
          
          
}
