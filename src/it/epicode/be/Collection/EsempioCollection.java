package it.epicode.be.Collection;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EsempioCollection {

    private static Logger log = LoggerFactory.getLogger(EsempioCollection.class);
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Set<Veicolo> listaVeicoli = new HashSet<Veicolo>();

        while(true) {
            System.out.println("Scrivi 1 per inserire un veicolo, 2 per stampare una lista di veicoli o 0 per terminare l'inserimento");
            try {
                int ins = Integer.parseInt(scan.nextLine());
                if (ins == 0) {
                    System.out.println("Fine inserimento");
                    break;
                } else if (ins == 1) {
                    listaVeicoli.add(inserisciVeicolo());
                    log.info("Veicolo inserito correttamente");
                } else if (ins == 2) {
                    stampaListaVeicoli(listaVeicoli);
                } else {
                    log.error("Non hai inserito un valore valido");
                }
            } catch (NumberFormatException e) {
                log.error(e.getMessage());
            } catch (RuntimeException e) {
                log.error(e.getMessage());
            }
        }


    }

    public static Veicolo inserisciVeicolo() {
        System.out.println("Inserisci i dati del Veicolo: ");
        System.out.print("Inserisci la marca: ");
        String marca = scan.nextLine();
        if(marca.length() < 3) {
            throw new RuntimeException("Valore marca inserito non valido");
        }
        System.out.print("Inserisci il modello: ");
        String modello = scan.nextLine();
        if(modello.length() < 3) {
            throw new RuntimeException("Valore modello inserito non valido");
        }
        System.out.print("Inserisci la targa: ");
        String targa = scan.nextLine();
        if(targa.length() < 3) {
            throw new RuntimeException("Valore targa inserito non valido");
        }
        return new Veicolo(marca, modello, targa);
    }

    public static void stampaListaVeicoli(Set<Veicolo> lista) {
        for(Veicolo v : lista) {
            System.out.println(v);
        }
    }

}
