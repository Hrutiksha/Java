 class Blinkit{

    public static double takeOrder(String foodName){
		
		if (foodName == "Sugar") return 40.00;

		if(foodName == "Tea") return 56.00;
		
		if(foodName == "Milk") return 120.00;
		
		if(foodName == "Coffee") return 70.00;
		
		if(foodName == "Bag") return 80.00;
		
		else System.out.println(foodName + " Not Found");
	
		return 0.0;
	}
		public static double takeOrder(String foodName,int quantity){		//changing of parameter is called method overloading
			double price=0.0;
			if(foodName == "Sugar"){
				price = 40.00 * quantity;
				return price; 
			}
			if(foodName == "Tea") {
				price = 56.00 * quantity;
				return price; 
			}
						if(foodName == "Milk") {
				price = 120.00 * quantity;
				return price; 
			}
			if(foodName == "Coffee") {
				price = 70.00 * quantity;
				return price; 
			}
			if(foodName == "Bag") {
				price = 80.00 * quantity;
				return price; 
			}
			return price;
		}
}