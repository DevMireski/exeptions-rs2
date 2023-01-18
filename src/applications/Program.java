package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exception.BusinessException;

public class Program {

	public static void main(String[] args) {
		
		try {
	    Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimt = sc.nextDouble();
		Account ac = new Account(number, holder, balance, withdrawLimt);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		Double withdraw = sc.nextDouble();
		ac.Withdraw(withdraw);
		
		System.out.printf("New balance: %.2f" , ac.getBalance());
		}
		catch(BusinessException e) {
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}
	}

}
