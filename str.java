import java.util.Scanner;
// printing string
class str
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String name=sc.nextLine();

        for(int i=1;i<=name.length();i++)
        {
            System.out.println(name.charAt(i));
        }

    }

}