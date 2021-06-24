
package super1;

public class Produto {
  private String descricao;
  private int codigo;
  private double valor;  

    public Produto(String descricao, int codigo, double valor) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.valor = valor;
    }

    public Produto() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
  
  

   

   
  
}
