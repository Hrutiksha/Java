import java.util.Arrays;
class GoldShop{
static String name = "Vasavi";
static String goldItems[] ={null,null,null,null,null,null,null};
static int index;

public static boolean createGoldItems(String goldItem){
System.out.println("Create gold items started");
boolean isGoldItemCreated =false;
if(index < goldItems.length){
        if(goldItem!=null){
	   
          goldItems[index] = goldItem;
          index++;
          isGoldItemCreated =true;
   }else
	   System.out.println("Gold item  is null ,cannot be found");
   }else{
	   System.out.println("gold items are full");
   }
   
   System.out.println("create gold items ended");
   return  isGoldItemCreated;
   }
   
   
   public static boolean updateGoldItem(String oldGoldItem, String newGoldItem){
	   System.out.println("update operation Started");
	    boolean isGoldItemUpdated = false;
		for(int index =0;index < goldItems.length;index++){
			if(oldGoldItem == goldItems[index]){
				goldItems[index] = newGoldItem;
				isGoldItemUpdated = true;
			}
		}
    if(isGoldItemUpdated  == false){
        System.out.println(oldGoldItem +"Not Found");
	} 		
	   System.out.println("update operation Ended");
        return isGoldItemUpdated;
   }		
   public static void getGoldItems(){
   System.out.println("The available Gold items are :");
   for(String goldItem : goldItems){
   System.out.println(goldItem);
   }
  }
   
public static boolean deleteGoldItem(String goldItemToBeDeleted){
	 System.out.println("Delete goldItem name started");
	 boolean isGoldItemDeleted = false;
	 int newIndex, oldIndex;
	 for(newIndex=0 ,oldIndex=0 ;oldIndex<goldItems.length; oldIndex++){
        if(goldItems[oldIndex] != goldItemToBeDeleted)
		{
           goldItems[newIndex] = goldItems[oldIndex];
		   newIndex++;
		}
	 }
        goldItems = Arrays.copyOf(goldItems,newIndex);
        if(goldItems != null){
           isGoldItemDeleted = true;
		}
    if(isGoldItemDeleted == false){
        System.out.println(goldItemToBeDeleted + "not found");
	}
    System.out.println("Delete goldname ended");
       return isGoldItemDeleted;	
 }	   
}   