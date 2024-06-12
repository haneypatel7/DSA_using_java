// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class binarysearch {
    public static void main(String[] args) {
        int[] myarray={1,2,3,4,5,6,7,8};
        
       int index = binarysearch1(myarray, 5);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
        
    }
    
    private static int binarysearch1(int[]number,int key)
        {
            int lower=0;
            int higher=number.length-1;
            
           
            
            while(lower<=higher)
            {
                 int mid=(lower+higher)/2;
                if(number[mid]==key)
                {
                    
                    return mid;
                }
                else
                {
                    if(number[mid]>key)
                    {
                        lower=mid+1;
                    }
                    else if(number[mid]<key)
                    {
                        higher=mid-1;
                    }
                }
            }
            return -1;
            
        }
        
}