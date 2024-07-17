class Mixer{
static boolean isConnected = false;
public static void  onOrOff(){
	System.out.println("onOrOff Started");
	if(isConnected == false){
	isConnected =true;
	System.out.println("Mixer Turned on");
	}
	else if(isConnected == true){
	isConnected = false;
	System.out.println("Mixer Turned on");
	}
	{
		System.out.println("onOrOff Ended");
		return;
	}
  }
}