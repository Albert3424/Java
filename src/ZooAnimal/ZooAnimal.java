package ZooAnimal;

public abstract class ZooAnimal
{
    String name;

    public ZooAnimal(String name)
    {
        this.name = name;
    }

    abstract void makeSound();
}
