class FoodPanda{
		
		
		public static double takeOrder(String foodName){
		
		if (foodName == "Noodles") return 124.00;

		if(foodName == "Fried rice") return 67.00;
		
		if(foodName == "Ghee Rice") return 120.00;
		
		else System.out.println(foodName + " Not Found");
	
		return 0.0;
	}
		public static double takeOrder(String foodName,int quantity){		//changing of parameter is called method overloading
			double price=0.0;
			if(foodName == "Pizza")
			{
				price = 124.00 * quantity;
				return price; 
			}
			if(foodName == "Burger") {
				price = 67.00 * quantity;
				return price; 
			}
						if(foodName == "Momos") {
				price = 120.00 * quantity;
				return price; 
			}
			return price;
		}

}