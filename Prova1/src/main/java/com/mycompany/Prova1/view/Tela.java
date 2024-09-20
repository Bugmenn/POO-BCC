/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.Prova1.view;

import javax.swing.JOptionPane;
import com.mycompany.Prova1.model.DiaSemana;
import com.mycompany.Prova1.model.IngressoCinema;

/**
 *
 * @author @author Gabriel Bugmann Vanzuita
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTfDiaSemana = new javax.swing.JTextField();
        jCbEstudante = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLValor = new javax.swing.JLabel();
        jBtnVerificarValor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Dia da semana:");

        jTfDiaSemana.setMinimumSize(new java.awt.Dimension(80, 22));
        jTfDiaSemana.setPreferredSize(new java.awt.Dimension(80, 22));
        jTfDiaSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfDiaSemanaActionPerformed(evt);
            }
        });

        jCbEstudante.setText("Estudante");

        jLabel3.setText("Valor ingreço:");

        jBtnVerificarValor.setText("Verificar valor");
        jBtnVerificarValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVerificarValorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnVerificarValor)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTfDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCbEstudante)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLValor)))
                        .addGap(49, 49, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTfDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCbEstudante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnVerificarValor)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLValor))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTfDiaSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfDiaSemanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfDiaSemanaActionPerformed

    private void jBtnVerificarValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVerificarValorActionPerformed
        try {
            String diaSemana = jTfDiaSemana.getText();
            if (diaSemana.isEmpty()) {
                throw new IllegalArgumentException("Dia da Semana não pode ser vazio");
            } else {
                    diaSemana = diaSemana.toLowerCase().trim().replaceAll(" ", "");
                boolean estudante = jCbEstudante.isSelected();           

                switch (diaSemana) {
                    case "segunda":
                        {
                            IngressoCinema ingressoCinema = new IngressoCinema(DiaSemana.SEGUNDA, estudante);
                            this.jLValor.setText(String.valueOf(ingressoCinema.precoIngresso()));
                            break;
                        }
                    case "terça":
                        {
                            IngressoCinema ingressoCinema = new IngressoCinema(DiaSemana.TERCA, estudante);
                            this.jLValor.setText(String.valueOf(ingressoCinema.precoIngresso()));
                            break;
                        }
                    case "quarta":
                        {
                            IngressoCinema ingressoCinema = new IngressoCinema(DiaSemana.QUARTA, estudante);
                            this.jLValor.setText(String.valueOf(ingressoCinema.precoIngresso()));
                            break;
                        }
                    case "quinta":
                        {
                            IngressoCinema ingressoCinema = new IngressoCinema(DiaSemana.QUINTA, estudante);            
                            this.jLValor.setText(String.valueOf(ingressoCinema.precoIngresso()));
                            break;
                        }
                    case "sexta":
                        {
                            IngressoCinema ingressoCinema = new IngressoCinema(DiaSemana.SEXTA, estudante);
                            this.jLValor.setText(String.valueOf(ingressoCinema.precoIngresso()));
                            break;
                        }
                    case "sábado":
                        {
                            IngressoCinema ingressoCinema = new IngressoCinema(DiaSemana.SABADO, estudante);
                            this.jLValor.setText(String.valueOf(ingressoCinema.precoIngresso()));
                            break;
                        }
                    case "domingo":
                        {
                            IngressoCinema ingressoCinema = new IngressoCinema(DiaSemana.DOMINGO, estudante);
                            this.jLValor.setText(String.valueOf(ingressoCinema.precoIngresso()));
                            break;
                        }
                    default:
                        break;
                }
            }
            
            
        } catch (IllegalArgumentException error) {
            JOptionPane.showMessageDialog(null, error.getMessage());
        }
    }//GEN-LAST:event_jBtnVerificarValorActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnVerificarValor;
    private javax.swing.JCheckBox jCbEstudante;
    private javax.swing.JLabel jLValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTfDiaSemana;
    // End of variables declaration//GEN-END:variables
}
