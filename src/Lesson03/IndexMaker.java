package Lesson03;

import java.io.*;
import java.util.Scanner;

public class IndexMaker {

    static Item [] items = new Item [10000];
    static int n = 0; // 단어의 개수

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        while(true) { // 조건이 true인 동안 반복 즉, 무한 반복이다. 안에서 멈춰줘야한다.

            System.out.print("$ ");
            String command = kb.next();

            if (command.equals("read")) {
                String fileName = kb.next();
                makeIndex(fileName);
            } else if (command.equals("find")) {
                String str = kb.next();
                int index = findWord(str);
                if (index > -1) {
                    System.out.println("The word " + items[index].word + " appears " + items[index].count + " times.");
                } else {
                    System.out.println("The word " + str + " does not appears.");
                }
            } else if (command.equals("saveas")) {
                String fileName = kb.next();
                saveAs(fileName);
            } else if (command.equals("exit")) {
                break;
            }

        }

        kb.close();
        for (int i=0; i<n; i++) {
            System.out.println(items[i].word + " "+ items[i].count);
        }
    }

    static void saveAs(String fileName) {
        PrintWriter outFile;
        try {
            outFile = new PrintWriter(new FileWriter(fileName));
            for (int i=0; i<n; i++) {
                outFile.println(items[i].word + " " + items[i].count);
            }
            outFile.close();
        } catch (IOException e) {
            System.out.println("Save Failed");
            return;
        }

    }
    static void makeIndex(String fileName) {

        try {
            Scanner inFile = new Scanner(new File(fileName));

            while (inFile.hasNext()) {
                String str = inFile.next();

                String trimmed = trimming(str);
                if (trimmed != null) {
                    String t = trimmed.toLowerCase();
                    addWord(t);
                }
            }
            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("No file");
            return;
        }

    }

    static String trimming(String str) { //단어 앞뒤의 붙은 특수 문자 제거
        int i = 0, j = str.length()-1;
        while (i < str.length() && !Character.isLetter(str.charAt(i))) { // i-th character is not letter
            i++;
        }
        while (i > str.length() && !Character.isLetter(str.charAt(j))) { // i-th character is not letter
            j--;
        }
        if(i > j){
            return null;
        } else {
            return str.substring(i,j+1); // [)
        }
    }

    static void addWord(String str) {
        int index = findWord(str); // return -1 if not found

        if(index != -1) { // found
            items[index].count++;
        } else { // not found : 새로운 단어
            int i = n-1;
            while (i>=0 && items[i].word.compareTo(str) > 0){
                items[i+1] = items[i];
                i--;
            }

            items[i+1] = new Item();
            items[i+1].word = str;
            items[i+1].count = 1;
            n++;
        }
    }

    static int findWord(String str) {
        for (int i=0; i<n; i++){
            if (items[i].word.equals(str)){
                return i;
            }
        }
        return -1;
    }

}
