package com.mycompany.switchcase;

import java.util.Scanner;// importei a classe scanner

public class SwitchCase {// denominei de SwitchCase 
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {// o try serve para evitar vazamento de dados, e também essa parte fica responsável pela leitura da entrada de dados do teclado do usuário
            System.out.print("Digite o número de cômodos de sua casa ");// aqui é perguntado ao usuário a quantidade de cômodos da casa do usuário
            int resposta = scanner.nextInt();

            switch (resposta) {
                case 1:
                    System.out.println("Como? Impossível🤯");
                    break;
                case 4:
                case 5:
                    System.out.println("É pequeno, mas atende as suas necessidades?");
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.println("Sua casa é de médio a grande porte, pelo visto ela é bem espaçosa 👌😎");
                    break;
                default:
                    System.out.println("Valor inválido! Digite de 1 a 10.");
                    break;
            }
        }
    }
}
