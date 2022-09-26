package p2;

import java.util.Scanner;

public class BalanceTransfer {
	public static void main(String[] args) {
		
		int accountBalance[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter salary of 1st Person : ");
		accountBalance[0] = sc.nextInt();

		System.out.println("Enter salary of 12nd Person : ");
		accountBalance[1] = sc.nextInt();

		System.out.println("Enter salary of 3rd Person : ");
		accountBalance[2] = sc.nextInt();

		System.out.println("Enter salary of 4th Person : ");
		accountBalance[3] = sc.nextInt();

		System.out.println("Enter salary of 5th Person : ");
		accountBalance[4] = sc.nextInt();
		
		System.out.println("Enter the index value[0-4] : ");
		int indexValue = sc.nextInt();
		System.out.println("Enter the amount to be Transfered: ");
		int amount = sc.nextInt();
		System.out.println("Enter the index value of Payee : ");
		int payee = sc.nextInt();
		
		accountBalance[indexValue] = accountBalance[indexValue]-amount;
		
		accountBalance[payee] = accountBalance[payee]+amount;
		
		
		System.out.printf("Account Balance of 1st Employee : "+accountBalance[0]);
		System.out.printf("\nAccount Balance of 2nd Employee : "+accountBalance[1]);
		System.out.printf("\nAccount Balance of 3rd Employee : "+accountBalance[2]);
		System.out.printf("\nAccount Balance of 4th Employee : "+accountBalance[3]);
		System.out.printf("\nAccount Balance of 5th Employee : "+accountBalance[4]);
		
	}

}
