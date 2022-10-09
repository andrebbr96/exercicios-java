import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        System.out.println("Insira o primeiro valor: ");
        Scanner in = new Scanner(System.in);
        int primeiroValor = in.nextInt();
        System.out.println("Insira o segundo valor: ");
        int segundoValor = in.nextInt();
        int soma = primeiroValor + segundoValor;
        System.out.println(soma);
    }
}
