/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeAvaliativa_1;

public class Pacientes {
   
    private String nome;
    private String telefone;
    private String dataNasc;
    
    
    public Pacientes(String nome, String telefone, String dataNasc){
    this.nome=nome;
    this.telefone=telefone;
    this.dataNasc=dataNasc;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome= nome;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone= telefone;
    }
    public String getDataNasc(){
        return dataNasc;
    }
    public void setDataNasc(String dataNasc){
        this.dataNasc= dataNasc;
    }
    
    @Override
    public String toString(){
        return "Contato: \nNome: "+nome+"\nData de Nascimento: "+dataNasc+"\nTelefone: "+telefone;
    }
}