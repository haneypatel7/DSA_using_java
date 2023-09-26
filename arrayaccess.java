import java.util.Scanner;

class arrayaccess
{
    public static void main(String[] args)
    {
        int [] marks=new int[5];
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the element five(05) in array");

        for(int i=0;i<=4;i++)
        {
            marks[i]=sc.nextInt();
            
        }

        for(int i=0;i<=4;i++)
        {
            System.out.println(marks[i]);
        }



    }


}
