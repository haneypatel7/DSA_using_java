import java.util.*;

class queue
{
    int n=5;
int q[]=new int[n];
int f=-1;
int r=-1;

void enqueue()
{


    if(r==(n-1))
    {   
        Scanner sc =new Scanner(System.in);
        System.out.println("queue is full");
    }
    else
    {   
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the data");
        int i=sc.nextInt();
        
        if(f==-1 && r==-1)
        {   
            
            f=0;
            r=0;
            q[r]=i;
            System.out.println("element inserted");
        }
        else
        {
            
            r++;
            q[r]=i;
            System.out.println("element inserted");
        }
    }
}

    void dequeue()
    {
        if(f==-1 && r==-1)
        {
            System.out.println("Stack is empty");
        }
        else{
            f--;
            System.out.println("element removed");
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        queue q=new queue();

        
        q.enqueue();
    }
}

