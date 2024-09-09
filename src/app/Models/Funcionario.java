package app.Models;

/**
 * Created by USER on 29/08/2024.
 */

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }

    public double calcularSalario() {
        return salario;
    }
}

