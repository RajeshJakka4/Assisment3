

package assg3;
import java.util.Scanner;
import assg3.Bank;
public class Customer implements Bank{
	String name;
	int id;
	
	public void readData()  {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("enter the customer name: "+name);
		name =scn.nextLine();
		System.out.println("enter the customer id: "+id);
		id =scn.nextInt();
		
	}
	void Display() {
		System.out.println("Custmor Name: "+name);
		System.out.println("Custmor ID: "+id);
	}

}
