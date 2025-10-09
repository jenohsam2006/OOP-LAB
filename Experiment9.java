package URK24CS1154;
import java.io.*;
import java.util.Scanner;
public class FileOperationsMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("\n===== FILE OPERATIONS MENU =====");
            System.out.println("1. Open an existing file");
            System.out.println("2. Create a new file");
            System.out.println("3. Rename a file");
            System.out.println("4. Delete a file");
            System.out.println("5. Create a directory");
            System.out.println("6. Find absolute path of a file");
            System.out.println("7. Get file names of a directory");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter file name to open: ");
                    String fileName = sc.nextLine();
                    openFile(fileName);
                    break;
                case 2:
                    System.out.print("Enter new file name to create: ");
                    String newFile = sc.nextLine();
                    createFile(newFile);
                    break;
                case 3:
                    System.out.print("Enter existing file name to rename: ");
                    String oldName = sc.nextLine();
                    System.out.print("Enter new file name: ");
                    String newName = sc.nextLine();
                    renameFile(oldName, newName);
                    break;
                case 4:
                    System.out.print("Enter file name to delete: ");
                    String delFile = sc.nextLine();
                    deleteFile(delFile);
                    break;
                case 5:
                    System.out.print("Enter directory name to create: ");
                    String dirName = sc.nextLine();
                    createDirectory(dirName);
                    break;
                case 6:
                    System.out.print("Enter file name to find absolute path: ");
                    String absFile = sc.nextLine();
                    getAbsolutePath(absFile);
                    break;
                case 7:
                    System.out.print("Enter directory name to list files: ");
                    String directory = sc.nextLine();
                    listFiles(directory);
                    break;
                case 8:
                    System.out.println("Exiting program...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
    public static void openFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            System.out.println("\n--- File Content ---");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } 
        catch (IOException e) {
            System.out.println("Error reading file!");
        }
    }
    public static void createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created successfully: " + file.getName());
            } 
            else {
                System.out.println("File already exists.");
            }
        } 
        catch (IOException e) {
            System.out.println("Error creating file!");
        }
    }
    public static void renameFile(String oldName, String newName) {
        File oldFile = new File(oldName);
        File newFile = new File(newName);
        if (oldFile.exists()) {
            if (oldFile.renameTo(newFile)) {
                System.out.println("File renamed successfully!");
            } 
            else {
                System.out.println("Failed to rename file!");
            }
        } 
        else {
            System.out.println("Source file does not exist!");
        }
    }
    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully!");
            } 
            else {
                System.out.println("Unable to delete file!");
            }
        } 
        else {
            System.out.println("File not found!");
        }
    }
    public static void createDirectory(String dirName) {
        File dir = new File(dirName);
        if (dir.exists()) {
            System.out.println("Directory already exists.");
        } 
        else if (dir.mkdir()) {
            System.out.println("Directory created successfully!");
        } 
        else {
            System.out.println("Failed to create directory!");
        }
    }
    public static void getAbsolutePath(String fileName) {
        File file = new File(fileName);
        System.out.println("Absolute Path: " + file.getAbsolutePath());
    }
    public static void listFiles(String dirName) {
        File dir = new File(dirName);
        if (dir.exists() && dir.isDirectory()) {
            String[] files = dir.list();
            if (files != null && files.length > 0) {
                System.out.println("\nFiles in directory:");
                for (String f : files) {
                    System.out.println(f);
                }
            } 
            else {
                System.out.println("Directory is empty.");
            }
        } 
        else {
            System.out.println("Directory not found!");
        }
    }
}







package URK24CS1154;
import java.io.*;
import java.util.*;
public class PalindromeWordExtractor {
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        word = word.toLowerCase(); 
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Set<String> uniquePalindromes = new HashSet<>(); 
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\DELL\\eclipse-workspace\\Experiment9\\phases.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("[\\s.,!?;:]+");
                for (String word : words) {
                    if (!word.isEmpty() && isPalindrome(word)) {
                        uniquePalindromes.add(word.toLowerCase());
                    }
                }
            }
        } 
        catch (FileNotFoundException e) {
            System.out.println("phrases.txt not found!");
            return;
        } 
        catch (IOException e) {
            System.out.println("Error reading file!");
            return;
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("palindromes.txt"))) {
            for (String palindrome : uniquePalindromes) {
                bw.write(palindrome);
                bw.newLine();
            }
        } 
        catch (IOException e) {
            System.out.println("Error writing to palindromes.txt!");
            return;
        }
        System.out.println("Unique palindrome words found: " + uniquePalindromes.size());
        System.out.println("Palindromes saved in palindromes.txt");
    }
}

