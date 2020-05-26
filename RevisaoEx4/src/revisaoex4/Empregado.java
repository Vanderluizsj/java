
package revisaoex4;

public class Empregado {
   private String nome;
   private String sobrenome;
   private float salario;

    public Empregado(String nome, String sobrenome, float salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
   
   public void salarioAnual(float aumento){
       salario+=aumento;
       System.out.println("O salario atual é de:"+salario);
   }

    @Override
    public String toString() {
        return "Empregado{" + "nome=" + nome + ", sobrenome=" + sobrenome + ", salario=" + salario + '}';
    }
   
   public void imprime(){
       System.out.println(toString());
   }
}
