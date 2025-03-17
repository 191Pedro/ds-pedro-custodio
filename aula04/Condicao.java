import java.util.Scanner;

public class Condicao {
    public static void main(String[] args) {
        Scanner V1 = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int N1 = V1.nextInt();
        
        Scanner V2 = new Scanner(System.in);
        System.out.println("Insira outro numero: ");
        int N2 = V2.nextInt();
        
        V1.close();
        V2.close();
        
        if (N1 > N2) {
            System.out.println(N1 + " e maior que " + N2);
        }
        else if (N1 == N2) {
            System.out.println(N1 + " e igual a " + N2);
        }
        else{
            System.out.println(N1 + " e menor que " + N2);
        }
    }
}