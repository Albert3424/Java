package ZooAnimal;

public class Monkey extends ZooAnimal
{
    public Monkey(String name)
    {
        super(name);
    }

    public void makeSound()
    {
        System.out.println(name + ": Ууу-ааа!");
    }
}
