/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Entregas;
import model.dao.EntregasDAO;

/**
 *
 * @author Igor
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        DefaultTableModel modelo = (DefaultTableModel) tabelaPendentes.getModel();
        tabelaPendentes.setRowSorter(new TableRowSorter(modelo));
        TabelaPendentes();
        //DefaultTableModel modelo = (DefaultTableModel) tabelaEncaminhados.getModel();
        //tabelaPendentes.setRowSorter(new TableRowSorter(modelo));
        TabelaEncaminhados();
    }

    public void TabelaPendentes() {
        DefaultTableModel modelo = (DefaultTableModel) tabelaPendentes.getModel();
        modelo.setNumRows(0);

        EntregasDAO Entregas = new EntregasDAO();

        for (Entregas en : Entregas.pendentes()) {

            modelo.addRow(new Object[]{
                en.getId(),
                en.getCliente(),
                en.getEndereco(),
                en.getProduto(),
                en.getTelefone()

            });
        }

    }

    public void TabelaEncaminhados() {
        DefaultTableModel modelo = (DefaultTableModel) tabelaEncaminhados.getModel();
        modelo.setNumRows(0);

        EntregasDAO Entregas = new EntregasDAO();

        for (Entregas en : Entregas.encaminhados()) {

            modelo.addRow(new Object[]{
                en.getId(),
                en.getCliente(),
                en.getEndereco(),
                en.getProduto(),
                en.getTelefone()

            });
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtEnd = new javax.swing.JLabel();
        txtProd = new javax.swing.JLabel();
        txtTell = new javax.swing.JLabel();
        txtCliente = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPendentes = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaEncaminhados = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtEnd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEnd.setText("Endereço");

        txtProd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtProd.setText("Produto");

        txtTell.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTell.setText("Telefone");

        txtCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCliente.setText("Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(txtCliente)
                .addGap(95, 95, 95)
                .addComponent(txtEnd)
                .addGap(98, 98, 98)
                .addComponent(txtProd)
                .addGap(63, 63, 63)
                .addComponent(txtTell)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCliente)
                    .addComponent(txtEnd)
                    .addComponent(txtProd)
                    .addComponent(txtTell))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tabelaPendentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Endereço", "Produto", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaPendentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPendentesMouseClicked(evt);
            }
        });
        tabelaPendentes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabelaPendentesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaPendentes);
        if (tabelaPendentes.getColumnModel().getColumnCount() > 0) {
            tabelaPendentes.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Entregas pendentes");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(103, 103, 103))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Entregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Pronta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        tabelaEncaminhados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Endereço", "Produto", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaEncaminhados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaEncaminhadosMouseClicked(evt);
            }
        });
        tabelaEncaminhados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabelaEncaminhadosKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaEncaminhados);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Entregas encaminhadas");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(68, 68, 68))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel6)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 157, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (tabelaPendentes.getSelectedRow() != -1) {
            Entregas en = new Entregas();
            EntregasDAO dao = new EntregasDAO();
            en.setCliente(txtCliente.getText());
            en.setEndereco(txtEnd.getText());
            en.setProduto(txtProd.getText());
            en.setTelefone(txtTell.getText());
            dao.create(en);
            en.setId((int) tabelaPendentes.getValueAt(tabelaPendentes.getSelectedRow(), 0));
            dao.saiPendente(en);
            txtCliente.setText("Cliente");
            txtEnd.setText("Endereço");
            txtProd.setText("Produto");
            txtTell.setText("Telefone");
            TabelaEncaminhados();
            TabelaPendentes();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma entrega para encaminhar.");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (tabelaEncaminhados.getSelectedRow() != -1) {
            Entregas en = new Entregas();
            EntregasDAO dao = new EntregasDAO();
            en.setId((int) tabelaEncaminhados.getValueAt(tabelaEncaminhados.getSelectedRow(), 0));
            txtCliente.setText("Cliente");
            txtEnd.setText("Endereço");
            txtProd.setText("Produto");
            txtTell.setText("Telefone");
            dao.entregaFinalizada(en);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma entrega para finalizar.");
        }

        TabelaEncaminhados();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabelaPendentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPendentesMouseClicked
        // TODO add your handling code here:
        if (tabelaPendentes.getSelectedRow() != -1) {
            txtCliente.setText(tabelaPendentes.getValueAt(tabelaPendentes.getSelectedRow(), 1).toString());
            txtEnd.setText(tabelaPendentes.getValueAt(tabelaPendentes.getSelectedRow(), 2).toString());
            txtProd.setText(tabelaPendentes.getValueAt(tabelaPendentes.getSelectedRow(), 3).toString());
            txtTell.setText(tabelaPendentes.getValueAt(tabelaPendentes.getSelectedRow(), 4).toString());

        }
    }//GEN-LAST:event_tabelaPendentesMouseClicked

    private void tabelaPendentesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaPendentesKeyReleased
        // TODO add your handling code here:
        if (tabelaPendentes.getSelectedRow() != -1) {
            txtCliente.setText(tabelaPendentes.getValueAt(tabelaPendentes.getSelectedRow(), 1).toString());
            txtEnd.setText(tabelaPendentes.getValueAt(tabelaPendentes.getSelectedRow(), 2).toString());
            txtProd.setText(tabelaPendentes.getValueAt(tabelaPendentes.getSelectedRow(), 3).toString());
            txtTell.setText(tabelaPendentes.getValueAt(tabelaPendentes.getSelectedRow(), 4).toString());

        }
    }//GEN-LAST:event_tabelaPendentesKeyReleased

    private void tabelaEncaminhadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaEncaminhadosKeyReleased
        // TODO add your handling code here:
        if (tabelaEncaminhados.getSelectedRow() != -1) {
            txtCliente.setText(tabelaEncaminhados.getValueAt(tabelaEncaminhados.getSelectedRow(), 1).toString());
            txtEnd.setText(tabelaEncaminhados.getValueAt(tabelaEncaminhados.getSelectedRow(), 2).toString());
            txtProd.setText(tabelaEncaminhados.getValueAt(tabelaEncaminhados.getSelectedRow(), 3).toString());
            txtTell.setText(tabelaEncaminhados.getValueAt(tabelaEncaminhados.getSelectedRow(), 4).toString());

        }
    }//GEN-LAST:event_tabelaEncaminhadosKeyReleased

    private void tabelaEncaminhadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaEncaminhadosMouseClicked
        // TODO add your handling code here:
        if (tabelaEncaminhados.getSelectedRow() != -1) {
            txtCliente.setText(tabelaEncaminhados.getValueAt(tabelaEncaminhados.getSelectedRow(), 1).toString());
            txtEnd.setText(tabelaEncaminhados.getValueAt(tabelaEncaminhados.getSelectedRow(), 2).toString());
            txtProd.setText(tabelaEncaminhados.getValueAt(tabelaEncaminhados.getSelectedRow(), 3).toString());
            txtTell.setText(tabelaEncaminhados.getValueAt(tabelaEncaminhados.getSelectedRow(), 4).toString());

        }
    }//GEN-LAST:event_tabelaEncaminhadosMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaEncaminhados;
    private javax.swing.JTable tabelaPendentes;
    private javax.swing.JLabel txtCliente;
    private javax.swing.JLabel txtEnd;
    private javax.swing.JLabel txtProd;
    private javax.swing.JLabel txtTell;
    // End of variables declaration//GEN-END:variables
}
