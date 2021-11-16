import java.util.Scanner;

public class CountStringA
{
    public static void count(String str)  // CREATE METHOD FOR COUNT ALPHABET
    {
        int length=str.length(); // FIND THE LENGTH OF STRING USING LENGTH() METHOD
        int count=0;
        for(int i=0;i<length;i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'|| ch=='A') // COMPARE THE ALPHABET WITH GIVEN VALUE
            {
                count++;

            }
        }
        System.out.println(count+" time a in string"); //PRINT THE COUNT OF A

    }
    public static void main(String [] args)
    {
        Scanner data=new Scanner(System.in);
        System.out.println("Enter The String:-"); //THE STRING FROM USER
        String str= data.nextLine();
        count(str);// CALL THE COUNT METHOD N PASS THE ARGUMENT AS STRING
    }
}
