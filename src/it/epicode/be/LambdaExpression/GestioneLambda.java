package it.epicode.be.LambdaExpression;

public class GestioneLambda {
    public static void main(String[] args) {

        // Classe Concreta che implementa Runnable
        Runnable sr = new SimpleRunnable("Ciao a tutti");
        sr.run();

        // Classe Anonima che implementa Runnable
        Runnable ar = new Runnable() {
            @Override
            public void run() {
                System.out.println("AnonimaRunnable: Sono  una classe anonima");
            }
        };
        ar.run();

        // Lambda Expression
        Runnable ler = () -> System.out.println("LambdaExpressionRunnable: Sono  una Lambda Expression");
        ler.run();

        // Classe Anonima che implementa MiaInterfaccia
        MiaInterfaccia mca = new MiaInterfaccia() {
            @Override
            public void test() {
                System.out.println("Sono mia Interfaccia Anonima");
            }
        };

        mca.test();

        MiaInterfaccia mle = () -> System.out.println("Sono mia Interfaccia LambdaExpression");
        mle.test();

    }
}
