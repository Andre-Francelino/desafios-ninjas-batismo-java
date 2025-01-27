package Condicoes;

import java.util.Scanner;

public class Desafio1ComIfElseEScanner {
    public static void main(String[] args) {

        // iniciando objeto scanner
        Scanner entradaDeDados = new Scanner(System.in);

        // inserindo os dados dos ninjas
        System.out.println("========== Digite os dados do ninja ==========");

        System.out.print("Nome: ");
        String nome = entradaDeDados.nextLine();

        System.out.print("Idade: ");
        int idade = entradaDeDados.nextInt();
        entradaDeDados.nextLine(); // Consome o '\n' deixado pelo nextInt()

        System.out.print("Missão: ");
        String missao = entradaDeDados.nextLine();


        System.out.print("Status da Missão: ");
        String statusMissao = entradaDeDados.nextLine();

        System.out.print("Nível da Missão: ");
        char nivelMissao = entradaDeDados.next().charAt(0);

        if (idade < 15) {
            if ((nivelMissao == 'C') || (nivelMissao == 'D')) {
                statusMissao = "Missão Concluída!";
                System.out.println("Olá, eu sou o ninja " + nome + ", tenho " + idade + " anos, minha missão é " +
                        "" + missao + " , o nível dessa missão é " + nivelMissao + ". O status atual da missão é: " + statusMissao);
            } else {
                statusMissao = "Não Concluída, pois sou muito novo!";
                System.out.println("Olá, eu sou o ninja " + nome + ", tenho " + idade + " anos, minha missão é " +
                        "" + missao + " , o nível dessa missão é " + nivelMissao + ". O status atual da missão é: " + statusMissao);
            }
        } else {
            statusMissao = "Missão Concluída. A minha idade permite concluir qualquer missão independente de qual seja o nível!";
            System.out.println("Olá, eu sou o ninja " + nome + ", tenho " + idade + " anos, minha missão é " +
                    "" + missao + ", o nível dessa missão é " + nivelMissao + ". O status atual da missão é: " + statusMissao);
        }

        // fechando objeto scanner
        entradaDeDados.close();

    }
}
