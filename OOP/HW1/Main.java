package homework.OOP.HW1;
public class Main {
    public static void main(String[] args) {
        Drink hotCoffee = new VeryHotDrink("coffee",500, 500);
        Drink hotCoffee1 = new VeryHotDrink("coffee", 250, 500);
        Drink HotTea = new VeryHotDrink("Tea",500, 500);
        Drink HotTea1 = new VeryHotDrink("Tea",250, 500);
        Automat at = new Automat();
        at.AddToHash(hotCoffee);
        at.AddToHash(hotCoffee1);
        at.AddToHash(HotTea);
        at.AddToHash(HotTea1);
        at.Sort("Tea",500, 500);
        at.Sort("Milk",500, 500);
    }

}
