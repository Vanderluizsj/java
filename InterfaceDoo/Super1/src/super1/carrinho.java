
package super1;

import java.util.ArrayList;


public class carrinho {
    static ArrayList <Produto >listaProdutos = new ArrayList();  

    public carrinho() {
    }


    
    public void addProduto(Produto produto){
        listaProdutos.add(produto);
    }
    public void removerProduto(int codigo){
        for (Produto produto : listaProdutos) {
            if(produto.getCodigo()==codigo){
                listaProdutos.remove(this);
            } 
        } 
    }
    public double totalPagar(){
        double total=0;
        for (Produto produto: listaProdutos){
            total=total+produto.getValor();
        }
        return total;
    }
   
}
