import java.util.Scanner;

public class UpperOrLower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char alphabet = scan.next().charAt(0);

        isUpperOrLower(alphabet);

    }

    private static void isUpperOrLower(char alphabet) {
        if(alphabet>='A' && alphabet<='Z'){
            System.out.println("It is Upper Case");
        }else{
            System.out.println("It is Lower Case");
        }
    }
}
