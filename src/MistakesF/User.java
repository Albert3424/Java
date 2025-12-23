package MistakesF;

class User
{
    //Поля класса должны быть private
    private String name;
    private int age;

    //Валидация
    public void setAge(int age)
    {
        if (age < 0)
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        this.age = age;
    }
}