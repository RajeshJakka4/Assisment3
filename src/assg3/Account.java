package assg3;
import java.util.Scanner;
import assg3.Customer;
import assg3.Bank;
public class Account extends Customer implements Bank {
	long accNum;
	double balance;
	
	public void readData() {
		super.readData();
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the account number: ");
		accNum   = scn.nextLong();
		System.out.println("enter the account balance: ");
		balance = scn.nextDouble() ;
		System.out.println();

		
		
	}
	
	void CalculateIntrest() {
		double CalculateIntrest;
		 CalculateIntrest = (balance*noyears*rateofIntrest/100);
		 System.out.println("CalculateIntrest: "+CalculateIntrest);
	
	}
	void Display() {
		super.Display();
		System.out.println("Account Number: "+accNum);
		System.out.println("Account Balance: "+balance);

}
}
