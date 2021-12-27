import java.util.Arrays;
import java.util.Scanner;

public class CheckForPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        boolean ans = isPalindrome(str);
        System.out.println(ans);
    }

    private static boolean isPalindrome(String str) {
        char[] charArray = str.toCharArray();

        int start = 0;
        int end = charArray.length-1;
        int flag = 0;
        while(start<end){
            if(charArray[start]==charArray[end]){
                flag = 1;
                start++;
                end--;
            }else{
                break;
            }
        }
        return flag == 1;
    }
}
