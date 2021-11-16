import java.util.Scanner;

public class TransposeMatrix
{
    public static void main(String[] args)
    {
        int i, j;
        int[][] matrix = new int[3][3];
        int[][] matTran = new int[3][3];
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 9 Elements of the Matrix: ");
        for(i=0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                matrix[i][j] = scan.nextInt();
            }
        }

        System.out.println("\n----Original Matrix----");
        for(i=0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                System.out.print(matrix[i][j]+ "\t");
            }
            System.out.print("\n");
        }

        // copying the transpose of matrix to matTran
        for(i=0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                matTran[j][i] = matrix[i][j];
            }
        }

        System.out.println("\n----Transpose of Matrix----");
        for(i=0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                System.out.print(matTran[i][j]+ "\t");
            }
            System.out.print("\n");
        }
    }
}
