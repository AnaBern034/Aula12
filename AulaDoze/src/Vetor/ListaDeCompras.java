package Vetor;
import java.util.Scanner;
public class ListaDeCompras {
    Scanner sc =new Scanner(System.in);
    {
        System.out.println("Digite a quantidade de itens: ");
        int qntd = sc.nextInt();

        String[] Lista = new String[qntd];
        System.out.println("Digite a lista de compras: ");

        for (int i = 0; i < Lista.length; i++)
        { Lista[i] = sc.next();}
            System.out.println("Lista de compra");

            for(int i =0; i < Lista.length; i++)
            {System.out.println((i+1)+"."+Lista);}


    }
}
