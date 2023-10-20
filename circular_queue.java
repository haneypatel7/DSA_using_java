
import java.util.Scanner;
class circular_queue
{
    int n=5;
    int q[]=new int[n];
    int front=-1;
    int rear=-1;
    
    void enqueue()
    {
        if(front==(rear+1)%n)
        {
            System.out.println("queue is full");
        }
        else
        {
            if(front==-1 && rear==-1)
            {   
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the data");
                int i=sc.nextInt();
                front=0;
                rear=0;
                q[rear]=i;
            }
            else
            {
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the data");
                
                int i=sc.nextInt();
                rear=(rear+1)%n;
                q[rear]=i;
            }
        }
    }
    void dequeue()
    {
        
        if(front==-1 && rear==-1)
        {
            System.out.println("queue is empty");
        }
        else
        {
            front=(front+1)%n;
        }
    }
    void display()
    {
        for(int j=front;j<=rear;j++)
        {
           System.out.println(q[j]); 
        }
    }
    public static void main(String[] args)
    {   
        Scanner sc =new Scanner(System.in);
        circular_queue q=new circular_queue();
        q.enqueue();
        q.enqueue();
        q.enqueue();
        q.display();
        q.dequeue();
        q.display();
        
    }
    
}