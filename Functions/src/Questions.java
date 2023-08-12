import java.util.Scanner;

public class Questions {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        for (int i = 100; i < 10000; i++) {
            if(ArmstrongNum(i))
                System.out.print(i + " " );
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1){
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }

        return c * c > n;
    }

    //print all the 3 digit armmstrong numbers
    static boolean ArmstrongNum(int num){
        int original = num;
        int sum = 0;
        while( num > 0){
            int rem = num % 10;
            sum +=  (rem * rem * rem);
            num /= 10;
        }
        return original == sum;
    }

}

