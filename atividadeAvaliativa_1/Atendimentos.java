/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeAvaliativa_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atendimentos {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 
        ArrayList<Medicos>listamedicos = new ArrayList();
        ArrayList<Pacientes>listapacientes = new ArrayList();
        Queue<Consulta>fila=new LinkedList();
        int opcao=0;
        
        do{
            System.out.println("Deseja registrar um médico (tecle 1), um paciente (tecle 2), um atendimento (tecle 3) \nOu deseja checar quem é o próximo paciente a ser atendido (tecle 4)?");
            opcao=ler.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Qual o nome do(a) médico(a)?");
                    String nome=ler.next();
                    System.out.println("Qual a especialização de "+nome+"?");
                    String especialista=ler.next();
                    System.out.println("Qual o e-mail de "+nome+"?");
                    String email=ler.next();
                    Medicos leitura = new Medicos (nome, especialista, email);
                    listamedicos.add(leitura);
                break;
                case 2:
                    System.out.println("Qual o nome do(a) paciente?");
                    nome=ler.next();
                    System.out.println("Qual o telefone de "+nome+"?");
                    String telefone=ler.next();
                    System.out.println("Qual a data de nascimento de "+nome+"?");
                    String dataNasc=ler.next();
                    Pacientes lEitura = new Pacientes (nome, telefone, dataNasc);
                    listapacientes.add(lEitura);
                break;
                case 3:
                    System.out.println("Qual o nome do(a) paciente?");
                    String nomePaciente=ler.next();
                    System.out.println("O(A) médico(a) que fará o atendimento será: ");
                    String nomeMedico=ler.next();
                    System.out.println("A consulta será realizada no dia: ");
                    String data=ler.next();
                    System.out.println("Quais os sintomas relatados pelo(a) paciente?");
                    String anamnese=ler.next();
                    Consulta leiturA = new Consulta (nomePaciente, nomeMedico, data, anamnese);
                    fila.add(leiturA);
                break;
                case 4:
                    Consulta proximo = fila.remove();
                    System.out.println("O próximo paciente a ser atendido é:"+proximo);
                break;
                default:
                    break;
            }
            System.out.println("Deseja fazer um novo registro? \nSe sim, tecle 0\nSe não, tecle 1");
            opcao=ler.nextInt();
        }while (opcao==0);
        System.out.println("Operação finalizada!");
        
    }
}
