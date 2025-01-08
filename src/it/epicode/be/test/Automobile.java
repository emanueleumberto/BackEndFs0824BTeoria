package it.epicode.be.test;

public class Automobile {

    // Attributi o Proprietà di istanza
    // Scope classe o di istanza
    public String targa;
    public String modello;
    public String marca;
    public int ruote;

    // Ogni classe ha bisogno di un costruttore per istanziare un oggetto
    // Se non definisco un costruttore viene aggiunto un costruttore di default
    // Posso definire più costruttori. IMPORTANTE devono differire in qualcosa
    // Possono differire in: Numero dei parametri, tipo o posizione
    public Automobile(String mr, String m){
        modello = m + "!!!";
        marca = mr;
    }

    public Automobile(String mr, String m, String t){
        modello = m;
        marca = mr;
        targa = t;
    }

    public Automobile(String mr, String m, int r){
        modello = m;
        marca = mr;
        ruote = r;
    }

    public Automobile(String mr, int r, String m){
        modello = m;
        marca = mr;
        ruote = r;
    }

    // Metodi di istanza
    public void info() {
        System.out.println(marca + " " + modello + " " + targa);
    }

    public void test() {
        // Scope di metodo
        int x = 25;

        System.out.println(modello + x);
        if(true) {
            // Scope di blocco
            int z = 10;
            System.out.println(modello + x + z);
        }

    }

}
