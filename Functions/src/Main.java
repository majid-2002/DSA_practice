public class Main {
    //scoping
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        {
//            int a = 30; already initialized so it can't be initilized again
            int c = 30;
        }

        int c = 40; // it works because it is not initialized outisde the scope before
        System.out.println(c);
    }
}
