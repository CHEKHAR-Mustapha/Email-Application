import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gather user input for first name, last name, and department
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter department (e.g., Sales, IT, HR): ");
        String department = scanner.nextLine();

        // Create an Email object with the user input
        Email email = new Email(firstName, lastName, department);

        // Ask if the user wants to set an alternate email
        System.out.print("Would you like to set an alternate email (yes/no)? ");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            System.out.print("Enter alternate email (Personal Email): ");
            String alternateEmail = scanner.nextLine();
            email.setAlternateEmail(alternateEmail);
        }

        // Ask if the user wants to set mailbox capacity
        System.out.print("Enter mailbox capacity in MB (default is 500MB): ");
        int mailboxCapacity = scanner.nextInt();
        email.setMailboxCapacity(mailboxCapacity);

        // Display the email details
        System.out.println("\n--- Email Created Successfully ---");
        System.out.println("Email Address: " + email.showInfo());
        System.out.println("Password: " + email.getPassword());
        System.out.println("Mailbox Capacity: " + email.getMailboxCapacity() + "MB");

        // If an alternate email was set, display it
        if (email.getAlternateEmail() != null && !email.getAlternateEmail().isEmpty()) {
            System.out.println("Alternate Email: " + email.getAlternateEmail());
        }

        scanner.close();
    }
}