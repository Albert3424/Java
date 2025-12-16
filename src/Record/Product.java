package Record;

public record Product(String name, double price)
{
    public Product(String name, double price)
    {
        if(name == null || price < 0)
            throw new IllegalArgumentException("Имя пустое или цена отрицательная");

        this.name = name;
        this.price = price;
    }
}
