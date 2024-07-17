class BankAccount1{
	static double balance;
	public static void debit(double amount){
		System.out.println("Debit Started");
		if(amount<=balance){
		balance = balance - amount;
		}else{
			System.out.println("Insufficient funds");
		}
		System.out.println("Debit Started");
		return ;

	}
	public static void credit(double amount){
		System.out.println("Debit Started");
		if(amount>0){
		balance = balance + amount;
		}else{
			System.out.println("The balance is");
		}
		System.out.println("Debit Started");
		return ;
	}
    public static double getBalance(){
		
	System.out.println("Fetching Balance");
	return 0.0;
	}
	}