import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in); // Declara que a variável 'a' pode receber valor através do nextInt()
        System.out.println("Insira um valor para A");
        int n1 = a.nextInt(); // Lê um valor para a variável 'a'
        Scanner b = new Scanner(System.in); // Declara que a variável 'b' pode receber valor através do nextInt()
        System.out.println("Insira um valor para B");
        int n2 = b.nextInt(); // Lê um valor para a variável 'b'

        int n3 = n1 + n2; // Soma as variáveis

        System.out.println("A soma de A e B é " + n3); // Exibe o resultado da soma
    }
}