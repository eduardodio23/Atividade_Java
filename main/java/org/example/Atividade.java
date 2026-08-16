package org.example;

import java.util.Scanner;

public class Atividade {
    static void main(String[] args) {
       double picanha = 25;
       double lasanha = 20;
       double strogonoff = 18;
       double bife = 15;
       double misto = 5;

       double total = 0;

       Scanner input = new Scanner(System.in);

       String continuacao;
       do{
           System.out.println("Seja bem-vindo!");
           System.out.println("1. Picanha: R$25,00");
           System.out.println("2. Lasanha: R$20,00");
           System.out.println("3. Strogonoff: R$18,00");
           System.out.println("4. Bife: R$15,00");
           System.out.println("5. Misto: R$5,00");

           System.out.println("Escolhe uma das opções:");
           int escolha = input.nextInt();

           if(escolha == 1){
               total += picanha;
               System.out.println("Você adicionou picanha!");
           } else if(escolha == 2){
               total += lasanha;
               System.out.println("Você adicionou lasanha!");
           } else if (escolha == 3){
               total += strogonoff;
               System.out.println("Você adicionou strogonoff!");
           } else if (escolha == 4){
               total += bife;
               System.out.println("Você adicionou bife!");
           } else if (escolha == 5){
               total += misto;
               System.out.println("Você adicionou misto!");
           } else {
               System.out.println("Opção inválida!");
           }
           System.out.println("Total atual: R$" + total);

           System.out.println("Deseja continuar? (S/N)");
           continuacao = input.next();
       } while(continuacao.equalsIgnoreCase("S"));

        System.out.println("Compra finalizada!");
        System.out.println("Total: R$" + total);

        input.close();



    }
}
