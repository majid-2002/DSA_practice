import java.util.Arrays;

public class Main {

    static void change(int[] nums){
        nums[0] = 23;
    }


    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6};
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
}
