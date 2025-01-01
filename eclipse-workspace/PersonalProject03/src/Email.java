import java.util.Random;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int mailboxCapacity;
    private String alternateEmail;

    // Constructor to initialize employee's details and generate email account
    public Email(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.password = generateRandomPassword(); // Generate random password
        this.mailboxCapacity = 500; // Default mailbox capacity in MB
    }

    // Method to generate a random password
    private String generateRandomPassword() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        Random rnd = new Random();
        StringBuilder password = new StringBuilder(8);
        for (int i = 0; i < 8; i++) {
            password.append(chars.charAt(rnd.nextInt(chars.length())));
        }
        return password.toString();
    }

    // Method to set mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Method to set alternate email
    public void setAlternateEmail(String email) {
        this.alternateEmail = email;
    }

    // Method to get alternate email
    public String getAlternateEmail() {
        return alternateEmail;
    }

    // Method to return the email address
    public String showInfo() {
        return "Email: " + firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + ".company.com";
    }

    // Getter for password (just for displaying in case needed)
    public String getPassword() {
        return password;
    }

    // Getter for mailbox capacity
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }
}