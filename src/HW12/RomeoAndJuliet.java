package HW12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RomeoAndJuliet {

    public void setFile() throws IOException {
        FileReader reader = new FileReader("D://romeo-and-juliet.txt");
        int c = -1;
        StringBuilder romeoAndJulietText = new StringBuilder();
        while ((c = reader.read()) != -1) {
            romeoAndJulietText.append((char) c);
        }
        reader.close();

        // String[] words = romeoAndJulietText.toString().replaceAll("\\W ", " ").split(" ");// НЕ ПОНИМАЮ , ПОЧЕМУ ЭТА СТРОКА И НИЖНИИ 2 СТРОКИ РАБОТАЮТ ИНАЧЕ
        String romeoAndJulietString = romeoAndJulietText.toString().replaceAll("\\W", " ");
        String[] words = romeoAndJulietString.split(" ");
        String longWord = " ";
        for (String word : words) {
            if (word.length() >= longWord.length())
                longWord = word;
        }
        System.out.println(longWord);

        FileWriter writer = new FileWriter("D://2.txt");
        String text = longWord;
        writer.write(text);
        writer.close();
    }
}