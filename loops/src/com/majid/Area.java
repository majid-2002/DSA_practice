package com.majid;

import java.util.Scanner;

public class Area {
    public static float AreaCircle(int r){
        return 3.14f * r * r;
    }

    public static float AreaTriangle(int base, int height){
            return  0.5f * base * height;
    }

    public static int AreaRect(int l , int b){
        return  l * b;
    }

    public static int AreaParallelogram(int base , int height){
        return base * height;
    }


    public static int AreaRhombus(int p , int q){
        return  (p * q) / 2;
    }

    public static double AreaEquilateralTriangle(int a){
        return ((Math.sqrt(3) / 4) * (a * a));
    }

    public static float PerimeterCircle(int r){
        return (float) (2 * 3.14 * r);
    }

    public static int PerimeterEquilateral(int a){
        return 3 * a;
    }
    public static int PerimeterParallelogram(int a , int b){
        return 2 * (a + b);
    }

    public static int PerimeterRect(int length , int width){
        return 2 * (length + width);
    }

    public static int PerimeterSquare(int a){
        return 4 * a;
    }

    public static void FibSeries(int n){
        int a = 0;
        int b = 1;
        int count = 2;
        System.out.print(a + " " + b);
        while(count < n){
            int temp = b;
            b = b + a;
            a = temp;
            System.out.print(" " + b);
            count++;
        }

    }

    public static int subtractProductAndSum(int n) {
            int product = 1;
            int sum = 0;
            while(n > 0){
                int rem = n % 10;
                sum += rem;
                product *= rem;
                n = n / 10;
            }
            return  product - sum;
    }

    public static void PrintFactorsOfNumber(int n){
        for (int i = 1; i <= n ; i++) {
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void SumTillZero(){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.println("Enter a number to add");
            int val = in.nextInt();
            if(val == 0){
                System.out.println("The sum is : " + sum);
                break;
            }
            sum += val;
        }
    }

    public static void LargestTillZero(){
        Scanner in = new Scanner(System.in);
        int maxVal = 0;
        while (true){
            System.out.println("Enter the num : ");
            int num = in.nextInt();
            if(num == 0){
                System.out.println("The max val is : " + maxVal);
                break;
            }
            maxVal = Math.max(maxVal, num);
        }
    }

    public static int DaysCanGoOut(int days){
        int count = 0;
        for (int i = 1; i <= days; i++) {
            if(i % 2 == 0 ){
                 count++;
            }
        }
        return count;
    }




    public static void main(String[] args) {
        System.out.println(DaysCanGoOut(31));
    }
}
