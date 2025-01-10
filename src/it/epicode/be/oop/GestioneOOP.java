package it.epicode.be.oop;

public class GestioneOOP {
    public static void main(String[] args) {
        Automobile a1 = new Automobile("Fiat", "Panda", "AB123CD", 3);
        Moto m1 = new Moto("Honda", "Hornet", "CD456EF", true);
        Camper c1 = new Camper("Laika", "ABC", "GH789LM", 5);
        Automobile a2 = new Automobile("Ford", "Fiesta", "JU963YH", 5);
        Veicolo v1 = new Automobile("Mercedes", "ClasseA", "PP000PP", 5);
        System.out.println(v1.info());
        Smartphone s1 = new Smartphone("Apple", "Iphone");
        // Veicolo v = new Veicolo("Renault", "Captur", "TT888TT"); -> ERRORE Abstract

        Veicolo[] veicoli = new Veicolo[4];
        veicoli[0] = a1;
        veicoli[1] = a2;
        veicoli[2] = m1;
        veicoli[3] = c1;

        for (int i = 0; i < veicoli.length; i++) {
            if(veicoli[i] instanceof Camper) {
                Camper c = (Camper) veicoli[i];
                System.out.println(c.info());
            } else {
                System.out.println(veicoli[i].info());
            }

        }

        Navigatore[] oggConNavigatore = new Navigatore[3];
        oggConNavigatore[0] = a1;
        oggConNavigatore[1] = s1;
        oggConNavigatore[2] = a2;

        for (int i = 0; i < oggConNavigatore.length; i++) {
            oggConNavigatore[i].aggiorna();
        }

    }
}
