import java.util.Scanner;

public class Main {

    public static void LargestAmongThree(int a, int b, int c){
        int max = Math.max(a, Math.max(b, c));
        System.out.println(max);
    }
    public static void SmallestAmongThree(int a, int b, int c){
        int min = 0;
        min = Math.min(a, Math.min(b, c ));
        System.out.println(min);
    }

    static int Factorial(int num){
        if(num == 0 || num == 1) return 1;
        int product = 1;
        while (num > 0){
            product *= num;
            num--;
        }
        return product;
    }

    static String OddorEven(int num){
        if(num % 2 == 1)
            return "Odd";
        else
            return "Even";
    }

    static String isAbleToVote(int age){
        if(age >= 18)
                return "Yes";
        else
                return "No";
    }

    static String MarksToGrade(){
        System.out.println("Enter your Marks");
        Scanner in = new Scanner(System.in);
        int marks = in.nextInt();
        if(marks >= 91 && marks <= 100){
            return "AA";
        }else if(marks >= 81 && marks <= 90){
            return "AB";
        }else if(marks >= 71 && marks <= 80){
            return "BB";
        }else if(marks >= 61 && marks <= 70){
            return "BC";
        }else if(marks >= 51 && marks <= 60){
            return "CD";
        }else if(marks >= 41 && marks <= 50){
            return "DD";
        }else{
            return "Fail";
        }
    }

    static boolean isPalindrome(int num){
        int rev = 0;
        int original = num;
        while(num > 0){
            int rem = num % 10;
            rev *= 10;
            rev += rem;
            num /= 10;
        }
        return original == rev;
    }


    static boolean isPythaGoreanTriplet(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Three numbers : ");
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        return ((a * a) + (b * b)) == (c * c);
    }

    static void primeBetweenTwoNums(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter tow nums : ");
        int a , b, flag;
        a = in.nextInt();
        b = in.nextInt();
        for (int i = a; i < b; i++){
            if(i == 1 || i == 0)
                    continue;
            flag = 1;
            for (int j = 2; j <= i / 2; j++) {
                if(i % j == 0){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1)
                System.out.println(i);

        }
    }

    static void SumOfFirstNNaturalNums(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("the sum is : " + sum);
    }

    public static void main(String[] args) {
        SumOfFirstNNaturalNums(3);
    }

}
