import java.util.*;
class sort{
    
    public static void main(String[] args)
    {
    int a[]={7,4,6,3,5,2};
    
    for(int i=0;i<a.length-1;i++) //outer loop
    {
        for(int j=0;j<a.length-i-1;j++) //inner loop
        {
            if(a[j]>a[j+1])
            {   
                
                //swap the value
                int temp;
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
        
    }
    for(int p=0;p<a.length-1;p++)
    {
        System.out.println(a[p]);
    }
    }
}