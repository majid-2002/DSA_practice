import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int [][] arr1 = new int[3][3]; //2 - D Array
        /*
            [
                [1, 2, 3],
                [4, 5, 6],
                [7 ,8, 9],
            ]
         */

        int [][] arr2 = new int[3][];

        /*
            [
               [1, 2, 3],
               [4, 5],
               [6, 7, 8],
            ]

            array rows can be of any size.
         */


        int[][] arr3 = {
                {1, 2, 3},
                {4, 5},
                {7, 8},
        };

        System.out.println(Arrays.toString(arr3[0]));
        System.out.println(arr3.length); // no of rows
        
        int[][] arr4 = new int[3][3];

        for (int row = 0; row < arr4.length; row++) {
            for (int col = 0; col < arr4[row].length; col++) {
                System.out.println("Enter the value at row "+ row + " and col " + col);
                arr4[row][col] = in.nextInt();
            }
        }

//        for (int row = 0; row < arr4.length; row++) {
//            System.out.println(Arrays.toString(arr4[row]));
//        }

        for (int[] row : arr4) {
            System.out.println(Arrays.toString(row));
        }




    }
}
