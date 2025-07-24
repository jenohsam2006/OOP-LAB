import java.util.*;
public class Table {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int a = sc.nextInt();
		System.out.println("Multiplication Table of "+a);
		for (int i=1 ; i <= 10 ; i++) {
			System.out.println(a+"X"+i+"="+(a*i));
		}
		
	}
}


import java.util.*;
public class Form {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Music \n2.Dance \n3.Quiz \n4.Chess");
		System.out.println("Enter a choice : ");
		int ch = sc.nextInt();
		if (ch == 1) {
			System.out.println("You selected Music");
		}
		else if (ch == 2) {
			System.out.println("You selected Dance");
		}
		else if (ch == 3) {
			System.out.println("You selected Quiz");
		}
		else if (ch == 4) {
			System.out.println("You selected Chess");
		}
		else {
			System.out.println("Invaild choice");
		}
	}
}


import java.util.*;
public class Bank {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("1.Deposit \n2.Withdraw \n3.Balance \n4.Exit");
			System.out.println("Enter a choice : ");
			int ch = sc.nextInt();
			int ba = 0;
			if(ch == 1) {
				System.out.println("Enter a amount : ");
				int a = sc.nextInt();
				ba += a;
			}
			else if(ch == 2) {
				System.out.println("Enter a amount : ");
				int a = sc.nextInt();
				if(ba<=a) {
					ba -= a;
				}
				else {
					System.out.println("Invaild Balance");
				}
				System.out.println(ba);
			}
			else if(ch == 3) {
				System.out.println(ba);
			}
			else if(ch == 4) {
				System.out.println("Thank You");
				
			}
			else {
				System.out.println("Invaild choice");
			}
	}
 
}

