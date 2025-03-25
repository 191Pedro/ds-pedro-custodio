import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        
        Scanner ladoScanner = new Scanner(System.in);
        
        System.out.println("Insira o lado A de um triangulo: ");
        double a = ladoScanner.nextDouble();

        System.out.println("Insira o lado B de um triangulo: ");
        double b = ladoScanner.nextDouble();

        System.out.println("Insira o lado C de um triangulo: ");
        double c = ladoScanner.nextDouble();

        ladoScanner.close();

        if (a < b) {
            double d = a;
            a = b;
            b = d;
        }
        if (a < c) {
            double d = a;
            a = c;
            c = d;
        }
        if (b < c) {
            double d = b;
            b = c;
            c = d;
        }
        
        System.out.println("Medidas dos lados:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        String lados = "";
        String angulos = "";

        if (a > b + c) {
            System.out.println("As medidas nao formam um triangulo");
        }
        else{
            if (a != b && b != c) {
                lados = "Escaleno";
                if (a * a == (b * b) + (c * c)) {
                    angulos = "Retangulo";
                }
                else if (a * a > (b * b) + (c * c)) {
                    angulos = "Obtusangulo";
                }
                else if (a * a < (b * b) + (c * c)) {
                    angulos = "Acutangulo";
                }
            }
            if (a == b || b == c || a == c) {
                lados = "Isosceles";
                if (a * a == (b * b) + (c * c)) {
                    angulos = "Retangulo";
                }
                else if (a * a > (b * b) + (c * c)) {
                    angulos = "Obtusangulo";
                }
                else if (a * a < (b * b) + (c * c)) {
                    angulos = "Acutangulo";
                }
            }
            if (a == b && b == c) {
                lados = "Equilatero";
                angulos = "Acutangulo";
            }
            System.out.println("As medidas formam um Triangulo " + lados + " " + angulos);
        }
    }
}