package homework.ForthHW;
import java.util.LinkedList;

import static homework.ForthHW.ex1.getRandom;

public class ex3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        getRandom(list,6);
        System.out.println(list);
        System.out.println(summ(list));
    }
    public static int summ(LinkedList<Integer> l){
        int res = 0;
        for (int i = 0; i < l.size(); i++) {
            res += l.get(i);
        }
        return res;
    }
}
