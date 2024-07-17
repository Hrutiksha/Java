class FiveStarChickenRunner{
	
	public static void main(String[] foo){
		
	double foodPrice = FiveStarChicken.takeOrder("Chicken Kurma");
	System.out.println("The food price is"+foodPrice);
	
	double foodPrice1 = FiveStarChicken.takeOrder("Chicken pulav");
	System.out.println("The food price is"+foodPrice1);
	
	double foodPriceWithQuantity = FiveStarChicken.takeOrder("Chicken pulav",8);
	System.out.println("The Chicken pulav price is"+foodPriceWithQuantity);
	    	
	}
}