import java.util.Scanner;

class Input {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username:\n");

    String userName = myObj.nextLine();
    System.out.println("Username is: " + userName);
  }
}