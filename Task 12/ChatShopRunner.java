class ChatShopRunner{
public static void main(String[]shop){
	
boolean isAdded = ChatShop.createChatName("pani puri");
System.out.println("The chat name is " +isAdded);
boolean priceAdded = ChatShop.addChatPrice(40.0);
System.out.println("is Chat Price added " +priceAdded);

isAdded = ChatShop.createChatName("bhel puri");
System.out.println("The chat name is " +isAdded);
priceAdded = ChatShop.addChatPrice(35.0);
System.out.println("is Chat Price added " +priceAdded);

 isAdded =ChatShop.createChatName("sev puri");
System.out.println("The chat name is " +isAdded);
priceAdded = ChatShop.addChatPrice(40.0);
System.out.println("is Chat Price added " +priceAdded);

 isAdded =ChatShop.createChatName("Dahi puri");
System.out.println("The chat name is " +isAdded);
priceAdded = ChatShop.addChatPrice(45.0);
System.out.println("is Chat Price added " +priceAdded);

 isAdded= ChatShop.createChatName("Masala puri");
System.out.println("The chat name is " +isAdded);
priceAdded = ChatShop.addChatPrice(30.0);
System.out.println("is Chat Price added " +priceAdded);

          ChatShop.getChatNames();
		  ChatShop.getChatPrice();
		  
		  boolean isUpdated = ChatShop.updateChatName("sev puri","Tikki puri");
		  System.out.println("The chat name is " +isUpdated);
		  
		  
		  ChatShop.getChatNames();
		  ChatShop.getChatPrice();
		  
		ChatShop.deleteChatName("Masala puri");
		ChatShop.getChatNames();
 }
 }