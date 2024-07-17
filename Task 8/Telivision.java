class Telivision{
static boolean isOn = false;
       static int  currentVolume  ; 
	   static  int    minVolume  ; 
        static int maxVolume  = 6 ;
  public static void  onOrOff(){
	System.out.println("onOrOff Started");
	if(isOn == false){
	isOn =true;
	System.out.println("Telivision Turned on");
	}
	else if(isOn == true){
	isOn = false;
	System.out.println("Telivision Turned off");
	}
	{
		System.out.println("onOrOff Ended");
		return;
	}
  }

public static void increaseVolume(){
    System.out.println("increaseVolume() started");
  if(isOn == true){
    if(currentVolume <= maxVolume	){
	    currentVolume = currentVolume + 1;
    System.out.println("The current Volume is " +currentVolume);	
}else{
	System.out.println("High Volume Reached");	
}
}else {
}
	System.out.println("increaseVolume() started");
	return;
   }
   }