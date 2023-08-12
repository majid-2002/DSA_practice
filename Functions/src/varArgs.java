import java.util.Arrays;

public class varArgs {

    public static void main(String[] args) {
        fun(1, 2, 3, 4, 5, 6, 7, 8);
        multiple(1, 2, "majid", "amjad");
    }

    static void fun(int ...nums){ // internally its taking array of int or whatever the type is.
        System.out.println(Arrays.toString(nums));
    }

    static void multiple(int a, int b, String ...vals){
        System.out.println(a + b);
        System.out.println(Arrays.toString(vals));
    }
}
