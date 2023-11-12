package linkedlist;
import java.util.Scanner;

class linkedlist_serchbyname
    {

        static class node
        {
            int rollno;
            String name;
            node next;

            node(int rollno,String name)
            {
                this.rollno=rollno;
                this.name=name;
                this.next=null;
            }
        }
        node head=null;


        public void insertfirst()
            {   

                Scanner sc =new Scanner(System.in);
                System.out.println("enter the rollno:");
                int rollno=sc.nextInt();
                System.out.println("enter the student name");
                String name=sc.next();
                node newnode=new node(rollno,name);

                if(head==null)
                {
                    head=newnode;
                    System.out.println("data inserted at first...");
                }
                else{
                    newnode.next=head;
                    head=newnode;
                    System.out.println("data inserted at first...");

                }
            }


            public void insertlast()
            {
                node temp=head;
                Scanner sc =new Scanner(System.in);
                System.out.println("enter the rollno:");
                int rollno=sc.nextInt();
                System.out.println("enter the student name");
                String name=sc.next();
                node newnode=new node(rollno,name);

                if(head==null)
                {
                    head=newnode;
                    System.out.println("data inserted...");
                }
                else
                {

                while (temp.next!=null) 
                {
                    temp=temp.next;    
                }
                    temp.next=newnode;

                }

            }



            public void display()
            {
                node temp=head;
                if(head==null)
                {
                    System.out.println("Student list is empty");
                }
                else
                {
                    while(temp!=null)
                    {
                        System.out.println("Student rollno is:"+temp.rollno+" Student name is:"+temp.name);
                        temp=temp.next;
                    }
                }
            }

            public void delete()
            {
                if(head==null)
                {
                    System.out.println("student list is empty");
                }
                else
                {
                    head=head.next;
                    System.out.println("one student record deleted");
                }
            }



            public void displaybyname()
            {
                Scanner sc=new Scanner(System.in);
                node temp=head;
                


                if(head==null)
                {
                    System.out.println("student list is empty");
                }
                else

                {
                    System.out.println("enter name to search");
                    String name=sc.next();
                    do
                    {   
                        System.out.println("Student rollno is:"+temp.rollno);
                        System.out.println("Student name is:"+temp.name);
                        temp=temp.next;
                        break;
                    }while(name==temp.name);
                }

                

            }


        public static void main(String[] args)
            {
                Scanner sc=new Scanner(System.in);
                linkedlist_serchbyname sll=new linkedlist_serchbyname();
                int ch,n;

                    do{
                System.out.println("enter the choice");
                System.out.println("press 1.insert data on first position");
                System.out.println("press 2.insert data on last position");
                System.out.println("press 3.to display student list");
                System.out.println("press 4.to delete student reacord");
                System.err.println("press 5.to search student by name");
                ch=sc.nextInt();
                switch(ch)
                {
                    case 1:
                    {
                    sll.insertfirst();
                    break;
                    }

                    case 2:
                    {
                    sll.insertlast();
                    break;
                    }

                    case 3:
                    {
                    sll.display();
                    break;
                    }

                    case 4:
                    {
                        sll.delete();
                        break;
                    }

                    case 5:
                    {
                        sll.displaybyname();
                        break;
                    }
                    default:
                    {
                        System.out.println("invalid choice");
                    }
                }
                    
                System.out.println("enter zero(0) to exit program task");
                System.out.println("press 1 to continue the program");
                n=sc.nextInt();
                        }while(n!=0);


            }


    }