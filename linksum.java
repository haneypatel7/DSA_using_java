import java.util.Scanner;
public class linksum{
public static int sum(int a,int b)
{
    int c=a+b;
    return c;
}
public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number a");
        int a=sc.nextInt();
         System.out.println("enter the number b");
        int b=sc.nextInt();
        int sum=sum(a,b);
        System.out.println(sum);
    }
    
}
