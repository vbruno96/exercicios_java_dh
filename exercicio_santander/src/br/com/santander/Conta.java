package br.com.santander;

public abstract class Conta {
    protected String id;
    protected String clientId;
    protected float saldo;

    public Conta() {
    }

    public abstract void sacar(float valor);
    public abstract void depositarDinheiro(float valor);
    public abstract float consultarSaldo();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
