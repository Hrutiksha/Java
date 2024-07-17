class BlinkitRunner{
	
	public static void main(String[] foo){
		
	double foodPrice = Blinkit.takeOrder("Sugar");
	System.out.println("The food price is"+foodPrice);
	
	double foodPrice1 = Blinkit.takeOrder("Cakes");
	System.out.println("The food price is"+foodPrice1);
	
	double foodPriceWithQuantity = Blinkit.takeOrder("Sugar",4);
	System.out.println("The Cake price is"+foodPriceWithQuantity);
	    	
	}
}