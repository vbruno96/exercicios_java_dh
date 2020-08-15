package br.com.santander;

public abstract class Conta {
    protected String id;
    protected String clientId;
    protected float saldo;

    public abstract void sacar();
    public abstract void depositar();
    public abstract void consultarSaldo();

}
