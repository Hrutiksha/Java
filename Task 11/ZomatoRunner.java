class ZomatoRunner{
	
	public static void main(String[] foo){
		
	double foodPrice = Zomato.takeOrder("Chicken Popcorn");
	System.out.println("The food price is"+foodPrice);
	
	double foodPrice1 = Zomato.takeOrder("Chicken Drumstick");
	System.out.println("The food price is"+foodPrice1);
	
	double foodPriceWithQuantity = Zomato.takeOrder("Chicken Drumstick",4);
	System.out.println("The Chicken Drumstickprice is"+foodPriceWithQuantity);
	    	
	}
}