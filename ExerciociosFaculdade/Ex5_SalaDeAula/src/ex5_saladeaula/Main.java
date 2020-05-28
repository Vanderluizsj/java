
package ex5_saladeaula;

public class Main {

    public static void main(String[] args) {
        //declaração de objetos
        Pessoa a1 = new Aluno(201910, 1000.50, "Andre", 10305231);
        Pessoa p1 = new Professor(2010102, 3200.90, "Jose", 05223116700);
        //chamada aos metodos
        p1.perfil();
        p1.fala();
        a1.perfil();
        a1.fala();
        
    }
    
}
