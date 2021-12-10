package _19_string_and_regex.exercise.validate_name_class;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClass {
    public static void main(String[] args) {

        String regex =new String("^[CPA]\\d{4}[GHIKLM]$");
        Pattern pattern = Pattern.compile(regex);

        System.out.println("Enter name class :");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) System.out.println("valid");
        else System.out.println("invalid");
    }
}
