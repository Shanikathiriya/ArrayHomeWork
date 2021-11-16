import java.util.Scanner;

public class SumOfArray
{
    public static void sum()
    {
        int sum=0;
        int [] arr1=new int[5];
        Scanner data=new Scanner(System.in);
        for(int i=0;i< arr1.length;i++)
        {
            System.out.print("Enter the value of Array"+arr1[i]+":=");
            arr1[i]= data.nextInt();

            sum=sum+arr1[i];
        }
        System.out.println("Sum of array is:="+sum);
    }
    public static void main(String [] args)
    {
        sum();
    }
}
