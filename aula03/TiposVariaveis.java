public class TiposVariaveis {
    public static void main(String[] args) {
        int myNum = 10;
        float myCum = 5.5f;
        char myLetter = 'A';
        boolean myBool = false;
        String myText = "Oláa";
        double myBoolean = 9.75d;
        long myLong = -9;

        System.out.println(myNum);
        System.out.println(myCum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);
        System.out.println(myBoolean);
        System.out.println(myLong);

        System.out.println("\n\n\n-----------------------------------PT 2-----------------------------------\n\n\n");


        int items = 45;
        int food = 5;
        float costPerFood = 15.99f;
        float costPerItem = 9.99f;
        float foodCost = costPerFood * food;
        float totalCost = items * costPerItem;
        float otherCost = totalCost - foodCost;
        char currency = '$';

        // Print variables
        System.out.println("\nNumber of items: " + items);
        System.out.println("\nNumber of foods: " + food);
        System.out.println("\nCost per food: " + costPerFood);
        System.out.println("\nCost per item: " + costPerItem + currency);
        System.out.println("\nTotal cost = " + totalCost + currency);
        System.out.println("\nFood cost = " + foodCost + currency);
        System.out.println("\nOther cost = " + otherCost + currency);
    }
}