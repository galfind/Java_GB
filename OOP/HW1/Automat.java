package homework.OOP.HW1;

import java.util.LinkedList;
import java.util.Objects;

public class Automat{
    private LinkedList<VeryHotDrink> list = new LinkedList<>();
    public void AddToHash(Drink drink){
        list.add((VeryHotDrink) drink);
    }
    public void Sort(String name, int volume,int temperature){
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            if((Objects.equals(name, list.get(i).getName())) &&(volume == list.get(i).getVolume()) && (temperature == list.get(i).getTemperature())){
                System.out.println(list.get(i));
                counter++;
            }
        }
        if (counter==0) {
            System.out.println("Таких напитков нет");
        }
    }
}
