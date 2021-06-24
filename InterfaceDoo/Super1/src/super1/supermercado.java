
package super1;

import java.util.ArrayList;
//import static super1.carrinho.listaProdutos;

public class supermercado {
    static ArrayList <Produto> produtosCadastrados = new ArrayList();

    public supermercado() {
    }

    public void addProduto(Produto produto){
       produtosCadastrados.add(produto);
    }
    public void removerProduto(int codigo){
        for (Produto produto : produtosCadastrados) {
            if(produto.getCodigo()==codigo){
                produtosCadastrados.remove(this);
            } 
        } 
    }
    public void editarProduto(int codigo, Produto produto){
        
        for(int i=0; i<produtosCadastrados.size(); i++){
            if(produtosCadastrados.get(i).getCodigo()==codigo){
                produtosCadastrados.set(i, produto);
            }
        }
        
    }
}
