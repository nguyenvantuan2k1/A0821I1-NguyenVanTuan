package _19_string_and_regex.exercise.validate_phone_number;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNum {
    public static void main(String[] args) {

        String regex =new String("^(\\(\\d{2}\\))-(\\(0\\d{9}\\))$");
        Pattern pattern = Pattern.compile(regex);

        System.out.println("Enter phone number  :");
        Scanner scanner = new Scanner(System.in);
        String phoneNumber = scanner.nextLine();

        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches()) System.out.println("valid");
        else System.out.println("invalid");
    }
}
