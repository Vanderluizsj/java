
package ex6_animalsom;

public class Main {

    public static void main(String[] args) {
        //criação de objetos
       Animal gato = new Gato("Mingau", 6);
       Animal cachorro = new Cachorro("Totó", 15);
       
       //chamada metodo gato
       gato.imprime();
       gato.fazerExercicio();
       gato.emitirSom();
       gato.imprime();
       //chamada metodos cachorro
       cachorro.imprime();
       cachorro.fazerExercicio();
       cachorro.emitirSom();
       cachorro.imprime();
       
       
    }
    
   
    
}
