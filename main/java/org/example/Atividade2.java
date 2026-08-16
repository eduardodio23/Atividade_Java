package org.example;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int quantidadePessoas = 0;
        double somaSalarios = 0;

        int maiorIdade = 0;
        int menorIdade = 0;

        int mulheresSalarioAlto = 0;

        int opcao;

        do {
            System.out.println("\nBem-vindo à Métrica");
            System.out.println("1. Adicionar pessoa");
            System.out.println("2. Exibir resultados");
            System.out.println("3. Sair");

            System.out.print("\nEscolha uma opção: ");
            opcao = input.nextInt();

            if (opcao == 1) {

                System.out.print("Idade: ");
                int idade = input.nextInt();

                System.out.print("Sexo (M/F): ");
                char sexo = input.next().charAt(0);

                System.out.print("Salário: ");
                double salario = input.nextDouble();

                // Quantidade de pessoas
                quantidadePessoas++;

                // Soma dos salários
                somaSalarios += salario;

                // Maior e menor idade
                if (quantidadePessoas == 1) {
                    maiorIdade = idade;
                    menorIdade = idade;
                } else {

                    if (idade > maiorIdade) {
                        maiorIdade = idade;
                    }

                    if (idade < menorIdade) {
                        menorIdade = idade;
                    }
                }

                // Mulheres com salário >= R$ 5.000
                if ((sexo == 'F' || sexo == 'f') && salario >= 5000) {
                    mulheresSalarioAlto++;
                }

                System.out.println("\nRegistro incluído.");
                System.out.println("Retornando ao menu...");

            } else if (opcao == 2) {

                System.out.println("\n--- RESULTADOS ---");

                if (quantidadePessoas > 0) {

                    double media = somaSalarios / quantidadePessoas;

                    System.out.println("Quantidade de pessoas: " + quantidadePessoas);
                    System.out.printf("Média salarial: R$ %.2f%n", media);
                    System.out.println("Maior idade registrada: " + maiorIdade);
                    System.out.println("Menor idade registrada: " + menorIdade);
                    System.out.println(
                            "Mulheres com salário >= R$ 5.000,00: "
                                    + mulheresSalarioAlto
                    );

                } else {

                    System.out.println("Nenhuma pessoa foi cadastrada.");

                }

            } else if (opcao == 3) {

                System.out.println("\nSaindo do sistema...");

            } else {

                System.out.println("\nOpção inválida!");

            }

        } while (opcao != 3);

        System.out.println("\nPrograma encerrado.");

        input.close();
    }
}