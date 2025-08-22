package OOPLAB;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to generate its multiplication table: ");
        int number = sc.nextInt();

        System.out.println("\nMultiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " × " + i + " = " + (number * i));
        }

        sc.close();
    }
}



package OOPLAB;

import java.util.Scanner;

public class Form {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Event Registration!");
        System.out.println("Please select an event from the list below:");
        System.out.println("1. Music");
        System.out.println("2. Dance");
        System.out.println("3. Quiz");
        System.out.println("4. Tech-Talk");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt(); 

        switch (choice) {
            case 1:
                System.out.println("You have registered for the Music event. Get ready to groove!");
                break;
            case 2:
                System.out.println("You have registered for the Dance event. Show us your moves!");
                break;
            case 3:
                System.out.println("You have registered for the Quiz event. Sharpen your brain!");
                break;
            case 4:
                System.out.println("You have registered for the Tech-Talk. Be ready to explore innovations!");
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid event name (music, dance, quiz, tech-talk).");
        }

        sc.close();
    }
}


package OOPLAB;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 0.0; 
        int choice;

        do {          
            System.out.println("\n=== Welcome to the Bank Kiosk ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Your current balance is ₹%.2f%n", balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = sc.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.printf("₹%.2f deposited successfully.%n", depositAmount);
                    } 
                    else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = sc.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.printf("₹%.2f withdrawn successfully.%n", withdrawAmount);
                    } 
                    else {
                        System.out.println("Invalid or insufficient amount.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the Bank Kiosk. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }

        } while (choice != 4);

        sc.close();
    }
}

package URK24CS1154;

import java.util.*;

public class GYM {

    int totalPushUps = 0;
    void pushup(String str) {
        int pushup = Integer.parseInt(str);

        if (pushup < 0) {
            System.out.println("Push-up count can't be negative.");
        } else {
            totalPushUps += pushup;
            System.out.println("Total so far: " + totalPushUps + " push-ups");
        }
    }

    public static void main(String a[]) {
        GYM g = new GYM();
        System.out.println("Jenoh Sam J B \nURK24CS1154");
        Scanner sc = new Scanner(System.in);

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int dayIndex = 0;    
        int daysCompleted = 0;  

        while (true) {
            System.out.print(daysOfWeek[dayIndex] + " - Enter push-ups (or type 'stop'): ");
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("stop")) {
                System.out.println("\nGreat job! You did a total of " + g.totalPushUps + " push-ups in " + daysCompleted + " days.");
                break;
            }

            g.pushup(str);

            dayIndex = (dayIndex + 1) % daysOfWeek.length;
            daysCompleted++; 
        }

        sc.close();
    }
}


package OOPLAB;

import java.util.Scanner;

public class Monitor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperature;

        System.out.println("=== Temperature Monitoring System ===");
        System.out.print("Enter the temperature in °C: ");
        temperature = sc.nextDouble();

        if (temperature < 15) {
            System.out.println("Classification: Cold");
        } 
        else if (temperature >= 15 && temperature < 25) {
            System.out.println("Classification: Moderate");
        } 
        else if (temperature >= 25 && temperature < 35) {
            System.out.println("Classification: Hot");
        } 
        else {
            System.out.println("Classification: Very Hot");
        }

        sc.close();
    }
}
