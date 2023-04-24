package homework.thirdHW;

import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        makeMeList(list,10);
        count(list);
    }
    public static void makeMeList(List<Integer> arr, int len){
        Random rnd = new Random();
        for (int i = 0; i < len; i++) {
            arr.add(rnd.nextInt(1, 11));
        }
        System.out.println(arr);
    }
    public static void count(List<Integer> arr){
        System.out.println("Максимальное значение в списке " + Collections.max(arr));
        System.out.println("Минимальное значение в списке " + Collections.min(arr));
        double res = 0;
        for (Integer integer : arr) {
            res += integer;
        }
        res = res/arr.size();
        System.out.println("Среднее арифметическое " + res);
    }
}
