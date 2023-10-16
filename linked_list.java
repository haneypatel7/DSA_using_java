import java.util.Scanner;

public class linked_list
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
        node head=null;
    
    public void creation()
    {
        int data,n;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("enter the data");
        data=sc.nextInt();
        node new_node=new node(data);
        
                if(head==null)
                {
                    head=new_node;
                }
                else
                {
                    new_node.next=head;
                    head=new_node;
                }
        System.out.println("enter 1 if you add more data");
        n=sc.nextInt();
            } while(n==1);
        
    }
    
        public void display()
        {
            node temp=head;
            if(head==null)
            {
                System.out.println("linked list is not allowed");
            }
            else
            {
                while(temp!=null)
                {   
                    int i=0;
                    System.out.println(+i+temp.data);
                    
                    temp=temp.next;
                    i++;
                }
            }
            
        }
    
    public static void main(String[] args)
    {
        linked_list ll=new linked_list();
        ll.creation();
        ll.display();
    }
    
}