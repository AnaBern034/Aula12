package Vetor;
import java.util.Scanner;
public class DezAlunos {
    public static void main(String[] args) {
        String[] Nome = new String[10];
        Scanner nomedigitado= new Scanner(System.in);

        for (int i=0; i < Nome.length; i++) {
            System.out.println("Digite o nome dos alunos: " + (i + 1));
            Nome[i]=nomedigitado.nextLine();
        }
        System.out.println("Lista de chamada");
        for (String nome : Nome) {
            System.out.println(nome);
        }


    }
}
