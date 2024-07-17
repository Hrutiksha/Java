class Instagram {
	static String usrn;
	static String pwd;
	static String dob;
	static String ag;
	static String plac;


public static boolean createInstagramAccount(String userName,String password,String dateOfBirth,String age,String place){
	boolean isAccountCreated=false;
	boolean isuserNamevalid = false;
	boolean ispasswordvalid = false;
	boolean isdateOfBirthvalid = false;
	boolean isplacevalid = false;
	boolean isagvalid = false;

		if(userName	!= null){
				usrn=userName;
					isuserNamevalid=true;
		}else{
			  System.out.println("Please provide valid dcdrlocation");
		}
		if(password	!= null){
				pwd=password;
					ispasswordvalid=true;
		}else{
			  System.out.println("Please provide valid password");
		}
		if(dateOfBirth!= null){
				dob=dateOfBirth;
					isdateOfBirthvalid=true;
		}else{
			  System.out.println("Please provide valid date of birth");
		}
		if(age!= null){
				ag=age;
					isagvalid=true;
		}else{
			  System.out.println("Please provide valid age");
		}
		if(place!= null){
				plac=place;
					isplacevalid=true;
		}else{
			  System.out.println("Please provide valid place");
		}	
		if(isuserNamevalid && ispasswordvalid && isdateOfBirthvalid && isplacevalid && isagvalid){
				isAccountCreated = true;
		}
	return isAccountCreated;
		}
		 public static void getInstagramDetails(){
		 System.out.println("Enter your passport details");
		 System.out.println("The username is :" + usrn);
		 System.out.println("The password is :" + pwd);
		 System.out.println("The dateOfBirth is:" + dob);
		 System.out.println("The place is :" +plac);
		 System.out.println("The age is:"+ag);
		
	}
}