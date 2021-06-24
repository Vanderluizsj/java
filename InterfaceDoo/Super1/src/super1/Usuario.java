
package super1;

import java.util.ArrayList;

public class Usuario {
  
    private String nome;
    private String cpf;
    static ArrayList <Usuario> listaUsuario = new ArrayList();
    static ArrayList <Usuario> listaUsuarioAdm = new ArrayList();

    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Usuario() {
       
    }
    
    public void addAdm(){
        Usuario usuario1 = new Usuario();
        usuario1.nome = "adm";
        usuario1.cpf="1234";
    listaUsuarioAdm.add(usuario1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public boolean ehUsuarioAdm(Usuario adm){
        for (Usuario usuario : listaUsuario) {
           return usuario==adm;
            
            
        }
        
        listaUsuario.add(adm);
        return false;
        
    }
    
    
    
    
}
