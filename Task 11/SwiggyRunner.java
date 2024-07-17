class SwiggyRunner{
	
	public static void main(String[] foo){
		
	double foodPrice = Swiggy.takeOrder("Burger");
	System.out.println("The food price is"+foodPrice);
	
	double foodPrice1 = Swiggy.takeOrder("Momos");
	System.out.println("The food price is"+foodPrice1);
	
	double foodPriceWithQuantity = Swiggy.takeOrder("Burger",4);
	System.out.println("The Burger price is"+foodPriceWithQuantity);
	    	
	}
}