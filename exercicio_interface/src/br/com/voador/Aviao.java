package br.com.voador;

public class Aviao implements Voador {
    private float hrsDeVoo;

    public Aviao() {
        this.setHrsDeVoo(0);
    }

    public float getHrsDeVoo() {
        return hrsDeVoo;
    }

    public void setHrsDeVoo(float hrsDeVoo) {
        this.hrsDeVoo = hrsDeVoo;
    }

    @Override
    public void voar() {
        System.out.println("Estou voando como um avião\nTenho " +this.getHrsDeVoo()+ " horas de voo");
        float voo = this.getHrsDeVoo() + 13;
        this.setHrsDeVoo(voo);
    }
}
