import java.util.Scanner;

public class SimpleArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements (N): ");
        int N = sc.nextInt();

        int[] original = new int[N];
        int[] ascending = new int[N];
        int[] descending = new int[N];

        System.out.println("Enter " + N + " numbers:");
        for (int i = 0; i < N; i++) {
            original[i] = sc.nextInt();
            ascending[i] = original[i];   // copy to ascending array
            descending[i] = original[i];  // copy to descending array
        }

        // Sort ascending array (simple bubble sort)
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (ascending[j] > ascending[j + 1]) {
                    int temp = ascending[j];
                    ascending[j] = ascending[j + 1];
                    ascending[j + 1] = temp;
                }
            }
        }

        // Sort descending array (simple bubble sort)
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (descending[j] < descending[j + 1]) {
                    int temp = descending[j];
                    descending[j] = descending[j + 1];
                    descending[j + 1] = temp;
                }
            }
        }

        System.out.print("Ascending order array: ");
        for (int i = 0; i < N; i++) {
            System.out.print(ascending[i] + " ");
        }
        System.out.println();

        System.out.print("Descending order array: ");
        for (int i = 0; i < N; i++) {
            System.out.print(descending[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}





import java.util.Scanner;

public class SearchArrayPositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input main array
        System.out.print("Enter size of main array: ");
        int n = sc.nextInt();
        int[] mainArray = new int[n];
        System.out.println("Enter " + n + " elements of main array:");
        for (int i = 0; i < n; i++) {
            mainArray[i] = sc.nextInt();
        }

        // Input search array
        System.out.print("Enter size of search array: ");
        int m = sc.nextInt();
        int[] searchArray = new int[m];
        System.out.println("Enter " + m + " elements of search array:");
        for (int i = 0; i < m; i++) {
            searchArray[i] = sc.nextInt();
        }

        // For each element in search array, find all positions in main array
        for (int i = 0; i < m; i++) {
            int searchElement = searchArray[i];
            boolean found = false;
            System.out.print("Element " + searchElement + " found at positions: ");
            for (int j = 0; j < n; j++) {
                if (mainArray[j] == searchElement) {
                    System.out.print(j + " ");
                    found = true;
                }
            }
            if (!found) {
                System.out.print("Not found");
            }
            System.out.println();
        }

        sc.close();
    }
}




import java.util.Scanner;

public class CountCharacterOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        char[] arr = new char[n];

        System.out.println("Enter " + n + " characters:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }

        System.out.print("Enter the character to count: ");
        char ch = sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ch) {
                count++;
            }
        }

        System.out.println("Character '" + ch + "' occurred " + count + " times.");

        sc.close();
    }
}



import java.util.Scanner;

public class HighestOccurredCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        char[] arr = new char[n];

        System.out.println("Enter " + n + " characters:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }

        // Count frequency of each character (assuming ASCII chars)
        int[] freq = new int[256];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        // Find character with highest frequency
        int maxFreq = 0;
        char maxChar = arr[0];
        for (int i = 0; i < 256; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxChar = (char) i;
            }
        }

        System.out.println("Highest occurred character: '" + maxChar + "' with " + maxFreq + " occurrences.");

        sc.close();
    }
}
