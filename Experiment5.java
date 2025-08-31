package URK24CS1154;
public class Employee {
    protected double basicSalary;
    public Employee(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public double calculateGrossSalary() {
        return basicSalary;
    }
    public double calculateTax() {
        return 0.0;
    }
    public double calculateNetSalary() {
        return calculateGrossSalary() - calculateTax();
    }
    public void printPayDetails() {
        System.out.println("--- Pay Details ---");
        System.out.println("Basic Salary: " + this.basicSalary);
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Tax: " + calculateTax());
        System.out.println("Net Salary: " + calculateNetSalary());
        System.out.println("-------------------");
    }
}

package URK24CS1154;
public class Engineer extends Employee {
    public Engineer() {
        super(50000);
    }
    public double calculateGrossSalary() {
        double da = basicSalary * 0.80;
        double hra = basicSalary * 0.15;
        return basicSalary + da + hra;
    }
    public double calculateTax() {
        return calculateGrossSalary() * 0.15;
    }
    public double calculateNetSalary() {
        double gross = calculateGrossSalary();
        double tax = calculateTax();
        double epf = 2500;
        return gross - tax - epf;
    }
    public void printPayDetails() {
        double da = basicSalary * 0.80;
        double hra = basicSalary * 0.15;
        double gross = calculateGrossSalary();
        double tax = calculateTax();
        double epf = 2500;
        double net = calculateNetSalary();
        System.out.println("--- Engineer Pay Details ---");
        System.out.println("Basic Salary: " + this.basicSalary);
        System.out.println("DA Pay: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("EPF: " + epf);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Tax: " + tax);
        System.out.println("Net Salary: " + net);
        System.out.println("----------------------------");
    }
}

package URK24CS1154;
public class Manager extends Employee {
    public Manager() {
        super(100000);
    }
    public double calculateGrossSalary() {
        double da = basicSalary * 0.95;
        double hra = basicSalary * 0.20;
        return basicSalary + da + hra;
    }
    public double calculateTax() {
        return calculateGrossSalary() * 0.25;
    }
    public double calculateNetSalary() {
        double gross = calculateGrossSalary();
        double tax = calculateTax();
        double epf = 3500;
        return gross - tax - epf;
    }
    public void printPayDetails() {
        double da = basicSalary * 0.95;
        double hra = basicSalary * 0.20;
        double gross = calculateGrossSalary();
        double tax = calculateTax();
        double epf = 3500;
        double net = calculateNetSalary();
        System.out.println("--- Manager Pay Details ---");
        System.out.println("Basic Salary: " + this.basicSalary);
        System.out.println("DA Pay: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("EPF: " + epf);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Tax: " + tax);
        System.out.println("Net Salary: " + net);
        System.out.println("---------------------------");
    }
}

package URK24CS1154;
import java.util.Scanner;
public class SalaryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int employeeTypeChoice;


