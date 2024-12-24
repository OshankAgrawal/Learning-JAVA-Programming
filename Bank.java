import java.util.Scanner;

class Account {
    private double currentbalance;
    
    public void BankAccount(double initialBalance) {
        this.currentbalance = initialBalance;
    }
    
    public double getBalance() {
        return currentbalance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            currentbalance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= currentbalance) {
            currentbalance -= amount;
            System.out.println("Withdrawn $" + amount);        
        } else {
            System.out.println("Invalid Withdrawn amount or Insufficient balance.");
        }
    }
}

class ATM {
    Account account=new Account();

    // Method to display the different functions of ATM
    public void displayMenu() {
         System.out.println("welcome to the ATM!\nEnter:\n1. For Check the balance.\n2. For deposit the amount in account.\n3. For withdraw the amount from the account.\n4. For EXIT form ATM services(Close the current session of the ATM)"); 
    }
    
    public void start() {
        Scanner scanner = new Scanner(System.in);

        // Insert the initial balance in the account
        System.out.println("Enter the initial amount of the account...");
        double initialBalance=scanner.nextDouble();
        account.BankAccount(initialBalance);

        // Display the function of ATM
        displayMenu();
        
        // Insert the choice of user
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:{
                // Call the method of Account class to check the current balance of account
                System.out.println("Balance: $" + account.getBalance());
                break;
            }
            case 2:{
                // Call the method of Account class to deposit the amount in the account
                System.out.print("Enter deposit amount: $");
                double depositAmount = scanner.nextDouble();
                account.deposit(depositAmount);
                break;
            }
            case 3:{
                // Call the method of Account class to withdraw the amount in the account
                System.out.print("Enter withdrawn amount: $");
                double withdrawAmount = scanner.nextDouble();
                account.withdraw(withdrawAmount);
                break;
            }
            case 4:{
                System.out.print("Thank you for using the ATM!  Visit Again...");
                scanner.close();
                return;
            }
            default:{
                System.out.println("Invalid choice. Please select a valid option.");
            }     
        }
        System.out.println("Do you want to check the current balance of account");
        System.out.println("1. Yes, I want to check the current balance.\n2. No, I don't want to check the current balance.");
        int num2 = scanner.nextInt();
        if (num2 == 1){
            account.getBalance();
            System.out.print("Thank you for using the ATM!  Visit Again...");
        } else{
            System.out.print("Thank you for using the ATM!  Visit Again...");
            scanner.close();
        }
        
    }
}

public class Bank{
    public static void main(String[] args) {
        ATM atm=new ATM();
        atm.start();
    }
}