/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeAvaliativa_1;

/**
 *
 * @author Maria Gabriele
 */
public class Consulta {
    private String nomePaciente;
    private String nomeMedico;
    private String dataConsulta;
    private String anamnese;
        
    public Consulta(String nomePaciente, String nomeMedico, String dataConsulta, String anamnese){
    this.nomePaciente=nomePaciente;
    this.nomeMedico=nomeMedico;
    this.dataConsulta=dataConsulta;
    this.anamnese=anamnese;
    }
    
    public String getNomePaciente(){
        return nomePaciente;
    }
    public void setNomePaciente(String nomePaciente){
        this.nomePaciente= nomePaciente;
    }
    public String getNomeMedico(){
        return nomeMedico;
    }
    public void setNomeMedico(String nomeMedico){
        this.nomeMedico= nomeMedico;
    }
    public String getDataConsulta(){
        return dataConsulta;
    }
    public void setDataConsulta(String dataConsulta){
        this.dataConsulta= dataConsulta;
    }
    public String getAnamnese(){
        return anamnese;
    }
    public void setAnamnese(String anamnese){
        this.anamnese= anamnese;
    }
    
    @Override
    public String toString(){
        return "Nome do Paciente: "+nomePaciente+"\nNome do(a) Médico(a) que fará o atendimento: "+nomeMedico+"\nData do atendimento: "+dataConsulta+"\nO(A) paciente relatou: "+anamnese;
    }
}