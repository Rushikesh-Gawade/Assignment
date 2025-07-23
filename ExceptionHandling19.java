/*Create a class Account with -
Instance variable - balance
Class methods - deposite/withdraw
User withdrawal limit on one transaction is Rs.15000/-
Throw and Handle Exceptions -
1. OverLimit - when user tries to withdraw more than Rs. 15000/- in a transaction
2. InsufficientBalance - When user withdrawal amount is more than existing balance*/
class Account{
    private int balance;

    public void deposit(int amount){
        balance = balance + amount;
        System.out.println("Balance " + balance);
    }

    public void withdraw(int amount){
        if(amount <= balance){
            if( amount > 15000 ){
              throw new RuntimeException("Very big ammount");
            }
            amount = amount - balance;
            System.out.println(balance);
        }else{
            System.out.println("InsufficientBalance");
        }
    }
}

public class ExceptionHandling19 {
    public static void main(String[] args) {
      Account obj = new Account();
      obj.deposit(20000);
      try {
        obj.withdraw(16000);
      } catch (Exception e) {
        System.out.println("less then 15K");
      }  

      System.out.println("jhggh");
    }
}
