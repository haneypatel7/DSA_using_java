import java.util.Scanner;
public class tree_creation {
    
static class node
{
    node left;
    node right;
    int data;

    node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
   
    
}
    static node create(Scanner sc)
    {
        node root=null;
        System.out.println("enter data");
        int data=sc.nextInt();
        if(data==-1)
        return null;
        else
        
            root=new node(data);
            System.out.println("enter left child of " +root.data);
            root.left=create(sc);
            System.out.println("enter right child of " +root.data);
            root.right=create(sc);
            return root;
        
    }

    public void preorder(node root)
    {
        if(root==null)
    {
        return;
    }
    else
    {
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
        
    }
    }

    public static void main(String[] args) {
        tree_creation t=new tree_creation();
        Scanner sc=new Scanner(System.in);
        node root=create(sc);
        t.preorder(root);

    }
}


