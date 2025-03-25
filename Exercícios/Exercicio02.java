import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        
        Scanner codigoScanner = new Scanner(System.in); // Professor, não sei o porquê do código do funcionário, mas está aí
        System.out.println("Insira seu codigo: ");
        int codigo = codigoScanner.nextInt();
        
        Scanner sexoScanner = new Scanner(System.in);
        System.out.println("Insira seu sexo \n (H para Homem / M para Mulher): ");
        String sexo = sexoScanner.nextLine();
        
        Scanner tempoTrabalhoScanner = new Scanner(System.in);
        System.out.println("Insira seu tempo de serviço (em anos): ");
        int tempoTrabalho = tempoTrabalhoScanner.nextInt();
        
        Scanner salarioScanner = new Scanner(System.in);
        System.out.println("Insira seu salario: ");
        double salario = salarioScanner.nextDouble();

        codigoScanner.close();
        sexoScanner.close();
        tempoTrabalhoScanner.close();
        salarioScanner.close();

        double bonus = 0;
        String descricaoBonus = "";

        if (sexo.equalsIgnoreCase("H") && tempoTrabalho > 15) {
            bonus = salario * 0.2;
            descricaoBonus = "\n (bonus de 20% de seu salario)";
        }
        else if (sexo.equalsIgnoreCase("M") && tempoTrabalho > 10) {
            bonus = salario * 0.25;
            descricaoBonus = "\n (bonus de 25% de seu salario)";
        }
        else{ // 100 reais de bônus?
            bonus = 100;
            descricaoBonus = "\n (bonus de 100 reais)";
        }

        System.out.println("Seu codigo de funcionario: " + codigo);
        System.out.println("Seu salario: R$" + salario);
        System.out.println("Seu bonus: R$" + bonus + descricaoBonus);

    }
}