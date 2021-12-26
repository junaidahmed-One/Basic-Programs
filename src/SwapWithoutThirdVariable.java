import java.util.Scanner;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int second = scan.nextInt();
        System.out.print("First:"+first+" ");
        System.out.println("Second:"+second+" ");
        swap(first,second);

    }

    private static void swap(int first, int second) {
        first = first + second;
        second = first - second;
        first = first - second;
        System.out.print("First:"+first+" ");
        System.out.println("Second:"+second+" ");
    }
}
