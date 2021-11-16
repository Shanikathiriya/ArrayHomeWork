import java.util.Scanner;

public class MultiplicationTable
{
    public static void table()// CREATE A METHOD FOR FIND TABLE
    {
        Scanner data = new Scanner(System.in);
        int [][] arr=new int[100][100];
        System.out.println("Enter the value for N:-");//TAKE THE VALUE FROM USER
        int n = data.nextInt();

       for(int i=1;i<n;i++)
        {
            for(int j=1;j<n;j++)

            {
                arr[i][j]=i*j;
                System.out.print(arr[i][j]+"\t");
            }
            System.out.print("\n");

        }
    }
    public static void main(String [] args)// CREATE MAIN METHOD
    {
        System.out.println("-----CREATE MULTIPLICATION TABLE-----");
        table();// CALL THE METHOD
    }
}
