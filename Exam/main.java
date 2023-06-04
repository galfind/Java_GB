package homework.Exam;

import java.util.LinkedList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        NoteBook nt1 = new NoteBook(4,512,"Mac","Red");
        NoteBook nt2 = new NoteBook(4,100,"Windows","Blue");
        LinkedList<Object> List = new LinkedList<>();
        List.add(nt1);
        List.add(nt2);
        Menu(List);
    }
    public static LinkedList Menu(LinkedList ls){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag)
        {
            System.out.println("""
                    Что бы вы хотели сделать?
                    1 - добавить новый ноутбук
                    2 - показать все
                    3 - сортировать
                    4 - закончить
                    """);
            int var = sc.nextInt();
            if (var == 1) {
                ls.add(variant.MakeNew());
            }
            if (var == 2) {
                ls.forEach(System.out::println);
                NoteBook res = (NoteBook) ls.get(1);

            }
            if(var == 3){
                variant.Sort(ls);
            }
            if (var == 4) {
                System.out.println("До свидания!");
                flag = false;
            }
        }
        return ls;
    }
}
