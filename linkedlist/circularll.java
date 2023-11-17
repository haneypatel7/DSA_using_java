
import java.util.Scanner;
public class circularll {

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

        public void insertfirst(Scanner sc)
        {
            System.out.println("Enter data");
            int a=sc.nextInt();
            node newnode=new node(a);

            if(head==null)
            {
                head=newnode;
                tail=newnode;
                System.out.println("data inserted successfully");
                return;

            }
            else
            {
                newnode.next=head;
                head=newnode;
                tail.next=head;
                System.out.println("data inserted successfully");


            }
        }

        public void insertlast(Scanner sc)
        {
            System.out.println("Enter data");
            int a=sc.nextInt();
            node newnode=new node(a);

            if(head==null)
            {
                head=newnode;
                tail=newnode;
                System.out.println("data inserted successfully");
                return;

            }
            else
            {
                tail.next=newnode;
                tail=newnode;
                newnode.next=head;
                
            }
        }


        public void display()
        {
            node temp=head;
            if(head==null)
            {
                System.out.println("list is empty");
            }
            else
            {
                
                do
                {
                    System.out.println("value is:"+temp.data);
                    temp=temp.next;
                }while(temp!=head);

            }
        }

        public void deletefirst()
        {

            if(head==null)
            {
                System.out.println("list is empty");
            }
            else
            {
                head=head.next;
                System.out.println("First element deleted");
            }
        }
        

        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            circularll cll=new circularll();
            int ch;
            int n;

            do{
            System.out.println("press 1 to insert data first position");
            System.out.println("press 2 to insert data last position");
            System.out.println("press 3 to display data");
            System.out.println("press 4 to delete last element");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                {
                    cll.insertfirst(sc);
                    break;
                }

                case 2:
                {
                    cll.insertlast(sc);
                    break;
                }

                case 3:
                {
                    cll.display();
                    break;
                }

                case 4:
                {
                    cll.deletefirst();
                    break;
                }

                default:
                {
                    System.out.println("invalid chice");
                    break;
                }
            }

            System.out.println("Press zero(0) to continue program");
            System.out.println("press any key to exit program");
            n=sc.nextInt();

                }while(n==0);


        }

    
}
