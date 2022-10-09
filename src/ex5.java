import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        String[] nomes = new String[10];
        for (int i = 0; i < nomes.length ; i++) {
            System.out.println("Digite o " + (i+1) + " nome");
            Scanner in = new Scanner(System.in);
            nomes[i] = in.nextLine();
        }
        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}
