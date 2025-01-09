package it.epicode.be.oop;

public class Automobile extends Veicolo {

    private int porte;

    public Automobile(String marca, String modello, String targa, int porte) {
        super(marca, modello, targa);
        this.porte = porte;
    }

    public String info() {
        //return this.marca + " " + this.modello + " Targa: " + this.targa + " Num. Porte: " + this.porte;
        return super.info() + " Num. Porte: " + this.porte;
    }

}
