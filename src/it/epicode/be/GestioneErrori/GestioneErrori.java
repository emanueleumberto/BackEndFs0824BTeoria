package it.epicode.be.GestioneErrori;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class GestioneErrori {

    static Scanner sc = new Scanner(System.in);
    static Logger logger = LoggerFactory.getLogger(GestioneErrori.class);

    public static void main(String[] args) {

        try {
            operazioni();
        } catch (NumberFormatException e) {
            // System.out.println("Errore!!! Hai inserito un valore non valido : " + e.getMessage());
            logger.error("Errore!!! Hai inserito un valore non valido : " + e.getMessage());
        } catch (ArithmeticException e) {
            // System.out.println("Errore!!! Non puoi dividere per 0");
            logger.error("Errore!!! Non puoi dividere per 0");
        } catch (MyCustomException e) {
            // System.out.println("Errore!!! Non puoi avere un risultato minore di 10");
            logger.error("Errore!!! Non puoi avere un risultato minore di 10");
        } catch (Exception e) {
            // System.out.println("Errore!!! " + e.getMessage());
            logger.error("Errore!!! " + e.getMessage());
        } finally {
            // System.out.println("-- Fine --");
            logger.debug("-- Fine --");
        }

    }

    public static void operazioni() throws Exception {
        System.out.println("Digita 1 per somma, 2  per sottrazione, 3 per divisione o 4 per moltiplicazione");
        System.out.print("Seleziona operazione: ");
        int o = Integer.parseInt(sc.nextLine());
        if(o == 1) {
            somma();
        } else if(o == 2) {
            sottrazione();
        } else if(o == 3) {
            divisione();
        } else if(o == 4) {
            moltiplicazione();
        }
    }

    public static void somma(){
        System.out.print("Inserisci un numero: ");
        // Faccio il parse (trasformazione) di un dato di tipo String in un dato di tipo numerico
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Inserisci un secondo  numero: ");
        int num2 = Integer.parseInt(sc.nextLine());

        System.out.println("Il numeri inseriti sono " + num1 + " e " + num2);
        int r = num1 + num2;
        // System.out.println("Il risultato della somma è " + r);
        logger.info("Il risultato della somma è " + r);
    }

    public static void sottrazione(){
        System.out.print("Inserisci un numero: ");
        // Faccio il parse (trasformazione) di un dato di tipo String in un dato di tipo numerico
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Inserisci un secondo  numero: ");
        int num2 = Integer.parseInt(sc.nextLine());

        System.out.println("Il numeri inseriti sono " + num1 + " e " + num2);
        int r = num1 - num2;
        // System.out.println("Il risultato della sottrazione è " + r);
        logger.info("Il risultato della sottrazione è " + r);
    }

    public static void moltiplicazione() throws Exception {
        System.out.print("Inserisci un numero: ");
        // Faccio il parse (trasformazione) di un dato di tipo String in un dato di tipo numerico
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Inserisci un secondo  numero: ");
        int num2 = Integer.parseInt(sc.nextLine());

        System.out.println("Il numeri inseriti sono " + num1 + " e " + num2);
        int r = num1 * num2;
        if(r < 10) {
            throw new MyCustomException("Il risultato è minore di 10");
        }
        // System.out.println("Il risultato della moltiplicazione è " + r);
        logger.info("Il risultato della moltiplicazione è " + r);
    }

    public static void divisione() {
        int x = 10;
        System.out.print("Inserisci un numero: ");
        // Faccio il parse (trasformazione) di un dato di tipo String in un dato di tipo numerico

        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Inserisci un secondo  numero: ");
        int num2 = Integer.parseInt(sc.nextLine());

        System.out.println("Il numeri inseriti sono " + num1 + " e " + num2);
        int r = num1 / num2;
        // System.out.println("Il risultato della divisione è " + r);
        logger.info("Il risultato della divisione è " + r);
    }

}
