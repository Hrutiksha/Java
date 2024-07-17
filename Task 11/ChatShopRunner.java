class ChatShopRunner{
public static void main(String[]shop){
	
boolean isAdded = ChatShop.createChatName("pani puri");
System.out.println("The chat name is " +isAdded);

isAdded = ChatShop.createChatName("bhel puri");
System.out.println("The chat name is " +isAdded);

 isAdded =ChatShop.createChatName("sev puri");
System.out.println("The chat name is " +isAdded);

 isAdded =ChatShop.createChatName("Dahi puri");
System.out.println("The chat name is " +isAdded);

 isAdded= ChatShop.createChatName("Masala puri");
System.out.println("The chat name is " +isAdded);

          ChatShop.getChatNames();
		  
		  boolean isUpdated = ChatShop.updateChatName("sev puri","Tikki puri");
		  System.out.println("The chat name is " +isUpdated);
		  
		  
		  ChatShop.getChatNames();
 }
 }