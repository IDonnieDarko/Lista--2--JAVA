
package FaturaTeste;


public class FaturaTeste {

   
    public static void main(String[] args) {
        Fatura fatura = new Fatura("001", "Mouse sem fio", 2, 50.0);
        System.out.println("Número da fatura: " + fatura.getNumero());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Preço por item: " + fatura.getPreco());
        System.out.println("Total da fatura: " + fatura.getTotalFatura());
    }
    
}
