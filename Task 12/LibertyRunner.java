class LibertyRunner{

public static void main(String[] shoe){

	boolean isAdded = Liberty.addShoeBrandNames("Adidas");
	System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Liberty.addShoeBrandNames("Alexander McQueen");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Liberty.addShoeBrandNames("Asics");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Liberty.addShoeBrandNames("Bata Corporation");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Liberty.addShoeBrandNames("Bearpaw");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Liberty.addShoeBrandNames("Ben Sherman");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Liberty.addShoeBrandNames("Berluti");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Liberty.addShoeBrandNames("Birkenstock");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Liberty.addShoeBrandNames("Camper");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Liberty.addShoeBrandNames("Cole Haan");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Liberty.addShoeBrandNames("Columbia Sportswear");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Liberty.addShoeBrandNames("Converse");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Liberty.addShoeBrandNames("Crocs");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Liberty.addShoeBrandNames("ECC0");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Liberty.addShoeBrandNames("Gucci");
System.out.println("Added Brand Name is :" +isAdded);


      Liberty.getAllShoeBrandName();
	   boolean isUpdated = Liberty.updateShoeBrandName("Camper","Fila");
		  System.out.println("The Brand name is " +isUpdated); 
			Liberty.getAllShoeBrandName();
			
			Liberty.deleteShoeBrandName("Crocs");
			Liberty.getAllShoeBrandName();
			
}
}