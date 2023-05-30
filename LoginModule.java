package org.company;
import java.util.ArrayList;
import java.util.Scanner;

public class LoginModule {
    private static final String USERNAME = "username"; // Valid username
    private static final String PASSWORD = "password"; // Valid password
    private static final int MAX_ATTEMPTS = 3; // Maximum allowed attempts
    private static final String [] testUser = new String[]{"admin","1234"}; //

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0; // Counter for login attempts

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Enter your username: ");
            String username = scanner.nextLine();

            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            if (login(username, password)) {
                System.out.println("Login successful. Welcome!");
                break;
            } else {
                attempts++;
                int remainingAttempts = MAX_ATTEMPTS - attempts;
                System.out.println("Incorrect username or password. Remaining attempts: " + remainingAttempts);
            }
        }

        if (attempts == MAX_ATTEMPTS) {
            System.out.println("Maximum number of attempts reached. Account locked.");
        }

        scanner.close();
    }

    private static boolean login(String username, String password) {
        // Verify if the entered username and password are valid
        // Using the data of testUser declared

        // Simulating validation by comparing entered values with stored values
        if (username.equals(testUser[0]) && password.equals(testUser[1])) {
            return true; // Login successful
        } else {
            return false; // Credentials are incorrect
        }
    }
}