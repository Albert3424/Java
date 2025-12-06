public class Boat extends Transport
{
    public Boat(String model)
    {
        super(model);
    }

    @Override
    public void move()
    {
        System.out.println(model + ": Лодка плывёт");
    }
}
