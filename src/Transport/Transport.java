package Transport;

public class Transport
{
    String model;

    public Transport(String model)
    {
        this.model = model;
    }

    public void move()
    {
        System.out.println(model + ": Транспорт движется");
    }
}
