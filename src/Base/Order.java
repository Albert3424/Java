package Base;

public class Order
{
    String product;
    String category;
    double price;

    public Order(String product, String category, double price) {
        this.product = product;
        this.category = category;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}
