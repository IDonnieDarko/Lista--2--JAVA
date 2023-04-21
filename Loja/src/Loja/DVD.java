
package Loja;


public class DVD {
    private String nome;
    private double preco;
    private int duracao;

    public DVD(String nome, double preco, int duracao) {
        this.nome = nome;
        this.preco = preco;
        this.duracao = duracao;
    }

    public void imprimirDVD() {
        System.out.println("Nome: " + nome + ", Preço: R$" + preco + ", Duração: " + duracao + " minutos");
    }
}
