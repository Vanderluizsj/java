
package ex6_animalsom;

public class Animal {
    protected String nome;
    protected float peso;

    public Animal(String nome, float peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public void fazerExercicio(){
        if(peso>0){
        peso--;
        }
    }
    public void emitirSom(){
    
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", peso=" + peso + '}';
    }
    
    public void imprime(){
        System.out.println(toString());
    } 
}
