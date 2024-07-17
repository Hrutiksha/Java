class GoldShopRunner{
public static void main(String []gold){

boolean isAdded = GoldShop.createGoldItems("Bangles");
System.out.println("Added gold item is :" +isAdded);

isAdded = GoldShop.createGoldItems("Necklace");
System.out.println("Added gold item is :" +isAdded);

isAdded = GoldShop.createGoldItems("Ear ring");
System.out.println("Added gold item is :" +isAdded);

isAdded = GoldShop.createGoldItems("Anklet");
System.out.println("Added gold item is :" +isAdded);

isAdded = GoldShop.createGoldItems("Chain");
System.out.println("Added gold item is :" +isAdded);

isAdded = GoldShop.createGoldItems("Nose pin");
System.out.println("Added gold item is :" +isAdded);

isAdded = GoldShop.createGoldItems("Armlet");
System.out.println("Added gold item is :" +isAdded);


     GoldShop.getGoldItems();
	 
        boolean isUpdated = GoldShop. updateGoldItem("Armlet","Bracelet");
		  System.out.println("The gold item is " +isUpdated);
		  
		   GoldShop.getGoldItems();
		   
		   GoldShop.deleteGoldItem("Nose pin");
		    GoldShop.getGoldItems();
		   
		   
		   
    }
}