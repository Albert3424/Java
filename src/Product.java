public class Product
{
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setPrice(double price)
    {
        if(price < 0)
            System.out.println("Цена не может быть отрицательной");

    }

    public double totalCost()
    {
        return price * quantity;
    }
}
