class AirConditioner{
static boolean isConnected = false;
       static int  currentTemperature  ;  
        static int maxTemperature  = 6 ;
		static  int  minTemperature;
  public static void  onOrOff(){
	System.out.println("onOrOff Started");
	if(isConnected == false){
	isConnected =true;
	System.out.println("Air Conditioner Turned on");
	}
	else if(isConnected == true){
	isConnected = false;
	System.out.println("Air Conditioner Turned off");
	}
	{
		System.out.println("onOrOff Ended");
		return;
	}
  }

public static void increaseTemperature(){
    System.out.println("increaseTemperature() started");
  if(isConnected == true){
    if(currentTemperature <= maxTemperature	){
	    currentTemperature = currentTemperature + 1;
    System.out.println("The current temperature is " +currentTemperature);	
}else{
	System.out.println("Max Temperature Reached");	
}
}else {
}
	System.out.println("increaseTemperature() started");
	return;
   }
   
public static void decreaseTemperature(){
    System.out.println("decreaseTemperature() started");
	if(isConnected == true){
		if(currentTemperature >= minTemperature){
			currentTemperature = currentTemperature-1;
			System.out.println("The current temperature is " +currentTemperature);	
}else{
	System.out.println("Min Temperature Reached");	
}
}else {
}
	System.out.println("decreaseTemperature()ended");
	return;
   }
  

  public static void getFeatures(){
   System.out.println("getFeatures() Started"); 
   String name = "Samsung";
   double price = 7000.00;
   System.out.println("The name of the Air Conditioner is:" +name);
    System.out.println("The Price  of the Air Conditioner is:" +price);
     System.out.println("Get Features Ended") ;
	 return;

   }
}