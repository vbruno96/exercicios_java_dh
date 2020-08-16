package br.com.santander;

import java.util.Date;

public class Corrente extends Conta {
    private float chequeEspecial;
    private float saldoChequeEspecial;


    public Corrente(String id, String clientId, float saldo, float chequeEspecial) {
        this.id = id;
        this.clientId = clientId;
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
        this.saldoChequeEspecial = chequeEspecial;
    }

    public float getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(float chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public float getSaldoChequeEspecial() {
        return saldoChequeEspecial;
    }

    public void setSaldoChequeEspecial(float saldoChequeEspecial) {
        this.saldoChequeEspecial = saldoChequeEspecial;
    }

    public void compencaChequeEspecial() {
        if(getChequeEspecial() != getSaldoChequeEspecial()) {
            float cheque = getChequeEspecial() - getSaldoChequeEspecial();
            float newSaldo = getSaldo() - cheque;
            this.setSaldoChequeEspecial(newSaldo);
            this.setSaldo(getSaldo() - newSaldo);
        }
    }

    public void depositarCheque(float valor, String bancoEmissor, String dataPagamento) {
        float newSaldo = this.getSaldo() + valor;
        this.setSaldo(newSaldo);
        compencaChequeEspecial();
    }

    /* debita valor de saque de cheque especial */
    public void saqueChequeEspecial(float valor) {
        float newSaldo = this.getSaldoChequeEspecial() - valor;
        this.setSaldoChequeEspecial(newSaldo);
    }


    /*
    * verifica saldo positivo se sim debita valor do saldo
    * senão verifica o cheque especial
    * não cumprindo nenhuma das condições anteriores informa que não há saldo disponivel
    */
    @Override
    public void sacar(float valor) {
        if(this.getSaldo() > 0) {
            float newSaldo = this.getSaldo() - valor;
            this.setSaldo(newSaldo);
        } else if ((this.getSaldo() <= 0) && (this.getChequeEspecial() > 0)) {
            this.saqueChequeEspecial(valor);
        } else {
            System.out.println("Saldo indisponível para saque!");
        }
    }

    @Override
    public void depositarDinheiro(float valor) {
        float newSaldo = this.getSaldo() + valor;
        this.setSaldo(newSaldo);
        compencaChequeEspecial();
    }

    @Override
    public float consultarSaldo() {
        float saldoTotalDisponivel = getSaldo() + getChequeEspecial();
        return saldoTotalDisponivel;
    }
}
