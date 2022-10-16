/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeAvaliativa_1;

/**
 *
 * @author Maria Gabriele
 */
public class Medicos {
    private String nome;
    private String especialista;
    private String email;
    
    
    public Medicos(String nome, String especialista, String email){
    this.nome=nome;
    this.especialista=especialista;
    this.email=email;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome= nome;
    }
    public String getEspecialista(){
        return especialista;
    }
    public void setEspecialista(String especialista){
        this.especialista= especialista;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email= email;
    }
    
    @Override
    public String toString(){
        return "Contato: \nNome: "+nome+"\nEspecialização: "+especialista+"\nE-mail: "+email;
    }
}
