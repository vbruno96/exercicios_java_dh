package br.com.voador;

public class SuperHomem implements Voador {
    private int experiencia;

    public SuperHomem() {
        this.setExperiencia(0);
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public void voar() {
        System.out.println("Estou voando como um campeão\nExperiência: " +this.getExperiencia());
        int xp = getExperiencia() + 3;
        this.setExperiencia(xp);
    }
}
