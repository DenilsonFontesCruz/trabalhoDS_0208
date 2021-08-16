/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.AlunoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author defon
 */
public class AlunoDAO {
    
    Connection connectDB;
    PreparedStatement pstm;
    
    
    /*
        Cadastrar Aluno
    */
    public void registrar (AlunoDTO alunoDTO) {
        
        connectDB = new ConnectionDAO().ConnectDB();
        
        try {
            String alunoInsert = "insert into tb_aluno"
                    + "(nome_aluno, rg_aluno, cpf_aluno, telefone_aluno)"
                    + "values (?, ?, ?, ?)";
            
            pstm = connectDB.prepareStatement(alunoInsert);
            
            pstm.setString(1, alunoDTO.getNome());
            pstm.setString(2, alunoDTO.getRg());
            pstm.setString(3, alunoDTO.getCpf());
            pstm.setString(4, alunoDTO.getTelefone());
        
            pstm.execute();
            pstm.close();
        }
        catch(SQLException err) {
            JOptionPane.showMessageDialog(null, "Error Message: " + err.getMessage());
        }
        
    }
    
    /*
        Listar Alunos
    */
    public ArrayList<AlunoDTO> listar () {
        
        connectDB = new ConnectionDAO().ConnectDB();
        
        try {
            String alunoSelect = "select * from tb_aluno";
            
            pstm = connectDB.prepareStatement(alunoSelect);
            
            ResultSet listResult = pstm.executeQuery();
            
            ArrayList<AlunoDTO> listaAlunos = new ArrayList<>();
            
            while(listResult.next()) {
                AlunoDTO aluno = new AlunoDTO();
                
                aluno.setId(listResult.getInt("id_aluno"));
                aluno.setNome(listResult.getString("nome_aluno"));
                aluno.setRg(listResult.getString("rg_aluno"));
                aluno.setCpf(listResult.getString("cpf_aluno"));
                aluno.setTelefone(listResult.getString("telefone_aluno"));
                
                listaAlunos.add(aluno);
            }
            
            return listaAlunos;
            
        }
        catch(SQLException err) {
            JOptionPane.showMessageDialog(null, "Error Message: " + err.getMessage());
            return null;
        }
        
    }
    
    /*
        Alterar Aluno
    */
    public void alterar (AlunoDTO alunoDTO) {
        
        connectDB = new ConnectionDAO().ConnectDB();
        
        try {
            String alunoUpdate = 
                    "update tb_aluno set "
                    + "nome_aluno = ?,"
                    + "rg_aluno = ?,"
                    + "cpf_aluno = ?,"
                    + "telefone_aluno = ? "
                    + "where id_aluno = ?";
            
            pstm = connectDB.prepareStatement(alunoUpdate);
            
            pstm.setString(1, alunoDTO.getNome());
            pstm.setString(2, alunoDTO.getRg());
            pstm.setString(3, alunoDTO.getCpf());
            pstm.setString(4, alunoDTO.getTelefone());
            
            pstm.setInt(5, alunoDTO.getId());
            
            pstm.execute();
            
            pstm.close();
        }
        
        catch(SQLException err) {
            JOptionPane.showMessageDialog(null, "Error Message: " + err.getMessage());
        }
    }
}
