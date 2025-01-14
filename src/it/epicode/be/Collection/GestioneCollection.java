package it.epicode.be.Collection;

import java.util.*;

public class GestioneCollection {
    public static void main(String[] args) {

        Veicolo v1 = new Veicolo("Fiat", "500", "AB123CD");
        Veicolo v2 = new Veicolo("Ford", "Fiesta", "CD456EF");
        Veicolo v3 = new Veicolo("Renault", "Clio", "EF789GG");

        // Collection
        // Set -> Non mantiene elementi duplicati
        System.out.println("----- Set -----");
        Set<Veicolo> listaSet = new HashSet<Veicolo>();
        listaSet.add(v1);
        listaSet.add(v2);
        listaSet.add(v1);
        listaSet.add(v3);

        for (Veicolo v : listaSet) {
            System.out.println(v);
        }

        boolean bc = listaSet.contains(v2); // Controlla se un valore è presente nella collection
        boolean br = listaSet.remove(v2); // Rimuove un valore in una collection
        int s = listaSet.size(); // Restituisce il numero di elementi presenti nella collection
        listaSet.clear(); // Svuota completamente una collection

        boolean empty = listaSet.isEmpty(); // Restituisce un valore booleano se la lista contiene o meno degli elementi

        // SortedSet
        System.out.println("----- SortedSet -----");
        SortedSet<Veicolo> listaSortedSet = new TreeSet<Veicolo>();
        listaSortedSet.add(v1);
        listaSortedSet.add(v2);
        listaSortedSet.add(v1);
        listaSortedSet.add(v3);

        for (Veicolo v : listaSortedSet) {
            System.out.println(v);
        }

        // List -> Accetta valori duplicati e crea una lista ordinata
        System.out.println("----- List -----");
        List<Veicolo> lista = new ArrayList<Veicolo>();
        lista.add(v1);
        lista.add(v2);
        lista.add(v1);
        lista.add(v3);

        for (Veicolo v : lista) {
            System.out.println(v);
        }

        Veicolo fiesta =  lista.get(1);

        // Queue -> Collection ordinata dove l'ordinamento è di tipo FIFO
        System.out.println("----- Queue -----");
        Queue<Veicolo> listaQueue = new LinkedList<Veicolo>();
        listaQueue.add(v1);
        listaQueue.remove();
        listaQueue.peek();
        listaQueue.poll();

        for (Veicolo v : listaQueue) {
            System.out.println(v);
        }

        // Map -> Definisce un contenitore di tipo Chiave-Valore
        System.out.println("----- Map -----");
        Map<String, Veicolo> listaMap = new HashMap<String, Veicolo>();

        listaMap.put("AB123CD", v1); // put per inserire un obj nella mappa comunicando una chiave
        listaMap.put("CD456EF", v2);
        listaMap.put("EF789GG", v3);

        // listaMap.remove("CD456EF"); // tramite la chiave elimino un obj dalla mappa

        Veicolo vm = listaMap.get("AB123CD"); // leggo un obj da una mappa tramite la sua chiave

        listaMap.size(); // restituisce il numero di elementi in un mappa
        // listaMap.clear(); // Svuoto completamente una mappa

        listaMap.containsKey("CD456EF"); // Controlla se una chiave è presente nella mappa
        listaMap.containsValue(v3); // Controlla se un obj è presente nella mappa

        Set<String> listaChiaviMappa = listaMap.keySet(); // Restituisce un Set di chiavi presenti nella mappa
        for (String key: listaChiaviMappa) {
            System.out.println(key);
        }

        Collection<Veicolo> listaVeicoli = listaMap.values();// Restituisce una Collection di oggetti di tipo veicolo di chiavi presenti nella mappa
        for(Veicolo v : listaVeicoli) {
            System.out.println(v);
        }

        // SortedMap -> Definisce un contenitore di tipo Chiave-Valore ordinato in base alla chiavi
        System.out.println("----- SortedMap -----");
        SortedMap<String, Veicolo> listaSortedMap = new TreeMap<String, Veicolo>();

        listaSortedMap.put("AB123CD", v1); // put per inserire un obj nella mappa comunicando una chiave
        listaSortedMap.put("CD456EF", v2);
        listaSortedMap.put("EF789GG", v3);

        for (String key: listaSortedMap.keySet()) {
            System.out.println(key);
        }
    }
}
