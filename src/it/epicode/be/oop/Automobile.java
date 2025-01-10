package it.epicode.be.oop;

public class Automobile extends Veicolo implements Navigatore {

    private int porte;

    public Automobile(String marca, String modello, String targa, int porte) {
        super(marca, modello, targa);
        this.porte = porte;
    }

    @Override
    public void start() {
        // Logica del'implentazione del metodo abstract definito nella superclasse
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
        System.out.println("Aggiorna Navigatore Auto");
    }

    /*public String info() {
        //return this.marca + " " + this.modello + " Targa: " + this.targa + " Num. Porte: " + this.porte;
        return super.info() + " Num. Porte: " + this.porte;
    }*/



}
