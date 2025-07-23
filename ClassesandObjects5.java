/*Create a class AccountHolder with -
Instance variables - account number, account holder name, account balance
Class methods - constructors, getter/setter methods, deposite, withdraw
Create an array of AccountHolder objects in main.
Write a menu driven program to perform -
1. Add record for account holder
2. Display details of all account holders.
3. Deposite an amount into perticular account
4. Withdraw an amount from perticular account*/

import java.util.Scanner;

class AccountHolder{
    int account_number;
    String account_holder_name;
    int account_balance;

      public AccountHolder(int account_number, String account_holder_name, int account_balance) {
        this.account_number = account_number;
        this.account_holder_name = account_holder_name;
        this.account_balance = account_balance;
    }

    public int getAccount_number() {
        return account_number;
    }
    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }
    public String getAccount_holder_name() {
        return account_holder_name;
    }
    public void setAccount_holder_name(String account_holder_name) {
        this.account_holder_name = account_holder_name;
    }
    public int getAccount_balance() {
        return account_balance;
    }
    public void setAccount_balance(int account_balance) {
        this.account_balance = account_balance;
    } 

    public void deposit(int amount) {
        if (amount > 0) {
            account_balance = account_balance + amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(int amount){
        if( account_balance > 0 && account_balance >= amount){
            account_balance = account_balance - amount;
             System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayDetails() {
        System.out.println("Account Number: " + account_number);
        System.out.println("Account Holder Name: " + account_holder_name);
        System.out.println("Account Balance: " + account_balance);
        System.out.println("---------------------------");
    }
}


public class ClassesandObjects5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountHolder[] accounts = new AccountHolder[100]; 
        int count = 0; 

        while(true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add record for account holder");
            System.out.println("2. Display details of all account holders");
            System.out.println("3. Deposit an amount into particular account");
            System.out.println("4. Withdraw an amount from particular account");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            if(choice == 1) {
                System.out.print("Enter Account Number: ");
                int accNo = sc.nextInt();
                sc.nextLine(); // consume newline
                System.out.print("Enter Account Holder Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Initial Account Balance: ");
                int balance = sc.nextInt();

                accounts[count++] = new AccountHolder(accNo, name, balance);
                System.out.println("Account record added successfully.");

            } else if(choice == 2) {
                if(count == 0) {
                    System.out.println("No account holders to display.");
                } else {
                    for(int i=0; i<count; i++) {
                        accounts[i].displayDetails();
                    }
                }

            } else if(choice == 3) {
                System.out.print("Enter Account Number to deposit: ");
                int accNo = sc.nextInt();
                boolean found = false;

                for(int i=0; i<count; i++) {
                    if(accounts[i].getAccount_number() == accNo) {
                        System.out.print("Enter amount to deposit: ");
                        int amount = sc.nextInt();
                        accounts[i].deposit(amount);
                        found = true;
                        break;
                    }
                }
                if(!found) {
                    System.out.println("Account not found.");
                }

            } else if(choice == 4) {
                System.out.print("Enter Account Number to withdraw from: ");
                int accNo = sc.nextInt();
                boolean found = false;

                for(int i=0; i<count; i++) {
                    if(accounts[i].getAccount_number() == accNo) {
                        System.out.print("Enter amount to withdraw: ");
                        int amount = sc.nextInt();
                        accounts[i].withdraw(amount);
                        found = true;
                        break;
                    }
                }
                if(!found) {
                    System.out.println("Account not found.");
                }

            } else if(choice == 5) {
                System.out.println("Exiting program. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }

        sc.close();
    }
}