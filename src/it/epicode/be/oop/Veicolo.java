package it.epicode.be.oop;

public abstract class Veicolo {

    protected String marca;
    protected String modello;
    protected String targa;
    private String cilindrata = "1900";

    public Veicolo(String marca, String modello, String targa) {
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
    }

    public String info() {
       return this.marca + " " + this.modello + " Targa: " + this.targa + " Cilindrata: " + this.cilindrata;
    }

    // Con final rendo un metodo non sovrascrivibile nelle sottoclassi
    // Impedisco l'override
    final public void sostituisciTarga(String targa) {
        // controlli
        this.targa = targa;
    }

    public abstract void start() ;
}
