import java.util.Scanner; 
public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    BankAccount obj1 = new BankAccount("XYZ","BA0001");
	obj1.showMenu();
	}

}

class BankAccount
{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	BankAccount(String cname , String cid)
	{
		customerName = cname;
		customerId = cid;
	}
	
	void deposit(int amount)
	{
		if (amount != 0)
		{
			balance =balance + amount;
			previousTransaction = amount;
		}
	}
	void withdraw(int amount)
	{
		if(amount !=0)
		{
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	void getPreviousTransaction()
	{
		if(previousTransaction > 0)
		{
			System.out.println("Deposited: "+previousTransaction);
		}
		else if(previousTransaction < 0 )
		{
			System.out.println("withdrawn: "+Math.abs(previousTransaction));
		}
		else {
			System.out.println("No transaction occured");
		}
	}
	void showMenu()
	{
		char option='\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome "+customerName);
		System.out.println("Your ID is "+customerId);
		System.out.println("\n");
		System.out.println("A. CHECK BALANCE");
		System.out.println("B. DEPOSIT");
		System.out.println("C. WITHDRAW");
		System.out.println("D. PREVIOUS TRANSACTION");
		System.out.println("E. EXIT");
		
		do
		{
			System.out.println("===========================================================");
			System.out.println("Enter an option");
			System.out.println("===========================================================");
			
			System.out.println("\n");
			
			switch(option)
			{
			
			case 'A':
				System.out.println("=======================================================");
				System.out.println("Balance = "+balance);
				System.out.println("=======================================================");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("------------------------------------------------------");
				System.out.println("Enter an amount to deposit");
				System.out.println("------------------------------------------------------");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C' :
				System.out.println("-----------------------------------------");
				System.out.println("Enter an  amount to withdraw:");
				System.out.println("-----------------------------------------");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
			case 'D' :
				System.out.println("-----------------------------------------");
				getPreviousTransaction();
				System.out.println("-----------------------------------------");
				System.out.println("\n");
				break;
				
			case 'E' :
				System.out.println("****************************************");
				
			default:
				System.out.println("Invalid Option!! Please enter again");
				break;
				
				
			}
		}while(option != 'E');
		System.out.println("Thankyou for using our services");
	}
}
