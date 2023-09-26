import java.util.Scanner;
class factusefun
{
    public static int factorial(int a)
    {   
        int fact=1;
        for(int i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number you want to return factorial");
        int a=sc.nextInt();
        int c=factorial(a);
        System.out.println(c);
    }
    
    
    
}