package Condicoes;

public class DesafioNinjas01 {
    public static void main(String[] args) {

        // Ninja 1
        String nomeNinja1 = "Naruto";
        int idadeNinja1 = 14;
        String missaoNinja1 = "Defender um vilarejo isolado contra um ataque de bandidos";
        char nivelMissaoNinja1 = 'B';
        String statusMissaoNinja1 = "Não Concluída";

        if (idadeNinja1 < 15 && (nivelMissaoNinja1 == 'C' || nivelMissaoNinja1 == 'D')) {
            statusMissaoNinja1 = "Concluída";
            System.out.println("Eu sou o ninja " + nomeNinja1 + ", tenho " + idadeNinja1 + " anos, minha missão é " + missaoNinja1 + ", o status dela é: " + statusMissaoNinja1);
        } else if (idadeNinja1 >= 15) {
            statusMissaoNinja1 = "Concluída";
            System.out.println("Eu sou o ninja " + nomeNinja1 + ", tenho " + idadeNinja1 + " anos, minha missão é " + missaoNinja1 + ", o status dela é: " + statusMissaoNinja1);
        } else {
            System.out.println("Eu sou o ninja " + nomeNinja1 + ", tenho " + idadeNinja1 + " anos, minha missão é " + missaoNinja1 + ", o status dela é: " + statusMissaoNinja1);
        }

        // Ninja 2
        String nomeNinja2 = "Jiraya";
        int idadeNinja2 = 19;
        String missaoNinja2 = "Investigar a organização Akatsuki";
        char nivelMissaoNinja2 = 'S';
        String statusMissaoNinja2 = "Não Concluída";

        if (idadeNinja2 < 15 && (nivelMissaoNinja2 == 'C' || nivelMissaoNinja2 == 'D')) {
            statusMissaoNinja2 = "Concluída";
            System.out.println("Eu sou o ninja " + nomeNinja2 + ", tenho " + idadeNinja2 + " anos, minha missão é " + missaoNinja2 + ", o status dela é: " + statusMissaoNinja2);
        } else if (idadeNinja2 >= 15) {
            statusMissaoNinja2 = "Concluída";
            System.out.println("Eu sou o ninja " + nomeNinja2 + ", tenho " + idadeNinja2 + " anos, minha missão é " + missaoNinja2 + ", o status dela é: " + statusMissaoNinja2);
        } else {
            System.out.println("Eu sou o ninja " + nomeNinja2 + ", tenho " + idadeNinja2 + " anos, minha missão é " + missaoNinja2 + ", o status dela é: " + statusMissaoNinja2);
        }

        // Ninja 3
        String nomeNinja3 = "Kakashi";
        int idadeNinja3 = 13;
        String missaoNinja3 = "Infiltrar e coletar informações de uma base inimiga secreta";
        char nivelMissaoNinja3 = 'D';
        String statusMissaoNinja3 = "Não Concluída";

        if (idadeNinja3 < 15 && (nivelMissaoNinja3 == 'C' || nivelMissaoNinja3 == 'D')) {
            statusMissaoNinja3 = "Concluída";
            System.out.println("Eu sou o ninja " + nomeNinja3 + ", tenho " + idadeNinja3 + " anos, minha missão é " + missaoNinja3 + ", o status dela é: " + statusMissaoNinja3);
        } else if (idadeNinja3 >= 15) {
            statusMissaoNinja3 = "Concluída";
            System.out.println("Eu sou o ninja " + nomeNinja3 + ", tenho " + idadeNinja3 + " anos, minha missão é " + missaoNinja3 + ", o status dela é: " + statusMissaoNinja3);
        } else {
            System.out.println("Eu sou o ninja " + nomeNinja3 + ", tenho " + idadeNinja3 + " anos, minha missão é " + missaoNinja3 + ", o status dela é: " + statusMissaoNinja3);
        }

    }
}
