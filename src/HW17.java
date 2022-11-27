import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW17 {
    public static void main(String[] args) throws IOException {
        /*Написать программу для проверки на валидность введенного ip адреса. Пусть ip адрес задается с
        консоли. Программа должна проверять валидность введенного ip адреса с помощью регулярного выражения
        и выводить результат проверки на экран.
        ip адрес - это адреса от 0.0.0.0 до 255.255.255.255.*/
        Scanner scanner = new Scanner(System.in);
        String ipAddress = scanner.next();
        Pattern pattern = Pattern.compile(
                "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
        Matcher matcher = pattern.matcher(ipAddress);
        if (matcher.find()) {
            System.out.println(matcher.group());
        } else {
            System.out.println("не верный ip");
        }
         /*Программа на вход получает путь к файлу (формат тхт). Файл содержит произвольный текст.
           В этом тексте может быть номер документа(один или несколько), емейл и номер телефона.Номер документа
           в формате: xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате: +(ХХ)ХХХХХХХ. Документ
           может содержать не всю информацию, т.е. например, может не содержать номер телефона, или другое.
           Необходимо извлечь информацию. Извлеченную информацию необходимо сохранить в следующую структуру данных:
           Map, где ключ типа String – это что сохраняем(email, document number, phone number), значение типа String
           информацией. В конце вывести все найденные элементы Map.*/
        FileReader reader = new FileReader("D://HM17.txt");
        StringBuilder personInformation = new StringBuilder();
        int c = -1;
        while ((c = reader.read()) != -1) {
            personInformation.append((char) c);
        }
        String words = personInformation.toString();
        Pattern documentNumber = Pattern.compile("((\\d{4})-){2}(\\d{2})");
        Matcher matcherDocumentNumber = documentNumber.matcher(words);
        matcherDocumentNumber.find();
        Pattern phoneNumber = Pattern.compile("(\\+)(\\((\\d{2})\\))\\d{7}");
        Matcher matcherPhoneNumber = phoneNumber.matcher(words);
        matcherPhoneNumber.find();
        Pattern emailAddress = Pattern.compile("[_A-Za-z0-9-\\\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})");
        Matcher matcherEmailAddress = emailAddress.matcher(words);
        matcherEmailAddress.find();
        HashMap<String, String> information = new HashMap<>();
        information.put("email", matcherEmailAddress.group());
        information.put("document number", matcherDocumentNumber.group());
        information.put("phone number", matcherPhoneNumber.group());
        System.out.println(information);
    }
}