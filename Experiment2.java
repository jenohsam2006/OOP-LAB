BASIC 1:-
package OOPLAB;
import java.util.Scanner;
public class Frequency {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jenoh Sam J B \nURK24CS1154");
        System.out.print("Enter number of characters: ");
        int n = sc.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter character " + (i + 1) + ": ");
            arr[i] = sc.next().charAt(0);
        }
        System.out.print("Enter character to count: ");
        char target = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        System.out.println("Frequency of " + target + " is: " + count);
    }
}



BASIC 2:-
package OOPLAB;
import java.util.Scanner;
public class FrequentCharacter {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jenoh Sam J B \nURK24CS1154");
        System.out.print("Enter number of characters: ");
        int n = sc.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter character " + (i + 1) + ": ");
            arr[i] = sc.next().charAt(0);
        }
        int maxCount = 0;
        char maxChar = arr[0];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxChar = arr[i];
            }
        }
        System.out.println("Most frequent character: " + maxChar + " with frequency: " + maxCount);
    }
}



INTERMEDIATE 1:-
package OOPLAB;
import java.util.Scanner;
public class Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jenoh Sam J B \nURK24CS1154");
        System.out.print("Enter number of characters: ");
        int n = sc.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter character " + (i + 1) + ": ");
            arr[i] = sc.next().charAt(0);
        }
        System.out.print("Enter character to count: ");
        char target = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        System.out.println("Frequency of " + target + " is: " + count);
        int maxCount = 0;
        char maxChar = arr[0];
        for (int i = 0; i < n; i++) {
            int tempCount = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    tempCount++;
                }
            }
            if (tempCount > maxCount) {
                maxCount = tempCount;
                maxChar = arr[i];
            }
        }
        System.out.println("Most frequent character: " + maxChar + " with frequency: " + maxCount);
    }
}



INTERMEDIATE 2:-
package OOPLAB;
import java.util.Scanner;
public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jenoh Sam J B \nURK24CS1154");
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number to search: ");
        int target = sc.nextInt();
        boolean found = false;
        System.out.println("Occurrences at positions:");
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println(i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Number not found.");
        }
    }
}



ADVANCED:-	
package OOPLAB;
import java.util.Scanner;
public class PrimeSieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jenoh Sam J B \nURK24CS1154");
        System.out.print("Enter upper limit: ");
        int n = sc.nextInt();
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        System.out.println("Prime numbers up to " + n + " are:");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}






