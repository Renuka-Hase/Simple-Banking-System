package banking_system;

	import java.util.Scanner;

	public class Simple_Banking_System {
		
		static {
			System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
			System.out.println("----------------------------------Welcome to my Bank-----------------------------");
			System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
		}
		private String accountNumber;
		private double balance;
		
		public String getAccountNumber() {
			return accountNumber;
		}
		
		public double getBalance() {
			return balance;
		}
		
		public void setAccountNumber(String accno) {
			if(accountNumber == null){
			 accountNumber = accno;}
			else{
				System.out.println("AccountNumber is Already Set");}
		}
		public void deposit(double amount) {
			if(amount>0.0) {
			balance = amount + balance;
			System.out.println("Deposit Successful"+"\nDeposit Amount:$"+amount+"\nYour Total Balance is:$"+balance);
		}else{System.out.println("Invalid Deposit Amount!!!");
		}
		}
		
		public void withdraw(double amount) {
			if(amount>0&&amount<=balance){
			balance= balance-amount;
			System.out.println("Withdraw Successful"+"\nWithdraw Amount:$"+amount+"\nYour Total Balance is:$"+balance);
			}
			else {System.out.println("Invalid Withdraw Amount!!!");}
		}
		
		public static void main(String[]args) {
			Scanner sc =new Scanner(System.in);
			Simple_Banking_System ref = new Simple_Banking_System();
			
			System.out.println("Enter Your Account Number To Register:");
			
			ref.setAccountNumber(sc.nextLine());
			
			int choice;
			 
			do {
				System.out.println("*************************************************************");

				System.out.println("\n ATM Menu");
				System.out.println("1. Deposit");
				System.out.println("2. Withdraw");
				System.out.println("3. Check Balance");
				System.out.println("4. Show Account Number");
				System.out.println("5. Exit");
				System.out.println("Enter Your Choice");
				choice=sc.nextInt();
				
				System.out.println("==============================================================");

				
				switch(choice) {
				
				case 1 :
				{
					System.out.println("Enter Amount to Deposit");
					double depamt = sc.nextDouble();
					ref.deposit(depamt);
					break;
				}
				case 2:
				{
					System.out.println("Enter Amount to Withdraw");
					double wthamt=sc.nextDouble();
					ref.withdraw(wthamt);
					break;
				}
				case 3:
				{
					System.out.println("Your Total Balance is:$"+ref.getBalance());
					break;
				}
				case 4:
				{
					System.out.println("Account Holder Number:"+ref.getAccountNumber());
					break;
				}
				case 5:{
					System.out.println("Thank You For Banking With Us");
					break;
				}
				default:{
					System.out.println("Invalid Choice !!! Please Select Valid Option. ");
				}
				}
			}
			
			while(choice!=5);
				sc.close();
		}
	}

