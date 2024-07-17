class Dominos{
		
		
		public static double takeOrder(String foodName){
		
		if (foodName == "corn and cheese pizza") return 250.00;

		if(foodName == "margherita") return 199.00;
		
		if(foodName == "onion and capsicum pizza") return 300.00;
		
		else System.out.println(foodName + " Not Found");
	
		return 0.0;
	}
		public static double takeOrder(String foodName,int quantity){		//changing of parameter is called method overloading
			double price=0.0;
			if(foodName == "corn and cheese pizza")
			{
				price = 250.00 * quantity;
				return price; 
			}
			if(foodName == "margherita") {
				price = 199.00 * quantity;
				return price; 
			}
						if(foodName == "onion and capsicum pizza") {
				price = 300.00 * quantity;
				return price; 
			}
			return price;
		}

}