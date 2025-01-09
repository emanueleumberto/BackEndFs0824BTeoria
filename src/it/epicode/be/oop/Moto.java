package it.epicode.be.oop;

public class Moto extends Veicolo{

    private boolean baule;

    public Moto(String marca, String modello, String targa, boolean baule) {
        super(marca, modello, targa);
        this.baule = baule;
    }

    public String info() {
        //return this.marca + " " + this.modello + " Targa: " + this.targa + " Baule: " + this.baule;
        return super.info() + " Baule: " + this.baule;
    }
}
