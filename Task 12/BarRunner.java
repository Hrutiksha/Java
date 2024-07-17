class BarRunner{

public static void main(String[] drink){

boolean isAdded = Bar.addWineBrandNames("Smirnoff");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Bar.addWineBrandNames("Kingfisher");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Bar.addWineBrandNames("Rum");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Bar.addWineBrandNames("Whiskey");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Bar.addWineBrandNames("Beer");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Bar.addWineBrandNames("Amrut");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Bar.addWineBrandNames("Fratelli");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Bar.addWineBrandNames("Sula");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Bar.addWineBrandNames("Big banyan");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Bar.addWineBrandNames("Charosa");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Bar.addWineBrandNames("Dia Red wine");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Bar.addWineBrandNames("Grover La Reserve");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Bar.addWineBrandNames("Krsma");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Bar.addWineBrandNames("York");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Bar.addWineBrandNames("Barefoot Cellars");
System.out.println("Added Brand Name is :" +isAdded);


      Bar.getWineBrandName();
	  
	   boolean isUpdated = Bar.updateWineBrandName("York","Myra Misfit");
		  System.out.println("The Brand name is " +isUpdated);
		  
		   Bar.getWineBrandName();
		   
		   Bar.deleteBarBrandName("York");
		Bar.getWineBrandName();
		   
    }

}	