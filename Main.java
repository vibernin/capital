package com.company;
import java.util.*;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        FileReader read_file = new FileReader("State_and_capital.txt");
            Map<String, String> array = new LinkedHashMap<String, String>();
            Scanner array_record = new Scanner(read_file);
            int number = 0;
            while (array_record.hasNextLine()){
                array.put(array_record.nextLine(),array_record.nextLine());
                number++;
            }
            System.out.println("Записей в файле " + number);
            int from = 0;
            int random_number = from + (int) (Math.random() * number);
            Object myKey = array.keySet().toArray()[random_number];
            System.out.println("Государство: " + myKey);
            String capital = array.get(myKey);
            Scanner answer = new Scanner(System.in);
            System.out.print("Столица: ");
            String answer_enter = answer.nextLine();
            if (array.get(myKey).equals(answer_enter)) {
                System.out.println("Правильно!");
            }
            else {
                System.out.println("Неправильно, правильный ответ " + array.get(myKey));
            }
        read_file.close();
    }
}
