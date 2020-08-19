package br.com.santander;

public class Main {
    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[2];

        clientes[0] = new Cliente("A001", "000.000.000-00", "MG00000000", "Bruno", "Vinicius");
        clientes[1] = new Cliente("A002", "000.000.000-00", "MG00000000", "Kauan", "Batista");

        Corrente contaCorrente = new Corrente("0000-01", "A001", 0, 2000);
        Poupanca contaPoupanca = new Poupanca("0100-01", "A002", 0, 0.05F);

        contaCorrente.depositarDinheiro(1500);
        contaCorrente.depositarCheque(500, "Santander", "2020-08-15");
        System.out.println(contaCorrente.consultarSaldo());
        contaCorrente.sacar(100);
        System.out.println(contaCorrente.consultarSaldo());

        contaPoupanca.depositarDinheiro(500);
        contaPoupanca.compensarjuros();
        System.out.println(contaPoupanca.consultarSaldo());
        contaPoupanca.sacar(200);
        System.out.println(contaPoupanca.consultarSaldo());
    }
}
