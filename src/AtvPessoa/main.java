package AtvPessoa;

public class main {

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static boolean isPositivo(int numero) {
        return numero > 0;
    }

    public static void main(String[] args) {
        System.out.println("Soma: " + somar(3, 2));
        System.out.println("Subtração: " + subtrair(5, 3));
        System.out.println("É positivo: " + isPositivo(4));
    }
}
