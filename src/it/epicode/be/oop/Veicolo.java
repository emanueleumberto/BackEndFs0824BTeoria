package it.epicode.be.oop;

public class Veicolo {

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
}
