public class Animal
{
    String name;

    public Animal(String name)
    {
        this.name = name;
    }

    public void sound()
    {
        System.out.println("Животное издаёт звук");
    }

    public void info()
    {
        System.out.println("Имя: " + name);
    }
}
