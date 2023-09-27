import java.util.Scanner;

class prime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int counter=0;
        for(int i=1;i<=a;i++)
        {
            if((a%i)==0)
            {
                counter++;
            }
        }
        if(counter<=2)
        {
            System.out.println("its prime number");
        }
        else
        {
            System.out.println("its not prime number");
        }
    }


}