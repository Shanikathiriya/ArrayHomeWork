import java.util.Arrays;
import java.util.Scanner;

public class EqualityOfArray
{
    public static void checkEqual()
    {

       int[] arr1 =new int[3];
        Scanner data=new Scanner(System.in);
        for(int i=0;i< arr1.length;i++)
        {
            System.out.print("Enter the Array 1 Element of "+i +":-");

            arr1[i]=data.nextInt();
        }
       int[] arr2 =new int[3];

        for(int i=0;i< arr2.length;i++)
        {
            System.out.print("Enter the Array 2 Element of "+i +":-");

            arr2[i]=data.nextInt();
        }
        boolean flag=true;

       if(arr1.length==arr2.length)
       {

           while (Arrays.equals(arr1, arr2))
           {
               System.out.println("BOTH ARRAY EQUAL");
               flag=false;
               break;
           }
           if(flag==true)
           {
               System.out.println("Not equal");
           }
       }
       else
       {
           System.out.println("Array are not equAL");
       }




    }
    public static void main(String [] args)
    {
       // System.out.println("---ARRAY EQUAL OR NOT----");
        checkEqual();

    }
}
