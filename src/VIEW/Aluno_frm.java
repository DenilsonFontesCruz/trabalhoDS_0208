/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.AlunoDAO;
import DTO.AlunoDTO;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author defon
 */
public class Aluno_frm extends javax.swing.JFrame {

    /**
     * Creates new form Aluno_frm
     */
    public Aluno_frm() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        nameINP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rgINP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cpfINP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telefoneINP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        idINP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        listBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        alterBtn = new javax.swing.JButton();
        selectBtn = new javax.swing.JButton();
        alterBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "RG", "CPF", "TELEFONE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaData);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("ALUNO");

        jLabel2.setText("Nome");

        jLabel3.setText("RG");

        jLabel4.setText("CPF");

        jLabel5.setText("Telefone");

        idINP.setEditable(false);
        idINP.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel6.setText("ID");

        listBtn.setText("LISTAR =>");
        listBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listBtnActionPerformed(evt);
            }
        });

        registerBtn.setText("CADASTRAR");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        alterBtn.setText("ALTERAR");
        alterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterBtnActionPerformed(evt);
            }
        });

        selectBtn.setText("<= SELECIONAR");
        selectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBtnActionPerformed(evt);
            }
        });

        alterBtn1.setText("LIMPAR");
        alterBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(rgINP, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(cpfINP, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(nameINP, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(alterBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(alterBtn1))
                                .addComponent(telefoneINP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(idINP, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(selectBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(listBtn)))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameINP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idINP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rgINP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpfINP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefoneINP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(registerBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alterBtn)
                            .addComponent(alterBtn1))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(listBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selectBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        registrarAluno();
        clearCamps();
    }//GEN-LAST:event_registerBtnActionPerformed

    private void alterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterBtnActionPerformed
        alterAluno();
        listarAlunos();
        clearCamps();
    }//GEN-LAST:event_alterBtnActionPerformed

    private void selectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtnActionPerformed
        selectItem();
    }//GEN-LAST:event_selectBtnActionPerformed

    private void alterBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterBtn1ActionPerformed
        clearCamps();
    }//GEN-LAST:event_alterBtn1ActionPerformed

    private void listBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listBtnActionPerformed
        listarAlunos();
    }//GEN-LAST:event_listBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Aluno_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aluno_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aluno_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aluno_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aluno_frm().setVisible(true);
            }
        });
    }
    
    
    /*
        Registrar Aluno
    */
    private void registrarAluno() {
        AlunoDTO alunoDTO = new AlunoDTO();
        
        alunoDTO.setNome(nameINP.getText());
        alunoDTO.setRg(rgINP.getText());
        alunoDTO.setCpf(cpfINP.getText());
        alunoDTO.setTelefone(telefoneINP.getText());
        
        AlunoDAO alunoDAO = new AlunoDAO();
        
        alunoDAO.registrar(alunoDTO);
        
    }

    /*
        Listar Alunos
    */
    private void listarAlunos() {
        
        try {
            
            DefaultTableModel modelo = (DefaultTableModel) tabelaData.getModel();
            
            AlunoDAO alunoDAO = new AlunoDAO();
            
            ArrayList<AlunoDTO> lista = alunoDAO.listar();
            
            modelo.setNumRows(0);
            
            for(int i = 0; i < lista.size(); i++) {
                modelo.addRow(new Object[] {
                    lista.get(i).getId(),
                    lista.get(i).getNome(),
                    lista.get(i).getRg(),
                    lista.get(i).getCpf(),
                    lista.get(i).getTelefone()
                });
            }
          
        }
        catch(Exception err) {
            JOptionPane.showMessageDialog(null, "Error message: " + err.getMessage());
        }
    }
    
    /*
        Selecionar Item
    */
    private void selectItem() {
        int selectedRow = tabelaData.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tabelaData.getModel();
        
        idINP.setText(modelo.getValueAt(selectedRow, 0).toString());
        nameINP.setText(modelo.getValueAt(selectedRow, 1).toString());
        rgINP.setText(modelo.getValueAt(selectedRow, 2).toString());
        cpfINP.setText(modelo.getValueAt(selectedRow, 3).toString());
        telefoneINP.setText(modelo.getValueAt(selectedRow, 4).toString());
    }
    
    /*
        Alterar Aluno
    */
    private void alterAluno() {
        AlunoDTO alunoDTO = new AlunoDTO();
        
        String alunoID = idINP.getText();
        
        if(alunoID.equals("")) {
            JOptionPane.showMessageDialog(null, "Necessario Selecionar Aluno");
        }
        
        else {
            alunoDTO.setId(parseInt(alunoID));
            alunoDTO.setNome(nameINP.getText());
            alunoDTO.setRg(rgINP.getText());
            alunoDTO.setCpf(cpfINP.getText());
            alunoDTO.setTelefone(telefoneINP.getText());

            AlunoDAO alunoDAO = new AlunoDAO();

            alunoDAO.alterar(alunoDTO);
        }
    }
    
    /*
        Limpar Campos
    */
    private void clearCamps() {
        idINP.setText("");
        nameINP.setText("");
        rgINP.setText("");
        cpfINP.setText("");
        telefoneINP.setText("");
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterBtn;
    private javax.swing.JButton alterBtn1;
    private javax.swing.JTextField cpfINP;
    private javax.swing.JTextField idINP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listBtn;
    private javax.swing.JTextField nameINP;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField rgINP;
    private javax.swing.JButton selectBtn;
    private javax.swing.JTable tabelaData;
    private javax.swing.JTextField telefoneINP;
    // End of variables declaration//GEN-END:variables
}
