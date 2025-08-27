package com.mycompany.switchcase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o seu número de erros na prova de 1 a 10: ");
            int resposta = scanner.nextInt();

            switch (resposta) {
                case 1:
                    System.out.println("Você foi excelente, continue assim!");
                    break;
                case 4:
                case 5:
                case 6:
                    System.out.println("Você foi bem, busque sempre melhorar!");
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.println("Você precisa urgentemente contatar seu professor e fazer uma prova de recuperação");
                    break;
                default:
                    System.out.println("Valor inválido! Digite de 1 a 10.");
                    break;
            }
        }
    }
}
