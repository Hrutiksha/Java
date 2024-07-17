class Microwave{
static boolean isConnected = false;
       static int  currentTemperature  ; 
	   static  int    minTemperature  ; 
        static int maxTemperature  = 7 ;
  public static void  onOrOff(){
	System.out.println("onOrOff Started");
	if(isConnected == false){
	isConnected =true;
	System.out.println("Air Conditioner Turned on");
	}
	else if(isConnected == true){
	isConnected = false;
	System.out.println("Air Conditioner Turned on");
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
   }

