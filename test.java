
public class test{
    public interface animal1
{
    public void live()
    {
        System.out.println("linved on land");
    }
}

public interface animal2
{
    public void live()
    {
        System.out.println("linved on land");
    }
}

public class animal implements animal1,animal2
{
    public void live()
    {
        animal1.super.live();
    }
}



}
    

