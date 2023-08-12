package assignments;

public class Leap {

    public static boolean IsLeapYear(int year){
        if(year % 4 == 0)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
        System.out.println(IsLeapYear(1992));
    }
}
