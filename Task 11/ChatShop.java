class ChatShop{
   static String name ="Sri";
   static String ownerName ="";
  static String chatNames[]={null,null,null,null,null};
   static int index;
   
   public static boolean createChatName(String chatName){
	   System.out.println("create chat name started");
   boolean isChatNameCreated = false;
   if(index < chatNames.length){
        if(chatName!=null){
	   
          chatNames[index] = chatName;
          index++;
          isChatNameCreated =true;
   }else
	   System.out.println("Chat name is null ,cannot be found");
   }else{
	   System.out.println("Chats are full");
   }
   
   System.out.println("create chat name ended");
   return  isChatNameCreated;
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
 
}