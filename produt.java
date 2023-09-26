import java.util.Scanner;

public class produt
{
    
    public static int product(int a,int b)
    {
        int product=a*b;
        return product;
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int answer=product(a,b);
        System.out.println(answer);
    } 
        
    }