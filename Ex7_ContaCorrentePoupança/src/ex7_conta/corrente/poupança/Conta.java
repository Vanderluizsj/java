
package ex7_conta.corrente.poupança;

public class Conta {
    protected String titular;
    protected int numero;
    protected double saldo;           
    protected double rendimentos;

    public Conta(String titular, int numero, double saldo, double rendimentos) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        this.rendimentos = rendimentos;
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getRendimentos() {
        return rendimentos;
    }

    public void setRendimentos(double rendimentos) {
        this.rendimentos = rendimentos;
    }
    
    public void depositar(double valor){
    saldo+=valor;
    }
    
    public void sacar(double valor){
    if(saldo>valor){
    saldo-=valor;
    }
    else{
        System.out.println("Saldo insuficiente!");
    }
    }
    public void calculaRendimento(){
    
    }

    @Override
    public String toString() {
        return "Conta{" + "titular=" + titular + ", numero=" + numero + ", saldo=" + saldo + ", rendimentos=" + rendimentos + '}';
    }
    public void imprimeRecibo(){
        System.out.println(toString());
    }
}
