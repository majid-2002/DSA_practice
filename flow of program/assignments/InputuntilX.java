package assignments;

import java.util.Scanner;

public class InputuntilX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter a number to add : ");
            String num = sc.next();
            if (num.equals("x")) {
                System.out.println("Sum : " + sum);
                break;
            }
            sum += Integer.parseInt(num);
        }
        sc.close();

    }

}
