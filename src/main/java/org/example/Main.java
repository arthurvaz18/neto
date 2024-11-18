package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GerenciadorDeVacas {
    public static void main(String[] args) {
        // Lista para armazenar as vacas cadastradas
        List<Vaca> vacas = new ArrayList<>();

        // Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCadastro de Vacas");
            System.out.println("1. Cadastrar nova vaca");
            System.out.println("2. Listar vacas cadastradas");
            System.out.println("3. Buscar vaca por numeração");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            if (opcao == 1) {
                // Cadastrar uma nova vaca
                System.out.print("Digite o nome da vaca: ");
                String nome = scanner.nextLine();

                System.out.print("Digite a idade da vaca (em anos): ");
                int idade = scanner.nextInt();

                System.out.print("Digite o peso da vaca (em kg): ");
                double peso = scanner.nextDouble();

                System.out.print("Digite o número da vaca (use casas decimais, se necessário): ");
                double numeroDouble = scanner.nextDouble();
                float numero = (float) numeroDouble; // Converter explicitamente para float

                // Criar e adicionar a vaca na lista
                Vaca novaVaca = new Vaca(nome, idade, peso, numero);
                vacas.add(novaVaca);
                System.out.println("Vaca cadastrada com sucesso! ID: " + novaVaca.getId());

            } else if (opcao == 2) {
                // Listar todas as vacas cadastradas
                if (vacas.isEmpty()) {
                    System.out.println("Nenhuma vaca cadastrada.");
                } else {
                    System.out.println("Lista de vacas cadastradas:");
                    for (Vaca vaca : vacas) {
                        System.out.println(vaca);
                    }
                }

            } else if (opcao == 3) {
                // Buscar vaca por numeração
                System.out.print("Digite o número da vaca que deseja buscar: ");
                double numeroBusca = scanner.nextDouble();
                float numeroFloat = (float) numeroBusca;

                Vaca vacaEncontrada = null;
                for (Vaca vaca : vacas) {
                    if (vaca.getNumero() == numeroFloat) {
                        vacaEncontrada = vaca;
                        break;
                    }
                }

                if (vacaEncontrada != null) {
                    System.out.println("Vaca encontrada: " + vacaEncontrada);
                } else {
                    System.out.println("Nenhuma vaca encontrada com o número " + numeroBusca);
                }

            } else if (opcao == 4) {
                // Sair do programa
                System.out.println("Encerrando o programa...");
                break;

            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
