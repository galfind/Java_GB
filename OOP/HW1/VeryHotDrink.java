package homework.OOP.HW1;

public class VeryHotDrink extends Drink{
    protected int temperature;

    public VeryHotDrink(String name, int volume,int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "VeryHotDrink{" +
                "temperature=" + temperature +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }

}
