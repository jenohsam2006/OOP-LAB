package URK24CS1154;
import java.util.Scanner;
class NameException extends Exception {
	public NameException(String message) {
		super(message);
		}
}
class AgeException extends Exception {
	public AgeException(String message) {
		super(message);
		}
}
class Employee {
	String name;
	int age;
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
 void display() {
	 System.out.println("\nEmployee Details:");
              System.out.println("Name: " + name);
              System.out.println("Age: " + age);
     }
}
public class EmployeeDetails {
	public static Employee createEmployee(String name, int age)
			throws NameException, AgeException {
		if (name.matches("[0-9]+")) {
			throw new NameException("Invalid Name! Name cannot be a number.");
			}
		if (age > 50) {
			throw new AgeException("Invalid Age! Age cannot be greater than 50.");
			}
		return new Employee(name, age);
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter Employee Name: ");
			String name = sc.nextLine();
			System.out.print("Enter Employee Age: ");
			int age = sc.nextInt();        
			Employee emp = createEmployee(name, age);
			emp.display();
			} 
		catch (NameException | AgeException e) {
			System.out.println("Error: " + e.getMessage());
			} 
		finally {
			sc.close();
			}
 	}
}





import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();          
            int result = x / y;
            System.out.println(result);
        } 
        catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } 
        catch (ArithmeticException e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        } 
        finally {
            scanner.close();
        }
    }
}





import java.util.Scanner;
class MyCalculator {
     long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        } 
        else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        } 
        else {
            return (long) Math.pow(n, p);
        }
    }
}
public class Solution {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            try {
                System.out.println(my_calculator.power(n, p));
            } 


catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}





import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String S = bufferedReader.readLine();
        try {
            int i = Integer.parseInt(S);
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        } finally {
            bufferedReader.close();
        }
    }
}
