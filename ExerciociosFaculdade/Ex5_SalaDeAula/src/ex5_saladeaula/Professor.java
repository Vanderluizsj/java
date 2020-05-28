
package ex5_saladeaula;

public class Professor extends Pessoa{ //extends é usado para indicar de que classe essa classe é filha
    private int siape;
    private double salario;

    public Professor(int siape, double salario, String nome, float cpf) {
        super(nome, cpf);   //chamada aos atributos da classe mae
        this.siape = siape;
        this.salario = salario;
    }
    //getters e setters classe filha professor
    public int getSiape() {
        return siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //metodos subscritos
   @Override 
    public void fala(){
        System.out.println("Alguma dúvida?");
    }

    @Override
    public String toString() {
        return "Professor{" + "siape=" + siape + ", salario=" + salario + '}';
    }
    
    @Override
    public void perfil(){
        System.out.println(toString());
    }
}
