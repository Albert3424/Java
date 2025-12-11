package Shape;

public class ShapeUtils
{
    public void printArea(Circle c)
    {
        System.out.println(c.area());
    }

    public void printArea(Rectangle r)
    {
        System.out.println(r.area());
    }

    public void printArea(Shape s)
    {
        System.out.println(s.area());
    }
}
