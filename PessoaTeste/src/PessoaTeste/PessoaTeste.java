
package PessoaTeste;

public class PessoaTeste {
    public static void main(String[] args) {
        // Criando objetos Pessoa
        Pessoa einstein = new Pessoa(14, 3, 1879, "Albert Einstein");
        Pessoa newton = new Pessoa(4, 1, 1643, "Isaac Newton");

        // Calculando as idades atuais de Einstein e Newton
        int diaAtual = 21;
        int mesAtual = 4;
        int anoAtual = 2023;
        einstein.calculaIdade(diaAtual, mesAtual, anoAtual);
        newton.calculaIdade(diaAtual, mesAtual, anoAtual);

        // Mostrando as idades de Einstein e Newton
        System.out.println("Idade atual de " + einstein.nome + ": " + einstein.informaIdade());
        System.out.println("Idade atual de " + newton.nome + ": " + newton.informaIdade());
    }
}

