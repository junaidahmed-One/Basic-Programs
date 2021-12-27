import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPowerOfTwo(num);
    }

    private static void isPowerOfTwo(int num) {
        int cnt = 0;

        while(num > 0){
            cnt++;
            num = num & (num - 1);
        }

        if(cnt==1){
            System.out.println("It is Power of 2");
        }else{
            System.out.println("Not power of 2");
        }
    }

}
