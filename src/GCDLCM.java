import java.util.Scanner;

public class GCDLCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int gcd = getGCD(a,b);
        int lcm = getLCM(a,b);

        System.out.println("GCD : "+gcd);
        System.out.println("LCM : "+lcm);
    }

    private static int getLCM(int a, int b) {
        int gcd = getGCD(a,b);
        return (a*b)/gcd;
    }

    private static int getGCD(int a, int b) {
        if(a==0)
            return b;
        return getGCD(b%a,a);
    }
}
