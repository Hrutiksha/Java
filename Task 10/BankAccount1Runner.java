class BankAccount1Runner{
public static void main(String[] args){
 System.out.println("Main Method Started");
 double ref = BankAccount1.getBalance();
  System.out.println("ref");
 BankAccount1.credit(60000);
  ref = BankAccount1.getBalance();
 System.out.println("ref");
 BankAccount1.credit(200);
  ref = BankAccount1.getBalance();
  System.out.println("ref");
 BankAccount1.debit(600);
  ref = BankAccount1.getBalance();
  System.out.println("ref");
 BankAccount1.credit(8000);
  ref = BankAccount1.getBalance();
  System.out.println("ref");
 BankAccount1.credit(8000);
  ref = BankAccount1.getBalance();
  System.out.println("ref");
 BankAccount1.debit(160000);
 System.out.println("Main Method Ended");
   }
 }
 