import app.Models.*;

public class Main {

    //TODO: // Exercicio Numero 2
    public static void main(String[] args) {
        ContaCorrente contaNormal = new ContaCorrente(1000);
        ContaCorrenteEspecial contaEspecial = new ContaCorrenteEspecial(1000);

        contaNormal.levantar(100);
        System.out.println("Saldo conta normal: " + contaNormal.obterSaldo());

        contaEspecial.levantar(100);
        System.out.println("Saldo conta especial: " + contaEspecial.obterSaldo());
    }

    //TODO: // Exercicio Numero 2
    /*public static void main(String[] args) {
        Funcionario gerente = new Gerente("Alice", 3000, 1000);
        Funcionario vendedor = new Vendedor("Bob", 2000, 500);

        gerente.exibirDados();
        System.out.println("Salaio com bônus: " + gerente.calcularSalario());

        vendedor.exibirDados();
        System.out.println("Salario com comissão: " + vendedor.calcularSalario());
    }*/


}
