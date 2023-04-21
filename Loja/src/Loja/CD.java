
package Loja;


public class CD {
    private String nome;
    private double preco;
    private int numFaixas;

    public CD(String nome, double preco, int numFaixas) {
        this.nome = nome;
        this.preco = preco;
        this.numFaixas = numFaixas;
    }

    public void imprimirCD() {
        System.out.println("Nome: " + nome + ", Preço: R$" + preco + ", Número de Faixas: " + numFaixas);
    }
}
