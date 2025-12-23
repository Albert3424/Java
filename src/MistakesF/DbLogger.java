package MistakesF;

public class DbLogger implements Logger
{
    @Override
    public void log(String msg)
    {
        System.out.println("DB: " + msg);
    }
}
