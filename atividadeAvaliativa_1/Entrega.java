/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeAvaliativa_1;

import java.util.Scanner;
import java.util.Stack;

public class Entrega { 
    public static void main(String[] args) {
    
        int opcao=1;
        Stack<String> pilha = new Stack<>();
        Scanner ler = new Scanner(System.in);
        
        while((opcao==2)||(opcao==1)){
            System.out.println("Você está entregando as malotes? Se sim, tecle 1 para inserir o local.\nVocê está coletando os malotes? Se sim, tecle 2 para obter o próximo local de coleta.\nTecle 0 para cancelar e encerrar.");
            opcao=ler.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Digite qual o novo local: ");
                    String local = ler.next();
                    pilha.push(local);
                break;
                case 2:
                    System.out.println("O próximo local de coleta é: "+pilha.pop());
                break;
                default:
                    break;
            }
        }
        System.out.println("Operação finalizada por erro ou por já ter esvaziado todas as tarefas");
    }
}
