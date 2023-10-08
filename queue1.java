import java.util.Scanner;
//using array
public class queue
{   
    int front=-1;
    int rear=-1;
    int n=10;
    int q[]=new int[n];
    
    void enqueue()
    {   
        
        if(rear==(n-1))
        {
            System.out.println("queue is full");
        }
        else
        {
            Scanner sc =new Scanner(System.in);
            System.out.println("enter the data");
            int i=sc.nextInt();
            if(front==-1 && rear==-1)
            {
                front=0;
                rear=0;
                q[rear]=i;
                System.out.println("data inserted");
            }
            else
            {
                rear++;
                q[rear]=i;
                System.out.println("data inserted");
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
            front++;
            System.out.println("element one is deleted");
            
        }
    }
    void display()
    {   
       
        for(int j=front;j<=rear;j++)
        {
            System.out.println("value is"+q[j]);
        }
    }
        
        public static void main(String[] args)
        {   
            Scanner sc =new Scanner(System.in);
            queue q=new queue();
     
            q.enqueue();
            q.enqueue();
            q.enqueue();
            
            q.display();
            q.dequeue();
            q.display();
            
        }
    
}
