class Aadhar{
	
	static String aadharNumber;
	static String name;
	static String surNm;
	static String dobt;
	static String mail;
	static String givenNm;
	static boolean iSemailLoginSame;
	static String loginID;
	static String password;
	static String hintAnswer;
	static String captCha;
	
	//method declaration
	public static boolean createPassword(String aAdharNumber,String naMe,String surName,
	String dob ,String email,String givenName,
	boolean isemailLoginSame, String loginId,String pwd,String hintAns,String captcha){
		boolean isAadharDataCreated = false;
			aadharNumber = aAdharNumber;
			name = naMe;
			surNm = surName;
	        dobt = dob;
			mail = email;
			givenNm = givenName;
			iSemailLoginSame=isemailLoginSame;
			loginID=loginId;
			password=pwd;
			hintAnswer=hintAns;
			captCha=captcha;    
						
					
	return isAadharDataCreated;
	}
			
		    public static void getAadharDetails(){	
				
				System.out.println("the Aadhar number is:"+aadharNumber);
				System.out.println("the name is:"+name);
				System.out.println("the surname is :"+surNm);
				System.out.println("the dob is :"+dobt);
				System.out.println("the email is:"+mail);
				System.out.println("the given name is:"+givenNm);
				System.out.println("Is emailId same as loginId:"+iSemailLoginSame);
				System.out.println("the login Id is:"+loginID);
				System.out.println("the password is:"+password);
				System.out.println("the hint answer is:"+hintAnswer);
				System.out.println("the captcha is:"+captCha);
			
	

			}

}