package app.Models;

/**
 * Created by USER on 28/08/2024.
 */

public class ContaCorrente {
    private double saldo;

    public ContaCorrente(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double quantia) {
        saldo += quantia;
    }

    public void levantar(double quantia) {
        double taxa = quantia * 0.5 / 100;
        saldo -= (quantia + taxa);
    }

    public double obterSaldo() {
        return saldo;
    }
}

