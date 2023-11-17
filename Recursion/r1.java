import java.util.Scanner;
public class r1 {


    public static int fact(int a)
    {
        if(a<=1)
        {
            return 1;
        }
        else
        {
            return a*fact(a-1);
        }
    }
    public static void main(String[] args)
    {
                Scanner sc =new Scanner(System.in);
                int n,ans;
                System.out.println("enter the number you want to");
                n=sc.nextInt();
                ans=fact(5);
                System.out.println("factorial of given number is:"+ans);
                             


    }
}
