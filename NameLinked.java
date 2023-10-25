import java.util.Scanner;

public class NameLinked {

    static class node
    {
        int number;
        String name;
        node next;

        node(int number,String name)
        {
            this.number=number;
            this.name=name;
            this.next=null;
        }
    }

    node head=null;
        public void creation()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number");
            int number=sc.nextInt();
            System.out.println("enter the name");
            String name=sc.nextLine();
            node Student=new node(number,name);

            if(head==null)
            {
                head=Student;
            }
            else
            {
                Student.next=head;
                head=Student;
            }
        }

        public void display()
        {
            node temp=null;
            if(head==null)
            {
                System.out.println("not exist");
            }
            else
            {
                while(temp!=null)
                {
                    System.out.println(temp.name+temp.number);
                    temp=temp.next;
                }

            }
        }

        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            NameLinked n=new NameLinked();

            n.creation();
            n.display();
        }
        
    
                        }
