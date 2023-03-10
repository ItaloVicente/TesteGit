/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.agendamedica;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author super
 */
public class CadastrarPessoa extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarPessoa
     */
    public CadastrarPessoa() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbxPaciente = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        cbxMedico = new javax.swing.JCheckBox();
        lblNome = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblConfirmarSenha = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblEspecialidade = new javax.swing.JLabel();
        nomeTxt = new javax.swing.JTextField();
        senhaTxt = new javax.swing.JTextField();
        confirmarTxt = new javax.swing.JTextField();
        especialidadeTxt = new javax.swing.JTextField();
        idadeTxt = new javax.swing.JTextField();
        sexoTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRO");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("           JANELA DE CADASTRO");

        cbxPaciente.setText("Paciente");
        cbxPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPacienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Qual sua situacao?");

        cbxMedico.setText("Medico");
        cbxMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMedicoActionPerformed(evt);
            }
        });

        lblNome.setText("Nome: ");

        lblIdade.setText("Idade");

        lblSenha.setText("Senha:");

        lblConfirmarSenha.setText("Confirmar senha:");

        lblSexo.setText("Sexo:");

        lblEspecialidade.setText("Especialidade:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jButton1)
                        .addGap(39, 39, 39)
                        .addComponent(jButton2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblConfirmarSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(lblEspecialidade)
                                        .addComponent(lblIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(senhaTxt)
                                        .addComponent(confirmarTxt)
                                        .addComponent(especialidadeTxt)
                                        .addComponent(idadeTxt)
                                        .addComponent(sexoTxt)
                                        .addComponent(nomeTxt)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cbxPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(263, 263, 263)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxPaciente)
                    .addComponent(cbxMedico))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSenha)
                    .addComponent(senhaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmarSenha)
                    .addComponent(confirmarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEspecialidade)
                    .addComponent(especialidadeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdade)
                    .addComponent(idadeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(sexoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Cadastro frame = new Cadastro();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbxPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPacienteActionPerformed
        // TODO add your handling code here:
        if(cbxPaciente.isSelected()==true){
            lblIdade.setVisible(true);
            idadeTxt.setVisible(true);
            lblSexo.setVisible(true);
            sexoTxt.setVisible(true);
        }
        else{
            lblIdade.setVisible(false);
            idadeTxt.setVisible(false);
            lblSexo.setVisible(false);
            sexoTxt.setVisible(false);
        }
    }//GEN-LAST:event_cbxPacienteActionPerformed

    private void cbxMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMedicoActionPerformed
        // TODO add your handling code here:
        if(cbxMedico.isSelected()==true){
            lblEspecialidade.setVisible(true);
            especialidadeTxt.setVisible(true);
        }
        else{
            lblEspecialidade.setVisible(false);
            especialidadeTxt.setVisible(false);
        }
    }//GEN-LAST:event_cbxMedicoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        lblEspecialidade.setVisible(false);
        especialidadeTxt.setVisible(false);
        lblIdade.setVisible(false);
        idadeTxt.setVisible(false);
        lblSexo.setVisible(false);
        sexoTxt.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
    
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json= String.join(" ",Files.readAllLines(Paths.get("pacientes.json"),StandardCharsets.UTF_8));
            String json2= String.join(" ",Files.readAllLines(Paths.get("medicos.json"),StandardCharsets.UTF_8));
            java.lang.reflect.Type listTypePaciente = new TypeToken <ArrayList<Paciente>>(){}.getType();
            ArrayList<Paciente> pacientes = gson.fromJson(json,listTypePaciente);
            java.lang.reflect.Type listTypeMedico = new TypeToken <ArrayList<Medico>>(){}.getType();
            ArrayList<Medico> medicos = gson.fromJson(json2, listTypeMedico);
            //Caso cadastro paciente
            
        if(cbxPaciente.isSelected()==true && cbxMedico.isSelected()==false){
            String nome = nomeTxt.getText().toUpperCase();
            String senha = senhaTxt.getText();
            String confirmar = confirmarTxt.getText();
            String idade = idadeTxt.getText();
            String sexo = sexoTxt.getText();
            boolean verificador = false;
            
            for(Paciente paciente:pacientes){
                if(paciente.getNome().equals(nome)&&paciente.getSenha().equals(senha)){
                    verificador=true;
                    JOptionPane.showMessageDialog(null, "Usu??rio ja cadastrado");
                    
                    
                }
            }
            
            
            if(verificador==false&&senha.equals(confirmar)==true){
                Paciente paciente = new Paciente(nome,idade,sexo,senha);
                pacientes.add(paciente);
                try (Writer writer = new FileWriter("pacientes.json")) {
                    gson.toJson(pacientes,writer);
                    writer.flush();
                    writer.close();
                    JOptionPane.showMessageDialog(null, "Ola, o Cadastro deu certo!");
                    this.dispose();
                    Cadastro frame = new Cadastro();
                    frame.setVisible(true);
              
                }
               
                
            }
            if(senha.equals(confirmar)==false){
                JOptionPane.showMessageDialog(null, "Ola, o Cadastro nao deu certo! senhas nao batem","ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
        //Caso cadastro medico
        if(cbxPaciente.isSelected()==false&&cbxMedico.isSelected()==true){
            String nome = nomeTxt.getText().toUpperCase();
            String senha = senhaTxt.getText();
            String confirmar = confirmarTxt.getText();
            String especialidade = especialidadeTxt.getText().toUpperCase();
            boolean verificador2=false;
            
            for(Medico medico: medicos){
                if(medico.getNome().equals(nome)&&medico.getSenha().equals(senha)){
                    verificador2=true;
                    JOptionPane.showMessageDialog(null," Usuario ja cadastrado!");
                    
                }
            }
            
            if(verificador2==false&&senha.equals(confirmar)==true){
                Medico medico = new Medico(nome,especialidade,senha);
                medicos.add(medico);
                try (Writer writer = new FileWriter("medicos.json")) {
                    String jsonNovo = gson.toJson(medicos);
                    gson.toJson(medicos,writer);
                    writer.flush();
                    writer.close();
                    JOptionPane.showMessageDialog(null, "Ola, o Cadastro deu certo!");
                    this.dispose();
                    Cadastro frame = new Cadastro();
                    frame.setVisible(true);
                }
            }
            if(senha.equals(confirmar)==false){
                JOptionPane.showMessageDialog(null, "Ola, o Cadastro nao deu certo! senhas nao batem","ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
        //Caso a pessoa tenha deixado os dois cbx ligados
        if((cbxPaciente.isSelected()==true&&cbxMedico.isSelected()==true)||(cbxMedico.isSelected()==false&&cbxPaciente.isSelected()==false)){
            JOptionPane.showMessageDialog(null, "Ola, o Cadastro nao deu certo! Voce deixou ambas opcoes ativas ou inativas","ERRO", JOptionPane.ERROR_MESSAGE);
        }
        } catch (IOException ex) {
            Logger.getLogger(CadastrarPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbxMedico;
    private javax.swing.JCheckBox cbxPaciente;
    private javax.swing.JTextField confirmarTxt;
    private javax.swing.JTextField especialidadeTxt;
    private javax.swing.JTextField idadeTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblConfirmarSenha;
    private javax.swing.JLabel lblEspecialidade;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JTextField senhaTxt;
    private javax.swing.JTextField sexoTxt;
    // End of variables declaration//GEN-END:variables
}
