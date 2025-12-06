public class Thermometer
{
    private double temperature;

    public void setTemperature(double temperature)
    {
        if(temperature < -50 || temperature > 50)
            System.out.println("Температура вне допустимого диапазона");
        else
            this.temperature = temperature;
    }

    public double getTemperature()
    {
        return temperature;
    }
}
