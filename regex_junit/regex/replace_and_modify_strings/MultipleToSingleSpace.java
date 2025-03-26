package regex_junit.regex.replace_and_modify_strings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MultipleToSingleSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "\\s+";
        String replacedText = text.replaceAll(regex, " ");
        System.out.println(replacedText);
    }
}
