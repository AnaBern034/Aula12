package Vetor;
public class CincoValores {
    public static void main(String[] args) {
    int[] valor = new int[5];
    int soma =0;
    valor [0] = 10;
    valor [1] = 9;
    valor [2] = 8;
    valor [3] = 7;
    valor [4] = 6;

    for(int i= 0; i < valor.length; i++)
    soma += valor[i];
    {
        System.out.println("o valor da soma é "+soma);
    }


    }
}
