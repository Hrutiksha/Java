class ZeptoRunner{
	
	public static void main(String[] foo){
		
	double foodPrice = Zepto.takeOrder("Milk Powder");
	System.out.println("The food price is"+foodPrice);
	
	double foodPrice1 = Zepto.takeOrder("cheese");
	System.out.println("The food price is"+foodPrice1);
	
	double foodPriceWithQuantity = Zepto.takeOrder("cheese",4);
	System.out.println("The cheese price is"+foodPriceWithQuantity);
	    	
	}
}