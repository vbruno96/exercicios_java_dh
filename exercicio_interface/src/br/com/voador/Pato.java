package br.com.voador;

public class Pato implements Voador {
    private int energia;

    public Pato() {
        this.recarregarEnergia();
    }

    public void recarregarEnergia() {
        this.setEnergia(100);
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    @Override
    public void voar() {
        if (this.getEnergia() > 0) {
            this.setEnergia(getEnergia() - 5);
            System.out.println("Estou voando como um pato\nEnergia restante: " +this.getEnergia());
        } else {
            System.out.println("Não tenho energia suficiente para voar, recarrege a energia!");
        }
    }
}
