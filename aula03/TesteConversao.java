public class TesteConversao {
  public static void main(String[] args) {

    int valorInt1 = 10;
    System.out.println(valorInt1);
    double valorDouble1 = valorInt1;
    System.out.println(valorDouble1);

    float valorFloat1 = 5.5f;
    System.out.println(valorFloat1);
    int valorInt2 = (int) valorFloat1;
    System.out.println(valorInt2);
  }
}