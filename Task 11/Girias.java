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
	
	public static boolean deleteHomeApp;iances(String HomeAppliancesToBeDeleted){
	 System.out.println("Delete home appliances started");
	 boolean isHomeApplianceDeleted = false;
	 int newIndex, oldIndex;
	 for(newIndex=0 ,oldIndex=0 ;oldIndex<homeAppliances.length; oldIndex++){
        if(homeAppliances[oldIndex] != HomeAppliancesToBeDeleted)
		{
           homeAppliances[newIndex] = homeAppliances[oldIndex];
		   newIndex++;
		}
	 }
        homeAppliances = Arrays.copyOf(homeAppliances,newIndex);
        if(homeAppliances != null){
           isHomeApplianceDeleted = true;
		}
    if(isHomeApplianceDeleted == false){
        System.out.println(HomeAppliancesToBeDeleted + "not found");
	}
    System.out.println("Delete Home appliances ended");
       return isHomeApplianceDeleted;	
 }	   




}