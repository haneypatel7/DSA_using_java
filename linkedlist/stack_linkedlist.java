import java.util.Scanner;

class stack_linkedlist
{
    static class node
    {
        int data;
        node next;
        
        node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    node top=null;
    
    public void push(Scanner sc)
    { 
        System.out.println("enter the element");
        int data=sc.nextInt();
        node newnode=new node(data);
        if(top==null)
        {
            top=newnode;
            System.out.println("data inserted");
            
        }
        else
        {
            newnode.next=top;
            top=newnode;
            System.out.println("data inserted");
        }
        
    }
    
    public void pop()
    {
        if(top==null)
        {
            System.out.println("stack is empty");
            
        }
        else
        {
            top=top.next;
            System.out.println("element deleted");
            
        }
        
    }
    
    public void display()
    {
        node temp=top;
        if(top==null)
        {
            System.out.println("stack is empty");
        }
        while (temp.next!=null) {
            System.out.println("element is :"+temp.data);
            temp=temp.next;
        }
    }
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        stack_linkedlist s=new stack_linkedlist();
        int n,ch;
        do
        {
            
            System.out.println("enter the choice");
            System.out.println("press 1 to push the element");
            System.out.println("press 2 to pop the element");
            System.out.println("press 3 to display the element");
            
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    {
                        s.push(sc);
                        break;
                    }
                case 2:
                    {
                        s.pop();
                        break;
                    }
                case 3:
                    {
                        s.display();
                        break;
                    }
                default:
                {
                    System.out.println("invalid chice");
                    break;
                }
            }
            System.out.println("press 0 to continue program");
            System.out.println("press any key to exit the program");
            n=sc.nextInt();
        }while(n==0);
        
    }
}