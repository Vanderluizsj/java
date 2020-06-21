
package ex6_animalsom;

public class Gato extends Animal{
    
    //chamado construtor classe mae
    public Gato(String nome, float peso) {
        super(nome, peso);
    }
    //getters e setters 
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
    //reescrito metodo da classe mae
    @Override
    public void emitirSom(){
        System.out.println("Miaaaaaaaaaaau");
    }
}
