import java.util.Scanner;

class linkedlist
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
            Scanner sc=new Scanner(System.in);
            int data,n;
            
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
            
        }
        
        public void display()
        {
            node temp=head;
            if(head==null)
            {
                System.out.println("not exist");
            }
            else
            {
                while(temp!=null)
                {
                    System.out.println(temp.data);
                    temp=temp.next;
                }
            }
            
        }
        
        
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            linkedlist ll=new linkedlist();
            int n,ch;
            do
            {   
                System.out.println("enter the choice");
                System.out.println("Press 1 to enter data");
                System.out.println("press 2 to display data");
                
                
                ch=sc.nextInt();
                switch(ch)
                {
                    case 1:
                        {
                            ll.creation();
                            break;
                        }
                    case 2:
                        {
                            ll.display();
                            break;
                        }    
                    
                }
                System.out.println("press 0 to exit the program");
                System.out.println("press 1 to continue the program");
                
                n=sc.nextInt();
            }while(n==1);
        }
        
        
        
        
    }