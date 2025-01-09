package it.epicode.be.test;

public class Automobile {

    // Attributi o Proprietà di istanza
    // Scope classe o di istanza
    private String targa;
    private String modello;
    public String marca;
    int ruote; // package
    private static int count = 0;

    // Ogni classe ha bisogno di un costruttore per istanziare un oggetto
    // Se non definisco un costruttore viene aggiunto un costruttore di default
    // Posso definire più costruttori. IMPORTANTE devono differire in qualcosa
    // Possono differire in: Numero dei parametri, tipo o posizione
    public Automobile(String marca, String modello){
        this.modello = modello;
        this.marca = marca;
        count++;
    }

    public Automobile(String marca, String modello, String targa){
        this.modello = modello;
        this.marca = marca;
        this.targa = targa;
        count++;
    }

    public Automobile(String marca, String modello, int ruote){
        this.modello = modello;
        this.marca = marca;
        this.ruote = ruote;
        count++;
    }

    public Automobile(String marca, int ruote, String modello){
        this.modello = modello;
        this.marca = marca;
        this.ruote = ruote;
        count++;
    }

    public String getTarga() {
        // controlli
        return this.targa;
    }

    public void setTarga(String targa) {
        // controlli
        this.targa = targa;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModello() {
        return this.modello;
    }

    // Metodi di istanza
    public void info() {
        System.out.println(this.marca + " " + this.modello + " " + this.targa);
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

    public static void stampaCount() {
        System.out.println("Numero di automobili create: " + Automobile.count);
    }

}
