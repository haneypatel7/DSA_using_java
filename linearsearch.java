import java.util.Scanner;
class linearsearch
{   

    public static void main(String[] args)
    {
        int [] array=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the five(5) element");
//lll
        for(int i=0;i<=4;i++)
        {
            array[i]=sc.nextInt();
            
        }
        for(int i=0;i<=4;i++)
        {
            System.out.println(i+"element is"+array[i]);
        }
        System.out.println("enter the value for searching in array");
        int key=sc.nextInt();

        for(int i=0;i<=4;i++)
        {
            if(array[i]==key)
            {
                System.out.println("your index is"+i);
            }
        }
//0(n^3)
    }

}