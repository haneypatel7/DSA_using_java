import java.util.*;
class stack
{
    int n=10;
    int top=-1;
    int []a=new int[n];
    int i;
    
    void push()
    {
         if(top==(n-9))
         {
             System.out.println("Stack is overflow");
         }
         else
         {   
             System.out.println("enter the data");
             int i=sc.nextInt();
             top=top+1;
             a[top]=i;
         }
    }
    
    void pop()
    {
        if(top==-1)
        {
            System.out.println("stack is underflow/empty");
        }
        else
        {
            top=top-1;
            System.out.println("item deleted");
        }
    }
}
class stack_array
{
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        stack s=new stack();
        s.push();
    }
}