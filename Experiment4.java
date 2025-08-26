package URK24CS1154;

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Time(int h, int m, int s) {
        this.hours = h;
        this.minutes = m;
        this.seconds = s;
        normalizeTime(); 
    }

    public void display() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }

    public void add(Time t1, Time t2) {
        this.seconds = t1.seconds + t2.seconds;
        this.minutes = t1.minutes + t2.minutes;
        this.hours = t1.hours + t2.hours;

        normalizeTime();
    }

    private void normalizeTime() {
        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds = seconds % 60;
        }
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes = minutes % 60;
        }
        if (hours >= 24) {
            hours = hours % 24; 
        }
    }
}

public class AddTime {
    public static void main(String[] args) {
    	System.out.println("Jenoh Sam J B \nURK24CS1154");
        Time t1 = new Time(11, 59, 59);  
        Time t2 = new Time(2, 45, 30);  
        Time t3 = new Time();            

        t3.add(t1, t2);                  

        System.out.print("Time 1: ");
        t1.display();
        System.out.print("Time 2: ");
        t2.display();
        System.out.print("Sum:   ");
        t3.display();
    }
}



package URK24CS1154;

import java.util.Scanner;

class ATM {
    private double balance;
    private int pin;

    public ATM(double balance, int pin) {
        this.balance = balance;
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void checkBalance() {
        System.out.println("Your current balance is: ₹" + balance);
    }

    public void withdraw(double amount) {
        if (balance <= 500) {
            System.out.println("Withdrawal not allowed! Minimum balance of ₹500 must be maintained.");
        } else if (amount % 100 != 0) {
            System.out.println("Please enter amount in multiples of 100.");
        } else if (amount > balance - 500) {
            System.out.println("Insufficient balance. You must maintain ₹500 minimum.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Please collect your cash.");
            checkBalance();
        }
    }

    public void changePin(int oldPin, int newPin) {
        if (oldPin == pin) {
            pin = newPin;
            System.out.println("PIN changed successfully.");
        } else {
            System.out.println("Incorrect old PIN.");
        }
    }
}

public class ATMapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jenoh Sam J B \nURK24CS1154");

        ATM atm = new ATM(5000, 1234);

        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin != atm.getPin()) {
            System.out.println("Invalid PIN! Exiting...");
            return;
        }

        int choice;
        do {
            System.out.println("\n===== ATM Menu =====");
            System.out.println("1. Balance Enquiry");
            System.out.println("2. Withdrawal");
            System.out.println("3. PIN Change");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double amount = sc.nextDouble();
                    atm.withdraw(amount);
                    break;
                case 3:
                    System.out.print("Enter old PIN: ");
                    int oldPin = sc.nextInt();
                    System.out.print("Enter new PIN: ");
                    int newPin = sc.nextInt();
                    atm.changePin(oldPin, newPin);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
