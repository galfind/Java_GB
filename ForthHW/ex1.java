package homework.ForthHW;

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        getRandom(list,num);
        System.out.println(list);
        LinkedList<Integer> list1 = gigaRotate(list);
        System.out.println(list1);
    }
    public static void getRandom(LinkedList<Integer> l, int n){
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            l.add(rnd.nextInt(1,20));
        }
    }
    public static LinkedList<Integer> gigaRotate(LinkedList<Integer> l) {
        LinkedList<Integer> list = new LinkedList<>();
        ListIterator<Integer> iterator = l.listIterator(l.size());
        while(iterator.hasPrevious()){
            list.add(iterator.previous());
        }
        return list;
    }
}
