class Swiggy{
		
		
		public static double takeOrder(String foodName){
		
		if (foodName == "Pizza") return 99.00;

		if(foodName == "Burger") return 120.00;
		
		if(foodName == "Momos") return 80.00;
		
		else System.out.println(foodName + " Not Found");
	
		return 0.0;
	}
		public static double takeOrder(String foodName,int quantity){		//changing of parameter is called method overloading
			double price=0.0;
			if(foodName == "Pizza")
			{
				price = 99.00 * quantity;
				return price; 
			}
			if(foodName == "Burger") {
				price = 120.00 * quantity;
				return price; 
			}
						if(foodName == "Momos") {
				price = 80.00 * quantity;
				return price; 
			}
			return price;
		}

}