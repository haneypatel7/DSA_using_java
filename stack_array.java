import java.util.Scanner;
//static stack
class stack {
    int n=5;
    int []a=new int[5];
    int top=-1;
    void push()
    {
        if(top==(n-1))
        {
            System.out.println("stack is overflow");
        }
        else
        {
            System.out.println("enter the element");
            Scanner sc=new Scanner(System.in);
            int i=sc.nextInt();
            top=top+1;
            a[top]=i;
            System.out.println("item inserted");           
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("stack is empty");
        }
        else
        {
            top=top-1;
            System.out.println("item deleted");
        }
    }
    void display()
    {
        for(int j=top;j>=0;j--)
        {
            System.out.println(""+a[j]); 
        }
    }  
}
class stack_array
{
    public static void main (String[] args)
    {   

        Scanner sc=new Scanner(System.in);
        int d,l;
        stack s=new stack();
        // s.push();
        // s.display();
        // s.push();
        // s.display();
        do{

                System.out.println("1 to push element");
                System.out.println("2 to pop element");
                System.out.println("3 to display element");
                d=sc.nextInt();
                switch(d)
                {
                    case 1:
                        {
                            s.push();
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


                }
                System.out.println("0 press to back menu");
                System.out.println("enter any key to exit the menu");
                l=sc.nextInt();


        }while(l==0);

    }
}