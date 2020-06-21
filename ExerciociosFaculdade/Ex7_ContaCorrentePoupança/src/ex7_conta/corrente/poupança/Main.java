
package ex7_conta.corrente.poupança;

public class Main {

       public static void main(String[] args) {
        //objetos filhos da classe conta
        Conta c1 = new Poupança("Luiz", 1132, 1000, 200);
        Conta c2 = new Corrente("Jose", 1133, 1000, 200);
       //chamadas aos metodos de c1
        c1.imprimeRecibo();
        c1.calculaRendimento();
        c1.depositar(500);
        c1.sacar(2000);
        c1.imprimeRecibo();
        //chamadas aos metodos de c2
        c2.imprimeRecibo();
        c2.calculaRendimento();
        c2.depositar(100);
        c2.sacar(500);
        c2.imprimeRecibo();
        
    }
    
}
