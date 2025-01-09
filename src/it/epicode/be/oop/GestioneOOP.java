package it.epicode.be.oop;

public class GestioneOOP {
    public static void main(String[] args) {
        Automobile a1 = new Automobile("Fiat", "Panda", "AB123CD", 3);
        Moto m1 = new Moto("Honda", "Hornet", "CD456EF", true);
        Camper c1 = new Camper("Laika", "ABC", "GH789LM", 5);
        Automobile a2 = new Automobile("Ford", "Fiesta", "JU963YH", 5);
        Smartphone s1 = new Smartphone("Apple", "Iphone");

        Veicolo[] veicoli = new Veicolo[4];
        veicoli[0] = a1;
        veicoli[1] = a2;
        veicoli[2] = m1;
        veicoli[3] = c1;

        for (int i = 0; i < veicoli.length; i++) {
            System.out.println(veicoli[i].info());
        }


    }
}
