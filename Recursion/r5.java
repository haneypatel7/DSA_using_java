class r5
{

    int counter=0;
    public int fibonacci(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        else
        {   
             
            System.out.println(counter);
            return n + fibonacci(n-1);
        }
    }


    public static void main(String[] args) {
        r5 r=new r5();
        int result=r.fibonacci(5);
        System.out.println(result);
    }
}