public class Main
{
    public static void main(String[] args)
    {
        Animal[] animal =
        {
                new Animal("animal"),
                new Cat("cat"),
                new Dog("dog")
        };

        for (Animal animal1 : animal)
        {
            animal1.info();
            animal1.sound();
        }
    }
}