class Zepto{
		
		
		public static double takeOrder(String foodName){
		
		if (foodName == "cheese") return 124.00;

		if(foodName == "Panner") return 67.00;
		
		if(foodName == "Milk Powder") return 120.00;
		
		else System.out.println(foodName + " Not Found");
	
		return 0.0;
	}
		public static double takeOrder(String foodName,int quantity){		//changing of parameter is called method overloading
			double price=0.0;
			if(foodName == "cheese")
			{
				price = 124.00 * quantity;
				return price; 
			}
			if(foodName == "Panner") {
				price = 67.00 * quantity;
				return price; 
			}
						if(foodName == "Milk Powder") {
				price = 120.00 * quantity;
				return price; 
			}
			return price;
		}

}