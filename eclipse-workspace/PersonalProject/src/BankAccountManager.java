import java.util.Scanner;
public class BankAccountManager{
	public static void main (String [] args) {
		
	Scanner scanner=new Scanner(System.in);
	
	boolean continueOperations=true; 
	double debitBalance=1000; 
	double savingsBalance = 2000;
	double creditBalance=500;

        while (continueOperations) {
            // Ask the user to select the account type
        	System.out.println("please select the type of the account: (1:debit, 2:savings, 3:credit): ");
        	
            int accountType = scanner.nextInt();

            // Determine the selected account's balance
            double accountBalance = 0;
            String accountName =null;
            switch (accountType) {
                case 1:
                    accountBalance = debitBalance;
                    accountName = "Debit";
                    break;
                case 2:
                   accountBalance = savingsBalance;
                    accountName = "Savings";
                    break;
                case 3:
                    accountBalance = creditBalance;
                    accountName = "Credit";
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            // Ask the user for the operation
            System.out.println("What would you like to do?");
            System.out.println("1. View Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Add Money");
            System.out.print("Enter your choice (1/2/3): ");
            int operation = scanner.nextInt();

            // Perform the selected operation
            switch (operation) {
                case 1: // View Balance
                    System.out.println(accountName + " Account Balance: $" + accountBalance);
                    break;
                case 2: // Withdraw Money
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > accountBalance) {
                        System.out.println("Insufficient balance! Transaction failed.");
                    } else {
                        accountBalance -= withdrawAmount;
                        System.out.println("Transaction successful. New " + accountName + " Balance: $" + accountBalance);
                    }
                    break;
                case 3: // Add Money
                    System.out.print("Enter the amount to add: $");
                    double addAmount = scanner.nextDouble();
                    accountBalance += addAmount;
                    System.out.println("Transaction successful. New " + accountName + " Balance: $" + accountBalance);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            // Update the respective account balance
            switch (accountType) {
                case 1:
                    debitBalance = accountBalance;
                    break;
                case 2:
                    savingsBalance = accountBalance;
                    break;
                case 3:
                    creditBalance = accountBalance;
                    break;
                   }
            // Ask if the user wants to perform another operation
            System.out.print("Do you want to perform another operation? (yes/no): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("no")) {
                continueOperations = false;
                System.out.println("Thank you for using the Bank Account Manager. Goodbye!");
                System.out.print("This program is made by Mustapha CHEKHAR");
           }
        }       
    }
}