package HW10;

import java.util.Scanner;

public class GetScannerString {
    public void ScannerString() {
        String str1[] = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Введи строку.");
            Scanner scanner = new Scanner(System.in);
            String firstString = scanner.nextLine();
            str1[i] = firstString.trim();
        }
    }
}
