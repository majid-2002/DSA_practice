public class FuncOverloading {


    public static void main(String[] args) {
        fun(3);
        fun("majid");
        sum(1, 4);
        sum( 1.0f, 2.0f);
    }
    static void sum(int a , int b){
        System.out.println(a + b);
    }

    static void sum(float a , float b){
        System.out.println(a + b);
    }

    static void sum(int a, int b, int c){
        System.out.println(a + b + c);
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }

}
