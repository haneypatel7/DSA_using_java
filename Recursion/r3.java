import java.util.Scanner;
public class r3 {
    

    public static int fibonacci(int a)
    {
        if(a<1)
        {
            return a;
        }
        else
        {   
            System.out.println(a);
            return a+(fibonacci(a-1));

        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter N:");

        n=sc.nextInt();

        int ans=fibonacci(n);
        System.out.println("ans is:"+ans);

        sc.close();

    }
}
