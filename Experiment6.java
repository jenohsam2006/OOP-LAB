package URK24CS1154;
import java.util.Scanner;
abstract class Employee {
    String emp_name;
    String designation;
    double salary;
    Employee(String emp_name, String designation, double salary) {
        this.emp_name = emp_name;
        this.designation = designation;
        this.salary = salary;
    }
    abstract void calcRaise();
    void display() {
        System.out.println("\nName: " + emp_name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary after raise: " + salary);
        System.out.println("-----------------------------");
    }
}
class Manager extends Employee {
    double bonus;
    Manager(String emp_name, double salary, double bonus) {
        super(emp_name, "Manager", salary);
        this.bonus = bonus;
    }
    void calcRaise() {
        salary += salary * 0.05 + bonus;
    }
}
class Developer extends Employee {
    int no_pgms;
    Developer(String emp_name, double salary, int no_pgms) {
        super(emp_name, "Developer", salary);
        this.no_pgms = no_pgms;
    }
    void calcRaise() {
        salary += salary * 0.05 + no_pgms * 25;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Manager Name: ");
        String mName = sc.nextLine();
        System.out.print("Enter Manager Salary: ");
        double mSalary = sc.nextDouble();
        System.out.print("Enter Manager Bonus: ");
        double bonus = sc.nextDouble();
        Manager m = new Manager(mName, mSalary, bonus);
        m.calcRaise();
        m.display();
        sc.nextLine(); 
        System.out.print("Enter Developer Name: ");
        String dName = sc.nextLine();
        System.out.print("Enter Developer Salary: ");
        double dSalary = sc.nextDouble();
        System.out.print("Enter number of programs completed: ");
        int pgms = sc.nextInt();
        Developer d = new Developer(dName, dSalary, pgms);
        d.calcRaise();
        d.display();
        sc.close();
    }
}




package URK24CS1154;
import java.util.Scanner;
interface MathsOperable {
    double add(double a, double b);
    double sub(double a, double b);
    double mul(double a, double b);
    double div(double a, double b);
    double mod(double a, double b);
}
interface TrigonometricOperable {
    double sine(double angle);
    double cosine(double angle);
    double tan(double angle);
}
abstract class Calculator {
    double no1, no2, result;
    Calculator() {}
    Calculator(double no1, double no2) {
        this.no1 = no1;
        this.no2 = no2;
    }
}
class Operation extends Calculator implements MathsOperable, TrigonometricOperable {
    Operation() {}
    public double add(double a, double b) { return a + b; }
    public double sub(double a, double b) { return a - b; }
    public double mul(double a, double b) { return a * b; }
    public double div(double a, double b) { return a / b; }
    public double mod(double a, double b) { return a % b; }
    public double sine(double angle) { return Math.sin(Math.toRadians(angle)); }
    public double cosine(double angle) { return Math.cos(Math.toRadians(angle)); }
    public double tan(double angle) { return Math.tan(Math.toRadians(angle)); }
}
public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operation op = new Operation();
        int choice;
        do {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Add\n2. Sub\n3. Mul\n4. Div\n5. Mod");
            System.out.println("6. Sine\n7. Cosine\n8. Tan\n9. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: case 2: case 3: case 4: case 5:
                    System.out.print("Enter two numbers: ");
                    double a = sc.nextDouble();
                    double b = sc.nextDouble();
                    if (choice == 1) System.out.println("Result = " + op.add(a, b));
                    if (choice == 2) System.out.println("Result = " + op.sub(a, b));
                    if (choice == 3) System.out.println("Result = " + op.mul(a, b));
                    if (choice == 4) System.out.println("Result = " + op.div(a, b));
                    if (choice == 5) System.out.println("Result = " + op.mod(a, b));
                    break;
                
case 6: case 7: case 8:
                    System.out.print("Enter angle in degrees: ");
                    double angle = sc.nextDouble();
                    if (choice == 6) System.out.println("Sine = " + op.sine(angle));
                    if (choice == 7) System.out.println("Cosine = " + op.cosine(angle));
                    if (choice == 8) System.out.println("Tan = " + op.tan(angle));
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 9);
        sc.close();
    }
}





package package1;
public class Cube {
    double side;
    public Cube(double side) {
        this.side = side;
    }
    public double volume() {
        return side * side * side;
    }
}

package package2;
public class Rectangle {
    double length, breadth, height;
    public Rectangle(double l, double b, double h) {
        this.length = l;
        this.breadth = b;
        this.height = h;
    }
    public double volume() {
        return length * breadth * height;
    }
}

package package3;
public class Sphere {
    double radius;
    public Sphere(double radius) {
        this.radius = radius;
    }
    public double volume() {
        return (4.0/3.0) * Math.PI * radius * radius * radius;
    }
}

package URK24CS1154;
import java.util.Scanner;
import package1.Cube;
import package2.Rectangle;
import package3.Sphere;
public class VolumeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of Cube: ");
        double side = sc.nextDouble();
        Cube cube = new Cube(side);
        System.out.print("Enter length, breadth, height of Rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        Rectangle rect = new Rectangle(l, b, h);
        System.out.print("Enter radius of Sphere: ");
        double r = sc.nextDouble();
        Sphere sphere = new Sphere(r);
        System.out.println("\nCube Volume: " + cube.volume());
        System.out.println("Rectangle Volume: " + rect.volume());
        System.out.println("Sphere Volume: " + sphere.volume());
        sc.close();
    }
}

