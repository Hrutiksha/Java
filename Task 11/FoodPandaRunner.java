class FoodPandaRunner{
	
	public static void main(String[] foo){
		
	double foodPrice = FoodPanda.takeOrder("Fried Rice");
	System.out.println("The food price is"+foodPrice);
	
	double foodPrice1 = FoodPanda.takeOrder("Ghee Rice");
	System.out.println("The food price is"+foodPrice1);
	
	double foodPriceWithQuantity = FoodPanda.takeOrder("Noodles",4);
	System.out.println("The Noodles is"+foodPriceWithQuantity);
	    	
	}
}