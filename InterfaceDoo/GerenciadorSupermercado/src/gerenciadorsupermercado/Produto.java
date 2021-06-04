
package gerenciadorsupermercado;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;


public class Produto {
    
    private String produto;
    //ArrayList<Produto> estoque = new ArrayList<>(); 

    public static final String PROP_PRODUTO = "produto";

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        String oldProduto = this.produto;
        this.produto = produto;
        propertyChangeSupport.firePropertyChange(PROP_PRODUTO, oldProduto, produto);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

       private int quantidade;

    public static final String PROP_QUANTIDADE = "quantidade";

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        int oldQuantidade = this.quantidade;
        this.quantidade = quantidade;
        propertyChangeSupport.firePropertyChange(PROP_QUANTIDADE, oldQuantidade, quantidade);
    }


}
