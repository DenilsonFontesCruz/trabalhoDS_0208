/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author defon
 */
public class AlunoDTO {
    
    private int id;
    private String nome;
    private String rg;
    private String cpf;
    private String telefone;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        if(nome.equals("")) {
            this.nome = "John Doe";
        }
        else {
            this.nome = nome;
        }
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        if(rg.equals("")) {
            this.rg = "000000000";
        }
        else {
           this.rg = rg;
        }
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {  
        if(cpf.equals("")){
            this.cpf = "00000000000";
        }
        else {
            this.cpf = cpf;
        }
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        if(telefone.equals("")) {
            this.telefone = "000000000000";
        }
        else {
            this.telefone = telefone;
        }
    }
}
