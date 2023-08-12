public class Main {

    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {79, 99, 34, 54},
                {12, 18},
        };

        int target = 34;

        System.out.println(search(arr, target));
    }

    static boolean search(int[][] arr, int target){
        for(int[] row : arr){
            for(int num : row){
                if(num == target) return true;
            }
        }

        return false;
    }
}
