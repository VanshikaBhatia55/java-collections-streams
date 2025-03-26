package regex_junit.regex.replace_and_modify_strings;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CensorBadWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        List<String> badWords = Arrays.asList("damn", "stupid");
        for(String word : badWords){
            text = text.replaceAll(word, "****");
        }
        System.out.println(text);
    }
}
