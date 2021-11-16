import java.util.Scanner;

public class ReverseArray
{
    public static void reverse()
    {
        int num, len, i;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        num = s.nextInt();

        len = String.valueOf(num).length();
        int[] arr = new int[len];
        for(i=0; i<len; i++)
        {
            arr[i] = num%10;
            num = num/10;
        }

        System.out.print("\nReverse = ");
        for(i=0; i<len; i++)
            System.out.print(arr[i]);
    }
    public static void main(String []args)
    {
        System.out.println("-------Reverse Number------");
        reverse();


    }
}
