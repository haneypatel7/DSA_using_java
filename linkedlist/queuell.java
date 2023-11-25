import java.util.Scanner;
public class queuell {
    
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

    node front=null;
    node rear=null;

   public void enqueue(Scanner sc)
    {

        System.out.println("enter the data");
        int data=sc.nextInt();
        node newnode=new node(data);
        if(front==null)
        {
            front=newnode;
            rear=newnode;
            System.out.println("data inserted");
        }
        else
        {
            rear.next=newnode;
            rear=newnode;
            System.out.println("data inserted");
        }
    }


    public void dequeue()
    {
        if(front==null)
        {
            System.out.println("queue is empty");
        }
        else
        {
            front=front.next;
            System.out.println("one data has been deleted");
        }
    }

    public void display()
    {
        if(front==null)
        {
            System.out.println("queue is empty");
        }

        else
        {
            node temp=front;
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        queuell qll=new queuell();
        
        int n,ch;

        do{ 
            System.out.println("press 1 to enqueue data");
            System.out.println("press 2 to dequeue data");
            System.out.println("press 3 to display data");
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                    qll.enqueue(sc);
                    break;
                case 2:
                    qll.dequeue();
                    break;
                case 3:
                    qll.display();
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            
            
                }

                System.out.println("press 0 to continue the program");
                n=sc.nextInt();
        }while(n==0);

    }
}
