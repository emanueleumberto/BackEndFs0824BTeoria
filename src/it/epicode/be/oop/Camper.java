package it.epicode.be.oop;

public class Camper extends Veicolo {
    private int postiLetto;

    public Camper(String marca, String modello, String targa, int postiLetto) {
        super(marca, modello, targa);
        this.postiLetto = postiLetto;
    }

    public String info() {
        //return this.marca + " " + this.modello + " Targa: " + this.targa + " Num. Posti letto: " + this.postiLetto;
        return  super.info() + " Num. Posti letto: " + this.postiLetto;
    }
}
