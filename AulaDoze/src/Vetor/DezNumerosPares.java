package Vetor;
import java.util.Scanner;
public class DezNumerosPares {
    public static void main(String[] args) {
        int[] nmrIn = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nmrIn.length; i++)
        {System.out.println("Digite 10 valores: ");
            nmrIn[i] = sc.nextInt();}
        System.out.println("Numeros pares: ");

        for (int i=0;i < nmrIn.length;i++)
        if (nmrIn[i] % 2==0){
            System.out.println(nmrIn[i]);
        }


    }
}

