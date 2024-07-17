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
	public static void getGymEquipments(){
		for(String gymEquipment : gymEquipments){
			System.out.println(gymEquipment);
		}
		
	}



}