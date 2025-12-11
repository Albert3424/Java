package Transport;

public class Car extends Transport
{
    public Car(String model)
    {
        super(model);
    }

    @Override
    public void move()
    {
        System.out.println(model + ": Машина едет");
    }
}
