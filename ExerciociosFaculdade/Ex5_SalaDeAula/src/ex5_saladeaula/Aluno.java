
package ex5_saladeaula;

public class Aluno extends Pessoa{//extends é usado para indicar de que classe essa classe é filha
   private int matricula;
   private double bolsa;

    public Aluno(int matricula, double bolsa, String nome, float cpf) {
        super(nome, cpf);   //chamada aos atributos da classe mae
        this.matricula = matricula;
        this.bolsa = bolsa;
    }
    //getters e setters classe filha aluno
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }


   //metodos subscritos
   @Override
    public void fala(){
       System.out.println("Professor, não entendi!");
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", bolsa=" + bolsa + '}';
    }
    
   @Override
    public void perfil(){
       System.out.println(toString());
    }
}
