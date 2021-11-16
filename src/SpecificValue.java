import java.util.Scanner;

public class SpecificValue
{
    public static void main(String [] args)
    {

         int [] arr1=new int[5];
        Scanner data=new Scanner(System.in);

        for(int i=0;i< arr1.length;i++)

        {
            System.out.print("Enter the Elements of :-");
            arr1[i]= data.nextInt();
        }
        System.out.println("Enter The Specific value:-");
        int value= data.nextInt();
        for(int i=0;i< args.length;i++)
        {
            if(arr1[i]==value)
            {
                System.out.println("Array Contain Specific value");
            }
            else
            {
                System.out.println("Array not contain any Specific Value");
            }

        }

    }
}
