/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.agendamedica;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author super
 */
public class PosLogin extends javax.swing.JFrame {

    /**
     * Creates new form PosLogin
     */
    public PosLogin() {
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
        jButton1 = new javax.swing.JButton();
        chxAgendar = new javax.swing.JCheckBox();
        chxCancelar = new javax.swing.JCheckBox();
        chxGerar = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        chxRealizar = new javax.swing.JCheckBox();
        chxAvaliar = new javax.swing.JCheckBox();
        btnVoltar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE LOGIN");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("BEM VINDO AO SISTEMA DE AGENDAMENTO MEDICO");

        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        chxAgendar.setText("Agendar Consulta");

        chxCancelar.setText("Cancelar Consulta");

        chxGerar.setText("Gerar relatorio");

        jLabel2.setText("O que deseja fazer?");

        chxRealizar.setText("Realizar Consulta");

        chxAvaliar.setText("Avaliar Consulta");

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jMenu1.setText("Edit");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Editar usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(78, 78, 78))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(48, 48, 48)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(chxAvaliar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chxGerar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chxRealizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chxCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chxAgendar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(104, 104, 104)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar)
                        .addGap(115, 115, 115))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chxAgendar)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chxCancelar)
                .addGap(18, 18, 18)
                .addComponent(chxRealizar)
                .addGap(30, 30, 30)
                .addComponent(chxGerar)
                .addGap(18, 18, 18)
                .addComponent(chxAvaliar)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnVoltar)
                        .addContainerGap(31, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        EditarUsuario frame = new EditarUsuario();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        chxRealizar.setVisible(false);
        chxAgendar.setVisible(false);
        chxAvaliar.setVisible(false);
        String json = "";
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            json = String.join(" ",Files.readAllLines(Paths.get("usuario.json"),StandardCharsets.UTF_8));
        } catch (IOException ex) {
            Logger.getLogger(PosLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            Medico medico = gson.fromJson(json,Medico.class);
            chxRealizar.setVisible(true);
            if(medico.getNotas()==null){
                chxAgendar.setVisible(true);
                chxAvaliar.setVisible(true);
                chxRealizar.setVisible(false);
            }
        }catch(Exception e){
            e.getMessage();
        }
        try{
            Paciente paciente = gson.fromJson(json,Paciente.class);
            chxAgendar.setVisible(true);
            chxAvaliar.setVisible(true);
            if(paciente.getIdade()==null){
                chxRealizar.setVisible(true);
                chxAvaliar.setVisible(false);
                chxAgendar.setVisible(false);
            }
        }catch(Exception e){
            e.getMessage();
        }
        
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String json = "";
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            json = String.join(" ",Files.readAllLines(Paths.get("usuario.json"),StandardCharsets.UTF_8));
        } catch (IOException ex) {
            Logger.getLogger(PosLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            Medico medico = gson.fromJson(json,Medico.class);
            medico.verificarPessoa();
            if(chxRealizar.isSelected()==true&&chxGerar.isSelected()==false&&chxCancelar.isSelected()==false&&chxAgendar.isSelected()==false){
                RealizarConsulta frame = new RealizarConsulta();
                frame.setVisible(true);
                //this.dispose();
            }
            else if(chxRealizar.isSelected()==false&&chxGerar.isSelected()==true&&chxCancelar.isSelected()==false&&chxAgendar.isSelected()==false){
                GerarRelatorio frame = new GerarRelatorio();
                frame.setVisible(true);
                //this.dispose();
            }
            else if(chxRealizar.isSelected()==false&&chxGerar.isSelected()==false&&chxCancelar.isSelected()==true&&chxAgendar.isSelected()==false){
                CancelarConsulta frame = new CancelarConsulta();
                frame.setVisible(true);
                //this.dispose();
            }
            else if (chxRealizar.isSelected()==false&&chxGerar.isSelected()==false&&chxCancelar.isSelected()==false&&chxAgendar.isSelected()==true){
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Ola! Voce deixou varias opcoes ativas ou nenhuma ativa","ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }catch(Exception e){
            e.getMessage();
        }
        try{
            Paciente paciente = gson.fromJson(json, Paciente.class);
            paciente.verificarPessoa();
            if(chxAgendar.isSelected()==true&&chxGerar.isSelected()==false&&chxCancelar.isSelected()==false&&chxAvaliar.isSelected()==false){
                AgendarConsulta frame = new AgendarConsulta();
                frame.setVisible(true);
                //this.dispose();
            }
            else if(chxAgendar.isSelected()==false&&chxGerar.isSelected()==true&&chxCancelar.isSelected()==false&&chxAvaliar.isSelected()==false){
                GerarRelatorio frame = new GerarRelatorio();
                frame.setVisible(true);
                //this.dispose();
            }
            else if(chxAgendar.isSelected()==false&&chxGerar.isSelected()==false&&chxCancelar.isSelected()==true&&chxAvaliar.isSelected()==false){
                CancelarConsulta frame = new CancelarConsulta();
                frame.setVisible(true);
                //this.dispose();
            }
            else if(chxAgendar.isSelected()==false&&chxGerar.isSelected()==false&&chxCancelar.isSelected()==false&&chxAvaliar.isSelected()==true){
                AvaliarConsulta frame = new AvaliarConsulta();
                frame.setVisible(true);
                //this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Ola! Voce deixou varias opcoes ativas ou nenhuma ativa","ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }catch(Exception e){
            e.getMessage();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(PosLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PosLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PosLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PosLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PosLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox chxAgendar;
    private javax.swing.JCheckBox chxAvaliar;
    private javax.swing.JCheckBox chxCancelar;
    private javax.swing.JCheckBox chxGerar;
    private javax.swing.JCheckBox chxRealizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
