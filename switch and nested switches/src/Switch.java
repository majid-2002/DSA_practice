import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter fruit Name");
        String fruit = in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grape" -> System.out.println("Small fruit");
            default -> System.out.println("please enter a valid fruit");
        }

    }
}
