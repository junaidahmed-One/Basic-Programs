import java.util.Scanner;

public class SumOfAllRowsAndColumns {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int col = scan.nextInt();

        int[][] matrix = new int[rows][col];

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] = scan.nextInt();
            }
        }

        //to get sum of rows
        for(int i=0;i<rows;i++){
            int rowSum = 0;
            for(int j=0;j<col;j++){
                rowSum+=matrix[i][j];
            }
            System.out.println("Sum of row "+(i+1)+" = "+rowSum);
        }

        //to get sum of columns
        for(int i=0;i<col;i++){
            int colSum = 0;
            for(int j=0;j<rows;j++){
                colSum+=matrix[j][i];
            }
            System.out.println("Sum of column "+(i+1)+" = "+colSum);
        }
    }
}
