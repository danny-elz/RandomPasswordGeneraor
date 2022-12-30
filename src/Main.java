import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        int input = 0;

        System.out.print("Password length: ");
        int charCount = sc.nextInt();

        String numbers = "1234567890";
        String lowerCaseLetters = "qwertyuiopasdfghjklzxcvbnm";
        String upperCaseLetters = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String symbols = "!@#$%^&*(),./;'[]-=_+{}:<>?`~|";

        System.out.println("\nExclude numbers: 1");
        System.out.println("Exclude lower case characters: 2");
        System.out.println("Exclude upper case characters: 3");
        System.out.println("Exclude symbols: 4");
        System.out.println("No exclusions: 5\n");

        while (true) {

            System.out.print("?: ");
            input = sc.nextInt();

            if (input > 5) {
                System.out.println("Invalid input");
            } else {
                break;
            }
        }

        switch (input) {

                case 1:
                    String noNumbers = lowerCaseLetters + upperCaseLetters + symbols;
                    for (int i = 0; i < charCount; i++) {
                        sb.append(noNumbers.charAt(r.nextInt(noNumbers.length())));
                    }
                    break;

                case 2:
                    String noLowerCaseLetters = numbers + upperCaseLetters + symbols;
                    for (int i = 0; i < charCount; i++) {
                        sb.append(noLowerCaseLetters.charAt(r.nextInt(noLowerCaseLetters.length())));
                    }
                    break;

                case 3:
                    String noUpperCaseLetters = numbers + lowerCaseLetters + symbols;
                    for (int i = 0; i < charCount; i++) {
                        sb.append(noUpperCaseLetters.charAt(r.nextInt(noUpperCaseLetters.length())));
                    }
                    break;

                case 4:
                    String noSymbols = numbers + lowerCaseLetters + upperCaseLetters;
                    for (int i = 0; i < charCount; i++) {
                        sb.append(noSymbols.charAt(r.nextInt(noSymbols.length())));
                    }
                    break;

                case 5:
                    String noExclusions = lowerCaseLetters + numbers + upperCaseLetters + symbols;
                    for (int i = 0; i < charCount; i++) {
                        sb.append(noExclusions.charAt(r.nextInt(noExclusions.length())));
                    }
                    break;
            }

            System.out.println("Random Password: " + sb);

            if (sb.length() <= 5) {
                System.out.println("Password is weak");
            } else if (sb.length() <= 8) {
                System.out.println("Password is moderate");
            } else {
                System.out.println("Password is strong");
            }
        }
    }


