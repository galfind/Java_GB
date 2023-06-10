package homework.OOP.HW1;

public abstract class Drink {
    protected String name;
    protected int volume;

    public Drink(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
