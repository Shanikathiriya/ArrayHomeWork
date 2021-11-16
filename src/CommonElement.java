import java.util.Scanner;

public class CommonElement
{
    public static void common()
    {
        String [] arr1=new String[5];
        String [] arr2=new String[5];

        Scanner data=new Scanner(System.in);

        for(int i=0;i<3;i++)
        {
            System.out.print("Enter the value of array 1 of " + i + ":-");
            arr1[i] = data.nextLine();
        }

        for(int i=0;i<3;i++)
        {
            System.out.print("Enter the value of array 2 of "+ i+":-");
            arr2[i]= data.nextLine();
        }


        for(int i=0;i< arr1.length;i++)
        {
            for (int j=0;j< arr2.length;j++)
            {
                if((arr1[i]).equals(arr2[j]))
                {
                    System.out.println("Element "+(arr1[i])+" AND "+(arr2[j])+" Equal ");
                    break;

                }
            }
        }


    }
    public static void main(String [] args)
    {
        System.out.println("------FIND COMMON ELEMENT--------");
        common();


    }
}
