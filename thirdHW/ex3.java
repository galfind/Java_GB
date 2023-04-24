package homework.thirdHW;

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        String a = "Венера,Марс,Земля,Плутон,Земля,Марс,Юпитер,Меркурий,Венера,Нептун,Меркурий,Уран,Уран,Земля";
        List<String> list = new ArrayList<>(makeMeString(a));
        Set<String> set = new HashSet<>(makeMeString(a));
        List<String> list1 = new ArrayList<>(set);
        System.out.println(list);
        count(list,list1);
    }
    public static List<String> makeMeString(String arr){
        return List.of(arr.split(","));
    }
    public static void count(List<String> li, List<String> li1){
        int counter = 0;
        for (int i = 0; i < li1.size(); i++) {
            for (int j = 0; j < li.size(); j++) {
                if (li1.get(i).equals(li.get(j))) {
                    counter++;
                }
            }
            System.out.println(li1.get(i) + " " + counter);
            counter = 0;
        }
    }
}
