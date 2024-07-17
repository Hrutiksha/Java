class Xworkz {
  
   static String userNm;
   static String psw;
   static int ag;
   static String eml;
   static String plc;
   static String dobirth;
    
	 public static boolean createXworkzRegistration(String userName,String password, int age,String email,String place,String dob) {
	   
	    boolean isAccountCreated=false;
		boolean isuserNamevalid=false;
		boolean ispasswordvalid=false;
		boolean isagevalid=false;
		boolean isemailvalid=false;
		boolean isplacevalid=false;
		boolean isdobvalid=false;
		
		

		if(userName	!= null){
				userNm=userName;
					isuserNamevalid=true;
		}else{
			  System.out.println("Please provide valid userName");
		}
		if(password	!= null){
				psw=password;
					ispasswordvalid=true;
		}else{
			  System.out.println("Please provide valid password");
		}
		if(age!= 0){
				ag=age;
					isagevalid=true;
		}else{
			  System.out.println("Please provide valid age");
		}
		if(email!= null){
				eml=email;
					isemailvalid=true;
		}else{
			  System.out.println("Please provide valid email");
		}
		if(place!= null){
				plc=place;
					isplacevalid=true;
		}else{
			  System.out.println("Please provide valid place");
		}	
		if(dob!=null){
		        dobirth=dob;
				   isdobvalid=true;
		}else{
		       System.out.println("please provide valid dob");
	    }
		if(isuserNamevalid && ispasswordvalid && isagevalid && isemailvalid && isplacevalid && isdobvalid){
				isAccountCreated = true;
		}
	return isAccountCreated;
		}
		 public static void getXworkzDetails(){
		 System.out.println("Enter your registering details");
		 System.out.println("The username is :" + userNm);
		 System.out.println("The password is :" + psw);
		 System.out.println("The age is:" + ag);
		 System.out.println("The email is :" +eml);
		 System.out.println("The place is:"+plc);
		 System.out.println("The date of birth is:"+dobirth);
		
	}
}