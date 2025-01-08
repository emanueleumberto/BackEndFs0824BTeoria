package it.epicode.be.test;

public class Test {
    // proprietà e metodi di una classe

    int x = 25;

    // metodo di istanza
    public void stampaIf(int j) {
        if(j > 10) {
            System.out.println("Ciao a tutti");
        } else if( j == 25) {
            System.out.println("Il valore è 25!!!");
        } else if( j == 40) {
            System.out.println("Il valore è 25!!!");
        } else {
            System.out.println("Valore errato");
        }
    }

    public void stampaSwitch(int num) {
        switch (num) {
            case 1:
                System.out.println("Gennaio");
                break;
            case 2:
                System.out.println("Febbraio");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            default:
                System.out.println("Valore errato");
                break;
        }
    }

    public void stampaWhile(int num) {
        int i = 0;
        while (i<num) {
            System.out.println(i);
            i++;
        }

        int j = 0;
        while (true) {
            System.out.println(j);

            j++;
            if(j == 5) {
                break;
            }
        }
    }

    public void stampaFor(int num) {
        for (int i =0; i<num; i++) {
            System.out.println(i);
        }
    }
}


