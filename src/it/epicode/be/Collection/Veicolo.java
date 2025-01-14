package it.epicode.be.Collection;



public class Veicolo implements Comparable<Veicolo> {
    private String marca;
    private String modello;
    private String targa;

    public Veicolo(String marca, String modello, String targa) {
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
    }

    @Override
    public String toString() {
        return "Veicolo: " + this.marca + " " + this.modello + " Targa: " + this.targa;
    }


    @Override
    public int compareTo(Veicolo o) {
        return 0;
    }
}
