class Lenskart{
	
	static String frameSize;
	static String coloR;
	static String lenseType;
	static String mFgDate;
	static String warrentY;
	static int cost;
	
	
	//method declaration
	public static boolean generateBill(String framesize,String color,String lensetype,
	String mfgdate ,String warrenty,int cosT ){
		boolean isLenskartDataCreated = false;
	frameSize=framesize;
	coloR=color;
	lenseType=lensetype;
	mFgDate=mfgdate;
	warrentY=warrenty;
	cost=cosT;
			
						
					
	return isLenskartDataCreated;
	}
			
		    public static void getLenskartDetails(){	
				
				
				System.out.println("the framesize is:"+frameSize);
				System.out.println("the color is :"+coloR);
				System.out.println("the lensetype is :"+lenseType);
				System.out.println("the manufacture date is:"+mFgDate);
				System.out.println("the duration of warrenty is:"+warrentY);
				System.out.println("the cost is:"+cost);
				

			}

}