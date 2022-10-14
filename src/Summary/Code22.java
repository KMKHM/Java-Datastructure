package Summary;

import java.io.*;
import java.util.Scanner;

public class Code22 {

    static String  [] words = new String [100000]; // 단어의 목록
    static int [] count = new int [100000]; // 단어가 등장하는 횟수
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
                    System.out.println("The word " + words[index] + " appears " + count[index] + " times.");
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
            System.out.println(words[i] + " "+ count[i]);
        }
    }

    static void saveAs(String fileName) {
        PrintWriter outFile;
        try {
            outFile = new PrintWriter(new FileWriter(fileName));
            for (int i=0; i<n; i++) {
                outFile.println(words[i] + " " + count[i]);
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
                addWord(str);
            }

        } catch (FileNotFoundException e) {
            System.out.println("No file");
            return;
        }

    }

    static void addWord(String str) {
        int index = findWord(str); // return -1 if not found

        if(index != -1) { // found
            count[index]++;
        } else { // not found : 새로운 단어
            words[n] = str;
            count[n] = 1;
            n++;
        }
    }

    static int findWord(String str) {
        for (int i=0; i<n; i++){
            if (words[i].equals(str)){
                return i;
            }
        }
        return -1;
    }

}
