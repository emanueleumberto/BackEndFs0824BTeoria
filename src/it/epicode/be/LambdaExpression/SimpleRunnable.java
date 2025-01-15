package it.epicode.be.LambdaExpression;

public class SimpleRunnable implements Runnable {
    private String message;

    public SimpleRunnable(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println("SimpleRunnable: " + this.message);
    }
}
