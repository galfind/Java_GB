package homework.Exam;

import java.util.LinkedList;
import java.util.Scanner;

public class variant {

    public static class scan {
        public static Scanner sc = new Scanner(System.in);
    }
    public static NoteBook MakeNew(){
        System.out.println("Введите размер оперативной памяти");
        int RAM = scan.sc.nextInt();
        System.out.println("Введите размер долговременной памяти");
        int memory = scan.sc.nextInt();
        System.out.println("Введите название операционной системы");
        String OS = scan.sc.next();
        System.out.println("Введите размер оперативной памяти");
        String colour = scan.sc.next();
        NoteBook NB = new NoteBook(RAM,memory,OS,colour);
        return NB;
    }
    public static void Sort(LinkedList ls){
        System.out.println("""
                По какому критерию будем фильтровать?
                1 - RAM
                2 - Память
                3 - ОС
                4 - Цвет
                """);
        int des = scan.sc.nextInt();
        System.out.println("Введите значение критерия");
        String condition = scan.sc.next();
        int counter = 0;
        for (int i = 0; i < ls.size(); i++) {
            NoteBook res = (NoteBook) ls.get(i);
            if (res.getAll(des).equals(condition)){
                System.out.println(ls.get(i));
                counter++;
            }
        }
        if (counter == 0){
            System.out.println("Таких вариантов нет");
        }
    }
}
