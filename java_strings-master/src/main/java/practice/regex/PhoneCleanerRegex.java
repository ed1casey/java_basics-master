package practice.regex;

import java.util.Scanner;

public class PhoneCleanerRegex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();

            String regex = "[()+\\s+-]";

            input = input.replaceAll(regex, "");

          //TODO в if где идет замена символа надо исправить
          // вместо первого символа заменяются все, которые равны первому

            if (input.equals("0")) {
                scanner.close();
                break;
            } else if (input.length() == 10) {
                input = "7".concat(input);
                System.out.println(input);
            } else if (input.charAt(0) == '8' && input.length() == 11) {
                System.out.println(input.replace(input.charAt(0), '7'));
            } else if (input.charAt(0) != '7' || input.length() <= 9 || input.length() > 11) {
                System.out.println("Неверный формат номера ");
            } else {
                System.out.println(input);
            }
        }
    }
}
