package Exception;

public class BankAccount
{
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) throws InvalidAccountException
    {
        if (owner == null || owner.isEmpty())
            throw new InvalidAccountException("Имя владельца не может быть пустым");

        this.owner = owner;
        this.balance = balance;
    }

    public void withdraw(double amount) throws InvalidAccountException
    {
        if (amount <= 0)
            throw new IllegalArgumentException("Сумма снятия должна быть положительной.");

        if (amount > this.balance)
            throw new InvalidAccountException("Недостаточно средств на счету");

        this.balance -= amount;
    }
}
