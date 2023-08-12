import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter empID");
        int empId = in.nextInt();
        System.out.println("Enter dept");
        String department = in.next();

        switch (empId) {
            case 1 -> System.out.println("Majid");
            case 2 -> System.out.println("Shanif");
            case 3 -> {
                System.out.println("empID 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "CS" -> System.out.println("CS department");
                }
            }
        }
    }
}
