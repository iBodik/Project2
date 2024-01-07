package org.ProjectJavaOOPs;

public class T6 {

    public static int countVowels(String input) {
        input = input.toLowerCase();

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String input = "documentation";
        int vowelCount = countVowels(input);

        System.out.println("Number of vowels in " + input + ": " + vowelCount);
    }
}

