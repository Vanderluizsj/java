
package revisaoex1;

public class Pessoa {
  private String nome;
  private int peso;
  private int idade;

    public Pessoa(String nome, int peso, int idade) {   //contrutor(receita de como declarar objeto)
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
    }
  
    public void caminha(){      //metodo que decrementa o peso se ele for superior a 0 
    if(peso>0){
    peso--;
    } else{
        System.out.println("Peso declarado é inferior ao minimo!");
    }
    }
    
    public void come(){    //metodo que incrementa peso
    peso++;    
    }
    
    public void fazAniversario(){    //metodo que incrementa idade
    idade++;    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", peso=" + peso + ", idade=" + idade + '}';
    }
    
    public void imprime(){ //metodo para imprimir atributos do objeto
        System.out.println(toString());
    }
  
}
