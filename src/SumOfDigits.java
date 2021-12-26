import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int ans = getSumOfNum(num);
        System.out.println("Sum of Digit:"+ans);
    }

    private static int getSumOfNum(int num) {
        int ans = 0;
        int temp = num;
        while(temp!=0){
            int lastDigit = temp % 10;
            ans+=lastDigit;
            temp = temp / 10;
        }
        return ans;
    }
}
