import java.util.Scanner;
//static stack
class stack {
    int n=5;
    int []a=new int[5];
    int top=-1;
    void push()
    {
        if(top==(n-1))
        {
            System.out.println("stack is overflow");
        }
        else
        {
            System.out.println("enter the element");
            Scanner sc=new Scanner(System.in);
            int i=sc.nextInt();
            top=top+1;
            a[top]=i;
            System.out.println("item inserted");           
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("stack is empty");
        }
        else
        {
            top=top-1;
            System.out.println("item deleted");
        }
    }
    void display()
    {
        for(int j=top;j>=0;j--)
        {
            System.out.println(""+a[j]); 
        }
    }  
}
class stack_array
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        stack s=new stack();
        s.push();
        s.display();
        s.push();
        s.display();
    }
}