package br.com.santander;

public class Poupanca extends Conta {
    private float juros;

    public Poupanca() {
    }

    public void compensarjuros() {
        float newSaldo = (getJuros() * this.getSaldo()) + this.getSaldo();
        this.setSaldo(newSaldo);
    }

    public float getJuros() {
        return juros;
    }

    public void setJuros(float juros) {
        this.juros = juros;
    }

    @Override
    public void sacar(float valor) {
        if(this.getJuros() > 0) {
            float newSaldo = this.getSaldo() - valor;
            this.setSaldo(newSaldo);
        } else {
            System.out.println("Saldo indisponível para saque!");
        }
    }

    @Override
    public void depositarDinheiro(float valor) {
        float newSaldo = this.getSaldo() + valor;
        this.setSaldo(newSaldo);
    }

    @Override
    public float consultarSaldo() {
        return this.getSaldo();
    }
}
