import java.util.Scanner;

public class Ex01_temperatura {

    public static void main(String[] args) {
        
        Scanner temperaturaScanner = new Scanner(System.in);

        String medidas = "(Celsius, Kelvin, Fahrenheit, Reaumur, Rankine)";
        String simbolo = "";
        double resultado = 0;

        System.out.println("Programa para converter temperaturas! \n");

        System.out.println("Digite a escala de temperatura que deseja converter");
        System.out.println(medidas);
        String tipoTemperaturaA = temperaturaScanner.next();

        if (tipoTemperaturaA.equalsIgnoreCase("Celsius")) {
            medidas = "(Kelvin, Fahrenheit, Reaumur, Rankine)";
        }
        if (tipoTemperaturaA.equalsIgnoreCase("Kelvin")) {
            medidas = "(Celsius, Fahrenheit, Reaumur, Rankine)";
        }
        if (tipoTemperaturaA.equalsIgnoreCase("Fahrenheit")) {
            medidas = "(Celsius, Kelvin, Reaumur, Rankine)";
        }
        if (tipoTemperaturaA.equalsIgnoreCase("Reaumur")) {
            medidas = "(Celsius, Kelvin, Fahrenheit, Rankine)";
        }
        if (tipoTemperaturaA.equalsIgnoreCase("Rankine")) {
            medidas = "(Celsius, Kelvin, Fahrenheit, Reaumur)";
        }
        
        System.out.println("Digite o valor da temperatura: ");
        double temperatura = temperaturaScanner.nextDouble();
        
        System.out.println("Digite a escala para qual voce quer converter");
        System.out.println(medidas);
        String tipoTemperaturaB = temperaturaScanner.next();

        temperaturaScanner.close();

        if (tipoTemperaturaB.equalsIgnoreCase("Celsius")) {
            simbolo = "°C";
        }
        if (tipoTemperaturaB.equalsIgnoreCase("Kelvin")) {
            simbolo = "K";
        }
        if (tipoTemperaturaB.equalsIgnoreCase("Fahrenheit")) {
            simbolo = "°F";
        }
        if (tipoTemperaturaB.equalsIgnoreCase("Reaumur")) {
            simbolo = "°Re";
        }
        if (tipoTemperaturaB.equalsIgnoreCase("Rankine")) {
            simbolo = "°R";
        }

        if (tipoTemperaturaA.equalsIgnoreCase("Celsius")) { // temperatura = celsius
            if (tipoTemperaturaB.equalsIgnoreCase("Kelvin")) {
                resultado = temperatura + 273.15;
            }
            if (tipoTemperaturaB.equalsIgnoreCase("Fahrenheit")) {
                resultado = temperatura * 1.8 + 32;
            }
            if (tipoTemperaturaB.equalsIgnoreCase("Reaumur")) {
                resultado = temperatura * 0.8;
            }
            if (tipoTemperaturaB.equalsIgnoreCase("Rankine")) {
                resultado = temperatura * 1.8 + 32 + 459.67;
            }
        }
        if (tipoTemperaturaA.equalsIgnoreCase("Kelvin")) { // temperatura = kelvin
            if (tipoTemperaturaB.equalsIgnoreCase("Celsius")) {
                resultado = temperatura - 273.15;
            }
            if (tipoTemperaturaB.equalsIgnoreCase("Fahrenheit")) {
                resultado = (temperatura - 273.15) * 1.8 + 32;
            }
            if (tipoTemperaturaB.equalsIgnoreCase("Reaumur")) {
                resultado = (temperatura - 273.15) * (4 / 5);
            }
            if (tipoTemperaturaB.equalsIgnoreCase("Rankine")) {
                resultado = temperatura * (9 / 5);
            }
        }
        if (tipoTemperaturaA.equalsIgnoreCase("Fahrenheit")) { // temperatura = fahrenheit
            if (tipoTemperaturaB.equalsIgnoreCase("Celsius")) {
                resultado = (temperatura - 32) / 1.8;
            }
            if (tipoTemperaturaB.equalsIgnoreCase("Kelvin")) {
                resultado = (temperatura - 32) * (5 / 9) + 273.15;
            }
            if (tipoTemperaturaB.equalsIgnoreCase("Reaumur")) {
                resultado = (temperatura - 32) * (4 / 9);
            }
            if (tipoTemperaturaB.equalsIgnoreCase("Rankine")) {
                resultado = temperatura + 459.67;
            }
        }
        if (tipoTemperaturaA.equalsIgnoreCase("Reaumur")) { // temperatura = reaumur
            if (tipoTemperaturaB.equalsIgnoreCase("Celsius")) {
                resultado = temperatura * (4 / 5);
            }
            if (tipoTemperaturaB.equalsIgnoreCase("Kelvin")) {
                resultado = (temperatura * (5 / 4)) + 273.15;
            }
            if (tipoTemperaturaB.equalsIgnoreCase("Fahrenheit")) {
                resultado = (temperatura * (9 / 4)) + 32;
            }
            if (tipoTemperaturaB.equalsIgnoreCase("Rankine")) {
                resultado = (temperatura * (9 / 4)) + 491.67;
            }
        }
        if (tipoTemperaturaA.equalsIgnoreCase("Rankine")) { // temperatura = rankine
            if (tipoTemperaturaB.equalsIgnoreCase("Celsius")) {
                resultado = (temperatura - 491.67) * (5 / 9);
            }
            if (tipoTemperaturaB.equalsIgnoreCase("Kelvin")) {
                resultado = temperatura * (5 / 9);
            }
            if (tipoTemperaturaB.equalsIgnoreCase("Fahrenheit")) {
                resultado = temperatura - 459.67;
            }
            if (tipoTemperaturaB.equalsIgnoreCase("Reaumur")) {
                resultado = (temperatura - 491.67) * (4 / 9);
            }
        }

        System.out.println("Resultado da conversão: " + resultado + simbolo);

    }
}