package homework.ForthHW;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        getRandom(list,num);
        System.out.println(list);
        rotate(list);
        System.out.println(list);
    }
    public static void getRandom(LinkedList<Integer> l, int n){
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            l.add(rnd.nextInt(1,20));
        }
    }
    public static void rotate(LinkedList<Integer> l){
        int c = l.size();
        for (int i = 0; i < c; i++) {
            l.add(i, l.getLast());
            l.removeLast();
        }
    }
}
