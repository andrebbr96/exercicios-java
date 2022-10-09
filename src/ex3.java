import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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
                    int primeiroValor = in.nextInt();
                    System.out.println("Insira o segundo valor: ");
                    int segundoValor = in.nextInt();

                    switch (escolha) {
                        case 1:
                            int soma = primeiroValor + segundoValor;
                            System.out.println(soma);
                            break;
                        case 2:
                            int subtracao = primeiroValor - segundoValor;
                            System.out.println(subtracao);
                            break;
                        case 3:
                            double divisao = (double) primeiroValor / segundoValor;
                            System.out.println(divisao);
                            break;
                        case 4:
                            int multiplicacao = primeiroValor * segundoValor;
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

    }
}
