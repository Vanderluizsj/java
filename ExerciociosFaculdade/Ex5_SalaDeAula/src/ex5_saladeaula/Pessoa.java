
package ex5_saladeaula;

public class Pessoa {
    //metodo protected usado para que os atributos sejam passados por herança
    protected String nome; 
    protected float cpf;

    public Pessoa(String nome, float cpf) { //contrutor simples(receita de como será feito cada objeto)
        this.nome = nome;
        this.cpf = cpf;
    }
    //getters e setters da classe mae
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getCpf() {
        return cpf;
    }

    public void setCpf(float cpf) {
        this.cpf = cpf;
    }
    
    //metodos que serão sobreescritos
    public void fala(){
    
    }
    public void perfil(){
    
    }
}
