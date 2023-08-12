import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            list2.add(new ArrayList<>()); //add list to the list in list2
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list2.get(i).add(in.nextInt());
            }
        }
        System.out.println(list2);
    }
}
