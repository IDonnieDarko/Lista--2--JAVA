
package PessoaTeste;


public class Pessoa {
    public int idade;
    public int diaNasc;
    public int mesNasc;
    public int anoNasc;
    public String nome;

    // Construtor da classe Pessoa
    public Pessoa(int diaNasc, int mesNasc, int anoNasc, String nome) {
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
        this.nome = nome;
    }

    // Método para calcular a idade da pessoa
    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
        int idade = anoAtual - this.anoNasc;

        if (mesAtual < this.mesNasc) {
            idade--;
        } else if (mesAtual == this.mesNasc && diaAtual < this.diaNasc) {
            idade--;
        }

        this.idade = idade;
    }

    // Método para retornar a idade da pessoa
    public int informaIdade() {
        return this.idade;
    }

    // Método para retornar os dados da pessoa em formato de string
    public String toString() {
        return "Nome: " + this.nome + "\nData de nascimento: " + this.diaNasc + "/" + this.mesNasc + "/" + this.anoNasc
                + "\nIdade: " + this.idade;
    }
}
