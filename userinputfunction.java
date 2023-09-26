import java.util.Scanner;

class userinputfunction {
    
    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number 1");
        int a=sc.nextInt();
        System.out.println("enter the number 2");
        int b=sc.nextInt();
        int c=sum(a,b);
        System.out.println("your sum is"+ c);
        
        
    }
}