import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner nomeFuncionarioScanner = new Scanner(System.in);
        System.out.println("Insira seu nome: ");
        String nomeFuncionario = nomeFuncionarioScanner.next();

        Scanner horasTrabalhoScanner = new Scanner(System.in);
        System.out.println("Insira o numero de horas trabalhadas: ");
        int horasTrabalho = horasTrabalhoScanner.nextInt();

        Scanner valorPorHoraScanner = new Scanner(System.in);
        System.out.println("Insira o valor por hora trabalhada: ");
        double valorPorHora = valorPorHoraScanner.nextDouble();

        Scanner filhosScanner = new Scanner(System.in);
        System.out.println("Insira a quantidade de filhos menores que 14 anos: ");
        int filhos = filhosScanner.nextInt();

        Scanner idadeScanner = new Scanner(System.in);
        System.out.println("Insira sua idade: ");
        int idade = idadeScanner.nextInt();

        Scanner tempoServicoScanner = new Scanner(System.in);
        System.out.println("Insira seu tempo de serviço: ");
        int tempoServico = tempoServicoScanner.nextInt();

        Scanner salarioFamiliaScanner = new Scanner(System.in);
        System.out.println("Insira seu salario familia: ");
        int salarioFamilia = salarioFamiliaScanner.nextInt();

        nomeFuncionarioScanner.close();
        horasTrabalhoScanner.close();
        valorPorHoraScanner.close();
        filhosScanner.close();
        idadeScanner.close();
        tempoServicoScanner.close();
        salarioFamiliaScanner.close();

        double salarioBruto = horasTrabalho * valorPorHora;
        double INPS = salarioBruto * 0.085;
        double bonusSalarioFamilia = salarioFamilia * filhos;
        double IR = 0;
        double adicional = 0;

        if (salarioBruto > 1500) {
            IR = salarioBruto * 0.15;
        }
        else if (salarioBruto > 500) {
            IR = salarioBruto * 0.08;
        }
        else if (500 >= salarioBruto) {
            IR = 0;
        }

        if (idade > 40) {
            adicional = salarioBruto * 0.02;
        }
        else if (tempoServico > 15) {
            adicional = salarioBruto * 0.035;
        }
        else if (15 >= tempoServico && tempoServico > 5 && idade > 30){
            adicional = salarioBruto * 0.015;
        }

        double salarioLiquido = salarioBruto - INPS - IR + adicional + salarioFamilia;
        double desconto = INPS + IR;
        double bonus = adicional + bonusSalarioFamilia;

        System.out.println("Nome do funcionario: " + nomeFuncionario);
        System.out.println("Salario bruto: R$" + salarioBruto);
        System.out.println("Salario liquido: R$" + salarioLiquido);
        System.out.println("Total de descontos: R$" + desconto);
        System.out.println("Total de bonus: R$" + bonus);

    }
}
