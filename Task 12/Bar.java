import java.util.Arrays;
class Bar{
static String name = "Baar";
static String wineBrands[] ={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
static int index;

public static boolean addWineBrandNames(String wineBrand){
System.out.println("Create wine brand names started");
boolean isBrandNameCreated =false;
if(index < wineBrands.length){
        if(wineBrand!=null){
	   
          wineBrands[index] = wineBrand;
          index++;
          isBrandNameCreated =true;
   }else
	   System.out.println("Wine brand is null ,cannot be found");
   }else{
	   System.out.println("Wine brands are full");
   }
   
   System.out.println("create Wine brand names ended");
   return  isBrandNameCreated;
   }
   
   
   public static boolean updateWineBrandName(String oldWineBrandName, String newWineBrandName){
	   System.out.println("update operation Started");
	    boolean isBrandNameUpdated = false;
		for(int index =0;index < wineBrands.length;index++){
			if(oldWineBrandName == wineBrands[index]){
				wineBrands[index] = newWineBrandName;
				isBrandNameUpdated = true;
			}
		}
    if(isBrandNameUpdated  == false){
        System.out.println(oldWineBrandName +"Not Found");
	} 		
	   System.out.println("update operation Ended");
        return isBrandNameUpdated;
   }		
   public static void getWineBrandName(){
   System.out.println("The available Brand Names are :");
   for(String wineBrand : wineBrands){
   System.out.println(wineBrand);
   }
  }
  public static boolean deleteBarBrandName(String barNameToBeDeleted){
	 System.out.println("Delete brand name started");
	 boolean isBarNameDeleted = false;
	 int newIndex, oldIndex;
	 for(newIndex=0 ,oldIndex=0 ;oldIndex<wineBrands.length; oldIndex++){
        if(wineBrands[oldIndex] !=  barNameToBeDeleted)
		{
           wineBrands[newIndex] =wineBrands[oldIndex];
		   newIndex++;
		}
	 }
       wineBrands = Arrays.copyOf(wineBrands,newIndex);
        if(wineBrands != null){
           isBarNameDeleted = true;
		}
    if(isBarNameDeleted == false){
        System.out.println( barNameToBeDeleted + "not found");
	}
    System.out.println("Delete brand name ended");
       return isBarNameDeleted;	
 }	   
 } 