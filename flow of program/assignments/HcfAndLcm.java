package assignments;

public class HcfAndLcm {

    public static void HCF_and_LCM(int a, int b) {
        int hcf = 0;
        int lcm = 0;
        int min = a < b ? a : b;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0)
                hcf = i;
        }
        lcm = (a * b) / hcf;
        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcm);
    }

    public static void main(String[] args) {
        HCF_and_LCM(12, 8);

    }
}
