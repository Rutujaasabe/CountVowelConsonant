package Java;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        int vowel = 0;
        int consonant = 0;
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (letter == 'a' || letter == 'i' || letter == 'e' || letter == 'o' || letter == 'u' || letter == 'A'
                    || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                vowel++;
            } else {
                consonant++;
            }
        }
        System.out.println(vowel);
        System.out.println(consonant);
        sc.close();
    }
}
