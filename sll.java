import java.util.Scanner;
public class sll {

   public static class node
    {
        int rollno,marks;
        String name;
        node next;
        node(int rollno,String name,int marks)
        {
            this.rollno=rollno;
            this.name=name;
            this.marks=marks;
            this.next=null;
        }

        
    }
    node head=null;


    public void insertfirst(int rollno,String name,int marks)
    {
            
            node newnode=new node(rollno,name,marks);

            if(head==null)
            {
                head=newnode;
            }
            else
            {
                newnode.next=head;
                head=newnode;
            }
    }


    public void insertlast(int rollno,String name,int marks)
    {
            
            node newnode=new node(rollno,name,marks);

            if(head==null)
            {
                head=newnode;
                return;
            }
            else
            {
                node temp=head;
                while(temp.next!=null)
                {
                    temp=temp.next;
                }
                temp.next=newnode;
                return;

            }
    }

    public void display()
    {
            node temp=head;
            if(head==null)
            {
                System.out.println("student list is empty");
            }
            while(temp!=null)
            {
                System.out.println(+temp.rollno+temp.name+temp.marks);
                temp=temp.next;
            }


    }



    public static void main(String[] args)
    {   
        Scanner sc=new Scanner(System.in);
        sll student=new sll();
        int n,ch;
        
        int rollno,marks;
        String name;
        do{
            System.out.println("press 1 to insert first position");
            System.out.println("press 2 to insert last position");
            System.out.println("press 3 display the data");
            System.out.println("enter the choice");
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                {   
                    
                    System.out.println("enter the rollno");
                    rollno=sc.nextInt();
                    System.out.println("enter name");
                    name=sc.next();
                    System.out.println("enter the marks");
                    marks=sc.nextInt();
                    student.insertfirst(rollno, name, marks); 
                    System.out.println("data inserted al first possion");
                    break;

                }

                case 2:
                {
                    System.out.println("enter the rollno");
                    rollno=sc.nextInt();
                    System.out.println("enter name");
                    name=sc.next();
                    System.out.println("enter the marks");
                    marks=sc.nextInt();
                    student.insertlast(rollno, name, marks);
                    System.out.println("data inserted al last possion");
                    break;


                }
                case 3:
                {
                    student.display();
                    break;
                }
                default:
                {
                    System.out.println("invalid choice");
                }
                    
            }

          
            
           System.out.println("press 0 to continue the code"); 
           n=sc.nextInt();
        }while(n==0);
    }
    
}
