package com.hellojames.helpers;

import java.util.Scanner;

public class InputHelper {
    private final static Scanner scanner = new Scanner(System.in);

    public static String askQuestion(String question, boolean isNullable) {
        System.out.println(question);
        String line;
        while (true) {
            line = scanner.nextLine();
            if (isNullable && line.isBlank()) {
                return "";
            } else if (!line.isBlank()) {
                return line;
            } else {
                System.out.print("\nPlease provide a valid input: ");
            }
        }
    }
}
