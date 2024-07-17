class Zomato{

    public static double takeOrder(String foodName){
		
		if (foodName == "Chocolate") return 40.00;

		if(foodName == "Chicken popcorn") return 120.00;
		
		if(foodName == "Chicken Drumstick") return 160.00;
		
		if(foodName == "Biriyani") return 180.00;
		
		if(foodName == "Fries") return 200.00;
		
		else System.out.println(foodName + " Not Found");
	
		return 0.0;
	}
		public static double takeOrder(String foodName,int quantity){		//changing of parameter is called method overloading
			double price=0.0;
			if(foodName == "Chocolate"){
				price = 40.00 * quantity;
				return price; 
			}
			if(foodName == "Chicken popcorn") {
				price = 120.00 * quantity;
				return price; 
			}
						if(foodName == "Chicken Drumstick") {
				price = 160.00 * quantity;
				return price; 
			}
			if(foodName == "Biriyani") {
				price = 180.00 * quantity;
				return price; 
			}
			if(foodName == "Fries") {
				price = 200.00 * quantity;
				return price; 
			}
			return price;
		}
}