package homework.ForthHW;
import java.util.LinkedList;

import static homework.ForthHW.ex1.getRandom;

public class ex3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        getRandom(list,6);
        System.out.println(list);
        System.out.println(sum(list));
    }
    public static int sum(LinkedList<Integer> l){
        int res = 0;
        for (Integer integer : l) {
            res += integer;
        }
        return res;
    }
}
