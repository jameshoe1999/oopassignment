package com.hellojames.helpers;

import java.util.InputMismatchException;
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

    public static int menuInput() {
        while (true) {
            try {
                System.out.print("Enter the menu index or press zero to exit: ");
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please provide integer-only value!");
                scanner.nextLine();
            }
        }

    }
}
