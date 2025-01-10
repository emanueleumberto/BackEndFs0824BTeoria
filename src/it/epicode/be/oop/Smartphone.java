package it.epicode.be.oop;

public class Smartphone implements Navigatore{

    protected String marca;
    protected String modello;

    public Smartphone(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }

    public String info() {
        return this.marca + " " + this.modello;
    }

    public String info(String x) {
        return this.marca + " " + this.modello;
    }

    public String info(int z) {
        return this.marca + " " + this.modello;
    }

    @Override
    public void avvia() {

    }

    @Override
    public void spegni() {

    }

    @Override
    public void impostaMappa() {

    }

    @Override
    public void aggiorna() {
        System.out.println("Aggiorna Navigatore Smartphone");
    }
}