        do {
            System.out.println("\n--- Select Employee Type ---");
            System.out.println("1. Manager");
            System.out.println("2. Engineer");
            System.out.println("0. Exit Application");
            System.out.print("Enter your choice: ");         
            if (scanner.hasNextInt()) {
                employeeTypeChoice = scanner.nextInt();
                scanner.nextLine(); 
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); 
                employeeTypeChoice = -1; 
            }
            switch (employeeTypeChoice) {
                case 1:
                    handleEmployeeOperations(new Manager(), scanner);
                    break;
                case 2:
                    handleEmployeeOperations(new Engineer(), scanner);
                    break;
                case 0:
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    if (employeeTypeChoice != -1) { 
                        System.out.println("Invalid choice. Please try again.");
                    }
                    break;
            }
        } while (employeeTypeChoice != 0);

        scanner.close();
    }
    private static void handleEmployeeOperations(Employee employee, Scanner scanner) {
        char menuChoice;
        do {
            System.out.println("\n--- Employee Salary Menu ---");
            System.out.println("a) Calculate Gross Salary");
            System.out.println("b) Calculate Net Salary");
            System.out.println("c) Calculate Tax");
            System.out.println("d) Print the Pay Details");
            System.out.println("e) Back to Employee Selection");
            System.out.print("Enter your option: ");   
            menuChoice = scanner.next().charAt(0);
            switch (menuChoice) {
                case 'a':
                    System.out.println("Gross Salary: " + employee.calculateGrossSalary());
                    break;
                case 'b':
                    System.out.println("Net Salary: " + employee.calculateNetSalary());
                    break;
                case 'c':
                    System.out.println("Tax: " + employee.calculateTax());
                    break;
                case 'd':
                    employee.printPayDetails();
                    break;
                case 'e':
                    System.out.println("Returning to employee selection...");
                    break;
                
default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (menuChoice != 'e');
    }
}



package URK24CS1154;
public class IncomeTax {
	protected String name;
	protected int age;
	protected double annualIncome;
	protected double tax = 0.0;
	public IncomeTax(String name, int age, double annualIncome) {
		this.name = name;
		this.age = age;
		this.annualIncome = annualIncome;
	}
	public void findTax() {
		System.out.println("Calculating tax based on category...");
	}
	public void displayTax() {
		System.out.println("\n--- Tax Calculation Details ---");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.printf("Annual Income: ₹%,.2f\n", annualIncome);
		System.out.printf("Tax Payable: ₹%,.2f\n", tax);
		System.out.println("--------------------------------");
	}
}

package URK24CS1154;
public class SeniorCitizen extends IncomeTax {
	public SeniorCitizen(String name, int age, double annualIncome) {
		super(name, age, annualIncome);
	}
	public void findTax() {
		if (annualIncome <= 250000) {
			this.tax = 0;
		} 
		else if (annualIncome <= 500000) {
			this.tax = 0;
		} 
		else if (annualIncome <= 750000) {
			this.tax = 12500 + 0.05 * (annualIncome - 500000);
		}
		else if (annualIncome <= 1000000) {
			this.tax = 37500 + 0.10 * (annualIncome - 750000);
		}
		else {
			this.tax = 75000 + 0.15 * (annualIncome - 1000000);
		}
	}     }
package URK24CS1154;
import java.util.Scanner;
public class TaxApp {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Jenoh Sam J B \nURK24CS1154");
		int choice;
		do {
			System.out.println("\n--- Income Tax Calculator FY 2022-23 ---");
			System.out.println("1. Calculate Tax");
			System.out.println("2. Exit");
			System.out.print("Enter your choice: ");
			choice = getIntInput("Invalid choice. Please enter a number: ");
			switch (choice) {
				case 1:
					calculateTaxOption();
					break;
				case 2:
					System.out.println("Exiting application. Thank you!");
					break;
				default:
					System.out.println("Invalid choice. Please enter a valid option.");
			}
		} while (choice != 2);
		scanner.close();
	}
	private static void calculateTaxOption() {
		System.out.println("\nEnter Details:");
		scanner.nextLine();
		System.out.print("Name: ");
		String name = scanner.nextLine();
		System.out.print("Age: ");
		int age = getIntInput("Invalid age. Please enter a number: ");
		System.out.print("Annual Income: ₹");
		double annualIncome = getDoubleInput("Invalid annual income. Please enter a number: ");
		IncomeTax taxpayer;
		if (age < 60) {
			taxpayer = new Resident(name, age, annualIncome);
		} 
		else {
			taxpayer = new SeniorCitizen(name, age, annualIncome);
		}
		taxpayer.findTax();
		taxpayer.displayTax();
	}
	private static int getIntInput(String errorMessage) {
		while (!scanner.hasNextInt()) {
			System.out.println(errorMessage);
			scanner.next();
		}
		int validInt = scanner.nextInt();
		return validInt;
	}
	private static double getDoubleInput(String errorMessage) {
		while (!scanner.hasNextDouble()) {
			System.out.println(errorMessage);
			scanner.next();
		}
		double validDouble = scanner.nextDouble();
		scanner.nextLine();
		return validDouble;
	}
}





package URK24CS1154;
public class Book {
    protected String bookTitle;
    protected String bookAuthor;
    protected int bookNoOfCopies;
    protected int bookAvailability;
    protected int bookEdition;
    protected String bookPublisher;
    public Book(String bookTitle, String bookAuthor, int bookNoOfCopies, int bookEdition, String bookPublisher) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookNoOfCopies = bookNoOfCopies;
        this.bookAvailability = bookNoOfCopies;
        this.bookEdition = bookEdition;
        this.bookPublisher = bookPublisher;
    }

    public String getBookTitle() {
        return bookTitle;
    }
    public String getBookAuthor() {
        return bookAuthor;
    }
    public void borrowBook() {
        if (bookAvailability > 0) {
            bookAvailability--;
            System.out.println("Successfully borrowed '" + bookTitle + "'.");
        } else {
            System.out.println("Sorry, no copies of '" + bookTitle + "' are available.");
        }
    }
    public void returnBook() {
        if (bookAvailability < bookNoOfCopies) {
            bookAvailability++;
            System.out.println("Successfully returned '" + bookTitle + "'.");
        } else {
            System.out.println("This is not a valid return for '" + bookTitle + "'.");
        }
    }
    public void displayBookDetails() {
        System.out.println("--- Book Details ---");
        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Copies: " + bookNoOfCopies);
        System.out.println("Available: " + bookAvailability);
        System.out.println("Edition: " + bookEdition);
        System.out.println("Publisher: " + bookPublisher);
        System.out.println("--------------------");
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return this.bookTitle.equalsIgnoreCase(book.bookTitle) &&
               this.bookAuthor.equalsIgnoreCase(book.bookAuthor);
    }
}

package URK24CS1154;
public class ReferenceBook extends Book {
    public ReferenceBook(String bookTitle, String bookAuthor, int bookNoOfCopies, int bookEdition, String bookPublisher) {
        super(bookTitle, bookAuthor, bookNoOfCopies, bookEdition, bookPublisher);
    }
    public void borrowBook() {
        System.out.println("Sorry, reference books cannot be borrowed. They are for in-library use only.");
    }
    public void displayBookDetails() {
        super.displayBookDetails();
        System.out.println("Book Type: Reference Book");
    }
}

