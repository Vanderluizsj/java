/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import gerenciadorsupermercado.Produto;
import java.util.LinkedList;


/**
 *
 * @author Amishel
 */
public class CadastroProdutos extends javax.swing.JFrame {

   
    public CadastroProdutos() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        list1 = new LinkedList<Produto>();
        jLabel1 = new javax.swing.JLabel();
        lbl_Produto = new javax.swing.JLabel();
        lbl_Quantidade = new javax.swing.JLabel();
        btn_Adicionar = new javax.swing.JButton();
        btn_Remover = new javax.swing.JButton();
        tf_Produto = new javax.swing.JTextField();
        tf_Quantidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_Produto = new javax.swing.JTable();

        list1 = org.jdesktop.observablecollections.ObservableCollections.observableList(list1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        jLabel1.setText("CONTROLE DE ESTOQUE");

        lbl_Produto.setText("PRODUTO:");

        lbl_Quantidade.setText("QUANTIDADE:");

        btn_Adicionar.setText("ADICIONAR");
        btn_Adicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AdicionarMouseClicked(evt);
            }
        });
        btn_Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdicionarActionPerformed(evt);
            }
        });

        btn_Remover.setText("REMOVER");
        btn_Remover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_RemoverMouseClicked(evt);
            }
        });
        btn_Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RemoverActionPerformed(evt);
            }
        });

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, t_Produto, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.produto}"), tf_Produto, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, t_Produto, org.jdesktop.beansbinding.ELProperty.create("${selectedElement!=null}"), tf_Produto, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, t_Produto, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.quantidade}"), tf_Quantidade, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, t_Produto, org.jdesktop.beansbinding.ELProperty.create("${selectedElement!=null}"), tf_Quantidade, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list1, t_Produto);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${produto}"));
        columnBinding.setColumnName("Produto");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${quantidade}"));
        columnBinding.setColumnName("Quantidade");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane1.setViewportView(t_Produto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Adicionar)
                                .addGap(139, 139, 139)
                                .addComponent(btn_Remover)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Quantidade)
                                    .addComponent(lbl_Produto))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tf_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(tf_Produto))))))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Produto)
                    .addComponent(tf_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Quantidade)
                    .addComponent(tf_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Adicionar)
                    .addComponent(btn_Remover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AdicionarMouseClicked
        Produto p = new Produto();
        list1.add(p);
        
        
        int nLinhas = t_Produto.getRowCount()-1;
        t_Produto.setRowSelectionInterval(nLinhas, nLinhas);
        
        tf_Produto.requestFocus();
    }//GEN-LAST:event_btn_AdicionarMouseClicked

    private void btn_AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AdicionarActionPerformed

    private void btn_RemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RemoverMouseClicked
        int selecionado = t_Produto.getSelectedRow();
        t_Produto.remove(selecionado);
    }//GEN-LAST:event_btn_RemoverMouseClicked

    private void btn_RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RemoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_RemoverActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Adicionar;
    private javax.swing.JButton btn_Remover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Produto;
    private javax.swing.JLabel lbl_Quantidade;
    private java.util.List<Produto> list1;
    private javax.swing.JTable t_Produto;
    private javax.swing.JTextField tf_Produto;
    private javax.swing.JTextField tf_Quantidade;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
