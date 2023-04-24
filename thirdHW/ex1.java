package homework.thirdHW;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ex1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        makeMeList(list,10);
        findDividors(list);
    }
    public static void makeMeList(List<Integer> arr, int len){
        Random rnd = new Random();
        for (int i = 0; i < len; i++) {
            arr.add(rnd.nextInt(1, 11));
        }
        System.out.println(arr);
    }
    public static void findDividors(List<Integer> arr){
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i)%2==0){
                arr.remove(i);
                i--;
            }
        }
        System.out.println(arr);
    }
}
//List<Integer>