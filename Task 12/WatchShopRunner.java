class WatchShopRunner{
public static void main(String []gold){

boolean isAdded = WatchShop.createWatchBrandNames("Tag Heuer");
System.out.println("Added gold item is :" +isAdded);

isAdded = WatchShop.createWatchBrandNames("Blancpain");
System.out.println("Added gold item is :" +isAdded);

isAdded = WatchShop.createWatchBrandNames("Breitling");
System.out.println("Added gold item is :" +isAdded);

isAdded = WatchShop.createWatchBrandNames("Cartier");
System.out.println("Added gold item is :" +isAdded);

isAdded = WatchShop.createWatchBrandNames("Casio");
System.out.println("Added gold item is :" +isAdded);

isAdded = WatchShop.createWatchBrandNames("Chopard");
System.out.println("Added gold item is :" +isAdded);

isAdded = WatchShop.createWatchBrandNames("Grand Seiko");
System.out.println("Added gold item is :" +isAdded);

isAdded = WatchShop.createWatchBrandNames("Panerai");
System.out.println("Added gold item is :" +isAdded);

isAdded = WatchShop.createWatchBrandNames("Certina");
System.out.println("Added gold item is :" +isAdded);

isAdded = WatchShop.createWatchBrandNames("Charriol");
System.out.println("Added gold item is :" +isAdded);




     WatchShop.getWatchBrandNames();
	 
        boolean isUpdated = WatchShop. updateWatchBrandNames("Charriol","Bell and Rose");
		  System.out.println("The gold item is " +isUpdated);
		  
		   WatchShop.getWatchBrandNames();
		   
		   
    }
}