
package EmpregadoTeste;


public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("João", "Silva", 5000);
        Empregado empregado2 = new Empregado("Maria", "Santos", 7000);

        System.out.println("Salário anual do " + empregado1.getNome() + " " + empregado1.getSobrenome() + ": " + empregado1.salarioAnual());
        System.out.println("Salário anual do " + empregado2.getNome() + " " + empregado2.getSobrenome() + ": " + empregado2.salarioAnual());

        empregado1.aumentoSalario(10);
        empregado2.aumentoSalario(10);

        System.out.println("Salário anual do " + empregado1.getNome() + " " + empregado1.getSobrenome() + " após aumento de 10%: " + empregado1.salarioAnual());
        System.out.println("Salário anual do " + empregado2.getNome() + " " + empregado2.getSobrenome() + " após aumento de 10%: " + empregado2.salarioAnual());
    }
}
