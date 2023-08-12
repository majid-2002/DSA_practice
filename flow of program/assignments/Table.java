package assignments;

public class Table {
    public static void PrintTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }

    public static void main(String[] args) {
        PrintTable(2);
    }

}
