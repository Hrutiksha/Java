import java.util.Arrays;
class Gym{
	static String gymEquipments[] = {null, null, null, null, null, null, null, null};
	static int gymIndex;
	
	public static boolean createGymEquipment(String gymEquipment){
		boolean isEquipmentAdded = false;
		if(gymEquipment != null){
			gymEquipments[gymIndex] = gymEquipment;
			gymIndex++;
			isEquipmentAdded = true;
		}else
			System.out.println("Provide equipment name....");
			return isEquipmentAdded;
		
		
	}
	
	 public static boolean updateGymEquipment(String oldgymEquipment, String newgymEquipment){
	   System.out.println("update operation Started");
	    boolean isGymEquipmentUpdated = false;
		for(int index =0;index < gymEquipments.length;index++){
			if(oldgymEquipment == gymEquipments[index]){
				gymEquipments[index] = newgymEquipment;
				isGymEquipmentUpdated = true;
			}
		}
    if(isGymEquipmentUpdated == false){
        System.out.println(oldgymEquipment +"Not Found");
	} 		
	   System.out.println("update operation Ended");
        return isGymEquipmentUpdated;
   }		
   
   
	public static void getGymEquipments(){
		for(String gymEquipment : gymEquipments){
			System.out.println(gymEquipment);
		}
		
	}
	
	public static boolean deleteGymEquipment(String GymEquipmentToBeDeleted){
	 System.out.println("Delete Gym Equipment started");
	 boolean isGymEquipmentDeleted = false;
	 int newIndex, oldIndex;
	 for(newIndex=0 ,oldIndex=0 ;oldIndex<gymEquipments.length; oldIndex++){
        if(gymEquipments[oldIndex] != GymEquipmentToBeDeleted)
		{
           gymEquipments[newIndex] = gymEquipments[oldIndex];
		   newIndex++;
		}
	 }
        gymEquipments = Arrays.copyOf(gymEquipments,newIndex);
        if(gymEquipments != null){
           isGymEquipmentDeleted = true;
		}
    if(isGymEquipmentDeleted == false){
        System.out.println(GymEquipmentToBeDeleted + "not found");
	}
    System.out.println("Delete Gym Equipment ended");
       return isGymEquipmentDeleted;	
 }	   

}