import java.util.Scanner;
public class r2 {


    public int sum(int a)
    {
        if(a<=0)
        {
            return 0;
        }
        else
        {
            return a+sum(a-1);
        }
    }
    public static void main(String[] args)
    {
            r2 recursion=new r2();
            Scanner sc=new Scanner(System.in);
            int n;
            System.out.println("enter the value range of sum");
            n=sc.nextInt();

            int ans=recursion.sum(n);

            System.out.println("value of enter number sum is:"+ans);

    }
    
                }
