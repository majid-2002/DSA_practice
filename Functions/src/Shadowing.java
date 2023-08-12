public class Shadowing {
    static int a = 20;

    public static void main(String[] args) {
        int a = 203;
        System.out.println(a); // shadowed the line 2 with this
        printNum();
    }

    static void printNum(){
        System.out.println(a);
    }
}
