import java.util.Scanner;
//using array
public class queue1
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
       
        for(int j=0;j<=rear;j++)
        {
            System.out.println("value is"+q[j]);
        }
    }
        
        public static void main(String[] args)
        {   

            int d,l;
            Scanner sc =new Scanner(System.in);
            queue1 q=new queue1();

            do{


                System.out.println("1 to enqueue data");
                System.out.println("2 to dequeue data");
                System.out.println("3 to display data");
                d=sc.nextInt();

                switch(d)
                {
                        case 1:
                            {
                            q.enqueue();
                            }

                            case 2:
                                {
                            q.dequeue();
                                }

                            case 3:
                                {
                            q.display();
                                }

                }
                System.out.println("0 press to back menu");
                System.out.println("press any key to exit menu");
                l=sc.nextInt();

            }while(l==0);
           
            
        }
    
}
