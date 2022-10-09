import java.util.ArrayList;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        ArrayList<Double> listaResultado = new ArrayList<>();
        int index = 0;

        boolean finalizar = false;

        while(!finalizar) {
            int escolha = 0;
            System.out.println("Qual operação deseja realizar?\n" +
                    "1 - Soma\n" +
                    "2 - Subtração\n" +
                    "3 - Divisão\n" +
                    "4 - Multiplicação\n" +
                    "5 - Finalizar");
            escolha = in.nextInt();

            if (escolha != 5) {
                System.out.println("Insira o primeiro valor: ");
                double primeiroValor = in.nextDouble();
                System.out.println("Insira o segundo valor: ");
                double segundoValor = in.nextDouble();

                switch (escolha) {
                    case 1:
                        double soma = primeiroValor + segundoValor;
                        listaResultado.add(soma);
                        System.out.println(soma);
                        break;
                    case 2:
                        double subtracao = primeiroValor - segundoValor;
                        listaResultado.add(subtracao);
                        System.out.println(subtracao);
                        break;
                    case 3:
                        double divisao = (double) primeiroValor / segundoValor;
                        listaResultado.add(divisao);
                        System.out.println(divisao);
                        break;
                    case 4:
                        double multiplicacao = primeiroValor * segundoValor;
                        listaResultado.add(multiplicacao);
                        System.out.println(multiplicacao);
                        break;
                    default:
                        System.out.println("teste");
                }
            }
            else{
                finalizar = true;
            }


        }

        for(double resultado : listaResultado){
            System.out.println(index++ + ": " + resultado);
        }
    }
}
