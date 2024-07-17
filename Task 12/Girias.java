import java.util.Arrays;
class Girias{
	static String homeAppliances[] = {null, null, null, null, null, null, null, null, null, null, null, null};
	static int index;
	
	public static boolean createHomeAppliance(String homeAppliance){
	boolean isHomeApplianceAdded = false;
	if(homeAppliance != null){
	homeAppliances[index] = homeAppliance;
	index++;
	isHomeApplianceAdded = true;
	}else
	System.out.println("Plz provide appliances name .....");
	return isHomeApplianceAdded;
	}
	
	public static void getDetails(){
		for(String homeAppliance : homeAppliances){
			System.out.println(homeAppliance);
		}
	}
	
	public static boolean deleteApplianceName(String applianceNameToBeDeleted){
	 System.out.println("Delete appliance name started");
	 boolean isApplianceNameDeleted = false;
	 int newIndex, oldIndex;
	 for(newIndex=0 ,oldIndex=0 ;oldIndex<homeAppliances.length; oldIndex++){
        if(homeAppliances[oldIndex] !=  applianceNameToBeDeleted)
		{
           homeAppliances[newIndex] =homeAppliances[oldIndex];
		   newIndex++;
		}
	 }
      homeAppliances = Arrays.copyOf(homeAppliances,newIndex);
        if(homeAppliances != null){
           isApplianceNameDeleted = true;
		}
    if(isApplianceNameDeleted == false){
        System.out.println( applianceNameToBeDeleted + "not found");
	}
    System.out.println("Delete appliance name ended");
       return isApplianceNameDeleted;	
 }	   




}