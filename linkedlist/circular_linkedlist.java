import java.util.Scanner;

public class circular_linkedlist
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
        node tail=null;
        
        public void creation()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the data");
            int data=sc.nextInt();
            node new_node=new node(data);
            
            if(head==null)
            {
                head=new_node;
                tail=new_node;
            }
            
            else
            {
                new_node.next=head;
                head=new_node;
                tail.next=head;
                
                
            }
        }
        
        public void display()
        {   
            node temp=head;
            if(head==null)
            {
                System.out.println("cll is empty");
            }
            else
            {
                do
                {
                    
                    System.out.println(temp.data);
                    temp=temp.next;
                    
                }while(temp!=head);
            }
        }
        
        public static void main(String[] args)
        {
            circular_linkedlist cll=new circular_linkedlist();
            cll.creation();
            cll.creation();
            cll.creation();
            cll.display();
        }
        
    
    
    
    
    
}