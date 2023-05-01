package Vetor;
import java.util.Scanner;
public class NomeDaBanda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Digite o nome da banda: ");
            String banda;
            banda = sc.nextLine();

            String[] Musica = new String[3];
            {
                System.out.println("Insira o nome de 3 musicas: ");
                for (int i = 0; i < Musica.length; i++) {
                    String musicas;
                    Musica[i] = sc.nextLine();
                    System.out.println("Musica"+ (i + 1));
                }

            }
        }
    }
}