package URK24CS1154;
import java.util.Scanner;
public class LibraryApp {
    private static Book[] libraryBooks = new Book[10];
    private static int bookCount = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        addInitialBooks();
        int choice;
        do {
            showMainMenu();
            choice = getIntInput("Invalid choice. Please enter a number: ");          
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    searchBook();
                    break;
                case 3:
                    borrowBook();
                    break;
                case 4:
                    returnBook();
                    break;
                case 5:
                    displayAllBooks();
                    break;
                case 0:
                    System.out.println("Exiting application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
    private static void addInitialBooks() {
        if (bookCount < libraryBooks.length) {
            libraryBooks[bookCount++] = new Book("The Hobbit", "J.R.R. Tolkien", 5, 1, "Houghton Mifflin");
        }
        if (bookCount < libraryBooks.length) {
            libraryBooks[bookCount++] = new ReferenceBook("Java: The Complete Reference", "Herbert Schildt", 2, 11, "McGraw-Hill Education");
        }
        if (bookCount < libraryBooks.length) {
            libraryBooks[bookCount++] = new Book("1984", "George Orwell", 10, 1, "Secker & Warburg");
        }
    }
    private static void showMainMenu() {
        System.out.println("\n--- Library Management System ---");
        System.out.println("1. Add a new book");
        System.out.println("2. Search for a book");
        System.out.println("3. Borrow a book");
        System.out.println("4. Return a book");
        System.out.println("5. Display all books");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }
    private static int getIntInput(String errorMessage) {
        while (!scanner.hasNextInt()) {
            System.out.println(errorMessage);
            scanner.next();
        }
        int validInt = scanner.nextInt();
        scanner.nextLine();
        return validInt;
    }
    private static void resizeBookArray() {
        int newSize = libraryBooks.length * 2;
        Book[] newArray = new Book[newSize];
        for (int i = 0; i < libraryBooks.length; i++) {
            newArray[i] = libraryBooks[i];
        }
        libraryBooks = newArray;
    }
    private static void addBook() {
        if (bookCount >= libraryBooks.length) {
            resizeBookArray();
        }
        System.out.println("\n--- Add a New Book ---");
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter number of copies: ");
        int copies = getIntInput("Invalid input. Please enter a number for copies: ");
        System.out.print("Enter book edition: ");
        int edition = getIntInput("Invalid input. Please enter a number for edition: ");
        System.out.print("Enter book publisher: ");
        String publisher = scanner.nextLine();
        System.out.println("Is this a (1) Standard Book or a (2) Reference Book?");
        int typeChoice = getIntInput("Invalid book type. Please enter 1 or 2: ");
        Book newBook;
        if (typeChoice == 1) {
            newBook = new Book(title, author, copies, edition, publisher);
        } else if (typeChoice == 2) {
            newBook = new ReferenceBook(title, author, copies, edition, publisher);
        } else {
            System.out.println("Invalid book type. Adding as a standard book.");
            newBook = new Book(title, author, copies, edition, publisher);
        }
        libraryBooks[bookCount++] = newBook;
        System.out.println("Book added successfully.");
    }
    private static void searchBook() {
        System.out.println("\n--- Search for a Book ---");
        System.out.print("Enter book title or author: ");
        String query = scanner.nextLine().toLowerCase();
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            Book book = libraryBooks[i];
            if(book.getBookTitle().toLowerCase().contains(query)||book.getBookAuthor().toLowerCase().contains(query)) {
                book.displayBookDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found matching the query.");
        }
    }
    private static void borrowBook() {
        System.out.println("\n--- Borrow a Book ---");
        System.out.print("Enter the title of the book to borrow: ");
        String titleToBorrow = scanner.nextLine();

        Book bookToBorrow = findBookByTitle(titleToBorrow);
        if (bookToBorrow != null) {
            bookToBorrow.borrowBook();
        } else {
            System.out.println("Book not found.");
        }
    }
    private static void returnBook() {
        System.out.println("\n--- Return a Book ---");
        System.out.print("Enter the title of the book to return: ");
        String titleToReturn = scanner.nextLine();
        Book bookToReturn = findBookByTitle(titleToReturn);
        if (bookToReturn != null) {
            bookToReturn.returnBook();
        } else {
            System.out.println("Book not found.");
        }
    }
    private static void displayAllBooks() {
        if (bookCount == 0) {
            System.out.println("\nThe library is currently empty.");
        } else {
            System.out.println("\n--- All Books in Library ---");
            for (int i = 0; i < bookCount; i++) {
                libraryBooks[i].displayBookDetails();
                System.out.println();
            }
        }
    }
    private static Book findBookByTitle(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (libraryBooks[i].getBookTitle().equalsIgnoreCase(title)) {
                return libraryBooks[i];
            }
        }
        return null;
    }
}
