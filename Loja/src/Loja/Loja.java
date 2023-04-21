
package Loja;

class Loja {

   
    public static void main(String[] args) {
         Livro livro1 = new Livro("O Pequeno Príncipe", 29.90, "Antoine de Saint-Exupéry");
        CD cd1 = new CD("Thriller", 39.90, 9);
        DVD dvd1 = new DVD("Matrix", 49.90, 136);
        Livro livro2 = new Livro("A Menina que Roubava Livros", 44.90, "Markus Zusak");
        DVD dvd2 = new DVD("Vingadores: Ultimato", 59.90, 181);

        livro1.imprimirLivro();
        cd1.imprimirCD();
        dvd1.imprimirDVD();
        livro2.imprimirLivro();
        dvd2.imprimirDVD();
    }
    
}
