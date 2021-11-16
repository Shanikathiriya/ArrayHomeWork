import java.util.Scanner;

public class SortArray
{
    public static void sorting()
    {
        int[] arr=new int[5];
        Scanner data=new Scanner(System.in);

        for(int i=0;i<5;i++)
        {
            System.out.print("Enter the Array Element of "+i +":-");

            arr[i]=data.nextInt();
        }
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                while (arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();

        for (int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]+"");
        }
    }
    public static void main(String [] args)
    {
        System.out.println("SORTING ARRAY IN ASCENDING");
        sorting();

    }
}
