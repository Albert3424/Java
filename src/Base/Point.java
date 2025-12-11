package Base;

public class Point
{
    int x, y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void print()
    {
        System.out.println("x =" + x);
        System.out.println("y =" + y);
    }
}