import java.util.Arrays;

class ChatShop{
   static String name ="Sri";
   static String ownerName ="";
  static String chatNames[]={null,null,null,null,null};
  static double chatPrices[] ={0.0,0.0,0.0,0.0,0.0};
   static int chatNameindex;
   static int chatPriceindex;
   
   public static boolean createChatName(String chatName){
	   System.out.println("create chat name started");
   boolean isChatNameCreated = false;
   if(chatNameindex < chatNames.length){
        if(chatName!=null){
	   
          chatNames[chatNameindex] = chatName;
          chatNameindex++;
          isChatNameCreated =true;
   }else
	   System.out.println("Chat name is null ,cannot be found");
   }else{
	   System.out.println("Chats are full");
   }
   
   System.out.println("create chat name ended");
   return  isChatNameCreated;
   }
   
   
   public static boolean addChatPrice(double chatPrice){
	   System.out.println("create chat price started");
   boolean isPriceAdded = false;
   if(chatPrice > 0.0){
	   
          chatPrices[chatPriceindex] = chatPrice;
          chatPriceindex++;
          isPriceAdded =true;
   }else
	
   
   System.out.println("create chat price ended");
   return  isPriceAdded;
   }
   
   
   public static boolean updateChatName(String oldChatName, String newChatName){
	   System.out.println("update operation Started");
	    boolean isChatNameUpdated = false;
		for(int index =0;index < chatNames.length;index++){
			if(oldChatName == chatNames[index]){
				chatNames[index] = newChatName;
				isChatNameUpdated = true;
			}
		}
    if(isChatNameUpdated == false){
        System.out.println(oldChatName +"Not Found");
	} 		
	   System.out.println("update operation Ended");
        return isChatNameUpdated;
   }		
   public static void getChatNames(){
   System.out.println("The available Chat names are :");
   for(String chatName : chatNames){
   System.out.println(chatName);
   }
 }
   
   public static void getChatPrice(){
	   System.out.println("The available Chat price are :");
   for(double chatPrice : chatPrices){
   System.out.println(chatPrice);
   }
 }
 
 public static boolean deleteChatName(String chatNameToBeDeleted){
	 System.out.println("Delete chat name started");
	 boolean isChatNameDeleted = false;
	 int newIndex, oldIndex;
	 for(newIndex=0 ,oldIndex=0 ;oldIndex<chatNames.length; oldIndex++){
        if(chatNames[oldIndex] != chatNameToBeDeleted)
		{
           chatNames[newIndex] = chatNames[oldIndex];
		   newIndex++;
		}
	 }
        chatNames = Arrays.copyOf(chatNames,newIndex);
        if(chatNames != null){
           isChatNameDeleted = true;
		}
    if(isChatNameDeleted == false){
        System.out.println(chatNameToBeDeleted + "not found");
	}
    System.out.println("Delete chat name ended");
       return isChatNameDeleted;	
 }	   
}