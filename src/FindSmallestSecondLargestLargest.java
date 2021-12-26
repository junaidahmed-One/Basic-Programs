import java.util.Scanner;

public class FindSmallestSecondLargestLargest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 300;
        int b = 32;
        int c = 10;

        getSmallestSecondLargestLargest(a,b,c);
    }

    private static void getSmallestSecondLargestLargest(int a, int b, int c) {
        int small,secLargest, largest;

        largest = a;

        if(b>largest){
            largest = b;
        }
        if(c>largest){
            largest = c;
        }

        small = a;
        if(b<small){
            small = b;
        }
        if(c<small){
            small = c;
        }

        secLargest = (a+b+c)-(largest+small);

        System.out.println("Smallest:"+small);
        System.out.println("Second Largest:"+secLargest);
        System.out.println("Largest:"+largest);
    }
}
