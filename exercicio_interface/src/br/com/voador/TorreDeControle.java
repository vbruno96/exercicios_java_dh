package br.com.voador;

public class TorreDeControle {
    private Voador[] voadores;

    public TorreDeControle(Voador[] voadores) {
        this.voadores = voadores;
    }

    public void voemTodos() {
        for (int x = 0; x < this.voadores.length; x++) {
            voadores[x].voar();
            System.out.println("----------------------------");
        }
    }
}
