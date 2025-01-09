package it.epicode.be.oop;

public class Smartphone {

    protected String marca;
    protected String modello;

    public Smartphone(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }

    public String info() {
        return this.marca + " " + this.modello;
    }

}
