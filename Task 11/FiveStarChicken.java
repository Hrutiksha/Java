class FiveStarChicken{
		
		
		public static double takeOrder(String foodName){
		
		if (foodName == "Chicken Kurma") return 360.00;

		if(foodName == "Chicken pulav") return 456.00;
		
		if(foodName == "Chicken lollipop") return 500.00;
		
		else System.out.println(foodName + " Not Found");
	
		return 0.0;
	}
		public static double takeOrder(String foodName,int quantity){		//changing of parameter is called method overloading
			double price=0.0;
			if(foodName == "Chicken Kurma")
			{
				price = 360.00 * quantity;
				return price; 
			}
			if(foodName == "Chicken pulav") {
				price = 456.00 * quantity;
				return price; 
			}
						if(foodName == "Chicken lollipop") {
				price = 500.00 * quantity;
				return price; 
			}
			return price;
		}

}