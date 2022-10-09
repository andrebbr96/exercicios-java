import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("entre um número");
        double n1 = myObj.nextDouble();
        System.out.println("entre outro número");
        double n2 = myObj.nextDouble();
        double soma = n1 + n2;
        System.out.println("soma de  " + soma);
    }
}

