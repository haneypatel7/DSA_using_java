import java.util.Scanner;
class Stack {
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
class temp
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Stack s=new Stack();
        s.push();
        s.display();
        s.push();
        s.display();
    }
}