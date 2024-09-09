package app.Models;

/**
 * Created by USER on 28/08/2024.
 */

public class ContaCorrenteEspecial extends ContaCorrente {

    public ContaCorrenteEspecial(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void levantar(double quantia) {
        double taxa = quantia * 0.1 / 100;
        super.levantar(quantia + taxa);
    }
}

