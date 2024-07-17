class DominosRunner{
	
	public static void main(String[] foo){
		
	double foodPrice = Dominos.takeOrder("corn and cheese pizza");
	System.out.println("The food price is"+foodPrice);
	
	double foodPrice1 = Dominos.takeOrder("onion and capsicum pizza");
	System.out.println("The food price is"+foodPrice1);
	
	double foodPriceWithQuantity = Dominos.takeOrder("onion and capsicum pizza",8);
	System.out.println("The onion and capsicum pizza price is"+foodPriceWithQuantity);
	    	
	}
}