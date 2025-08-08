BASIC 1:-
package URK24CS1154;

import java.util.Scanner;

public class Message {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jenoh Sam J B \nURK24CS1154");

        System.out.print("Enter number of messages: ");
        int n = Integer.parseInt(sc.nextLine());
        String[] messages = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter message " + (i + 1) + ": ");
            messages[i] = sc.nextLine();
        }

        System.out.print("Enter character to search: ");
        char searchChar = sc.nextLine().charAt(0);

        int maxCount = 0;
        String maxMessage = "";

        for (String msg : messages) {
            int count = 0;
            for (int i = 0; i < msg.length(); i++) {
                if (msg.charAt(i) == searchChar) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxMessage = msg;
            }
        }

        System.out.println("Message with maximum '" + searchChar + "' is: " + maxMessage);
        System.out.println("Count: " + maxCount);
        sc.close();
    }
	

}



BASIC 2:-
package URK24CS1154;

import java.util.Scanner;

public class WordSearch {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jenoh Sam J B \nURK24CS1154");

        System.out.println("Enter paragraph:");
        String paragraph = sc.nextLine();

        System.out.print("Enter word to search: ");
        String word = sc.next();

        int count = 0;
        int index = paragraph.indexOf(word);

        System.out.println("Positions:");
        while (index != -1) {
            count++;
            System.out.println(index);
            index = paragraph.indexOf(word, index + word.length());
        }

        System.out.println("Total occurrences: " + count);
        sc.close();
    }
}






INTERMEDIATE 1:-
package URK24CS1154;

import java.util.*;

public class SortNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jenoh Sam J B \nURK24CS1154");

        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        Arrays.sort(names);

        System.out.println("\nSorted names:");
        for (String name : names) {
            System.out.println(name);
        }
        sc.close();
    }
}




INTERMEDIATE 2:-
package URK24CS1154;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jenoh Sam J B \nURK24CS1154");

        System.out.println("Enter a sentence with extra spaces:");
        String sentence = sc.nextLine();

        sentence = sentence.replaceAll("\\s+", " ").trim();

        System.out.println("Cleaned sentence: " + sentence);
        sc.close();
    }
}




ADVANCED:-

package URK24CS1154;

import java.util.Scanner;

public class ConsecutiveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jenoh Sam J B \nURK24CS1154");

        System.out.println("Enter paragraph:");
        String paragraph = sc.nextLine().toLowerCase();

        String vowels = "aeiou";
        int count = 0;

        for (int i = 0; i < paragraph.length() - 1; i++) {
            char c1 = paragraph.charAt(i);
            char c2 = paragraph.charAt(i + 1);
            if (vowels.indexOf(c1) != -1 && vowels.indexOf(c2) != -1) {
                count++;
                System.out.println("Found: " + c1 + "" + c2 + " at index " + i);
            }
        }

        System.out.println("Total consecutive vowel pairs: " + count);
        sc.close();
    }
}

