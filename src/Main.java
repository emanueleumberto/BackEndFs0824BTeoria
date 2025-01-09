import it.epicode.be.test.Automobile;
import it.epicode.be.test.Colore;
import it.epicode.be.test.Test;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int x = 10;
        int j = x;
        long z = x; // casting implicito
        short s = (short) x; // casting esplicito
        double d = x;

        int[] arr = new int[5];
        arr[0] = 25;
        arr[1] = 13;
        arr[2] = 8;
        // arr[3] = 55;

        char[] arrChar = { 'A', 'B', 'C'};
        int[] arrInt = {5,8,9,22};


        int num1 = 10;
        int num2 = 3;
        int res = num1/num2; // 3
        int resto = num1%num2; // 1
        double resDoub = num1/num2; // 3.0
/*
        true & true -> true
        true & false -> false
        false & true -> false
        false & false -> false

        true || true -> true
        true || false -> true
        false || true -> true
        false || false -> false

        !true  -> false
        !false -> true

        true ^ true -> false
        true ^ false -> true
        false ^ true -> true
        false ^ false -> false
        */

        Scanner sc = new Scanner(System.in);
        // System.out.println("Inserisci il tuo nome");
        // String nome = sc.nextLine();
        // System.out.println("Ciao " + nome);

        Test t1 = new Test();
        t1.stampaIf(5);
        t1.stampaWhile(5);
        t1.stampaFor(5);

        // Classe ed istanze
        Automobile a1 = new Automobile("Fiat", "Panda");
        // a1.marca = "Fiat";
        a1.marca = "Ferrari";
        // a1.modello = "Panda";
        // a1.targa = "AB123CD";

        a1.setTarga("AB123CD");
        //System.out.println("Numero di automobili create: " + Automobile.count);
        Automobile a2 = new Automobile("Mercedes", "Abc", "FF987TT");
        //a2.marca = "Mercedes";
        //a2.modello = "Abc";
        // a2.targa = "FF987TT";
        //System.out.println("Numero di automobili create: " + Automobile.count);
        Automobile a3 = new Automobile("Fiat", "Panda", 5);
        //a3.marca = "Fiat";
        //a3.modello = "Panda";
        // a3.targa = "AB124CD";
        //System.out.println("Numero di automobili create: " + Automobile.count);
        // Automobile a4 = new Automobile();

        // Static
        Automobile.stampaCount();

        Automobile a5 = a2;
        //a5.modello = "NEW";
        changeModello(a3);

        int p = 25;

        // Static
        changeNumber(p);
        System.out.println(p); // 25

        a1.info();
        a2.info();
        a3.info();
        a5.info();


        // Enum
        System.out.println("Iserisci un colore tra Bianco - Verde - Rosso");
        Colore colore = Colore.BIANCO;
        System.out.println(colore);

    }

    public static int mioMetodo() {
        // Logica del metodo
        int x = 25;
        return x;
    }

    public static void changeModello(Automobile a) {
        //a.modello = "-----";
    }

    public static void changeNumber(int a) {
        a++;
        System.out.println(a); // 26
    }





}

