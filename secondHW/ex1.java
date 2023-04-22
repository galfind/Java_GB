package homework.secondhw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex1 {
    public static Logger logger = Logger.getAnonymousLogger();
    public static void main(String[] args) {
        FileHandler fileHandler = makeHandler();
        String line = makeMeString();
        System.out.println(line);
        String res = parseLine(line);
        System.out.println(res);
        SaveToFile(res);
        fileHandler.close();
    }

    public static void SaveToFile(String a){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("secondHW/result.txt", true);
            fileWriter.append(a);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logger.log(Level.INFO, "Файл сохранен");
    }
    public static FileHandler makeHandler() {
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("secondHW/Log.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logger.addHandler(fileHandler);
        return fileHandler;
    }

    public static String makeMeString(){
        File file = new File("secondHW/Text.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNextLine()){
            stringBuilder.append(scanner.nextLine());
        }
        logger.log(Level.INFO,"Строка скопирована из файла");
        logger.log(Level.INFO,stringBuilder.toString());

            return stringBuilder.toString();
    }
    public static String parseLine(String a){
        Pattern pattern = Pattern.compile(":\".+?\"");
        Matcher matcher = pattern.matcher(a);
        StringBuilder stringBuilder = new StringBuilder();
        String[] arr = new String[]{"Студент "," получил "," по предмету ",".\n"};
        int counter = 0;
        while (matcher.find()) {
            stringBuilder.append(arr[counter]);
            stringBuilder.append(a.substring(matcher.start()+2, matcher.end()-1));
            counter++;
            if (arr.length-1 == counter){
                stringBuilder.append(arr[counter]);
                counter = 0;
            }
        }
        logger.log(Level.INFO,"Сформирован вывод");
        logger.log(Level.INFO,stringBuilder.toString());
        return stringBuilder.toString();
    }
}
