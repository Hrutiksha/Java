class Passport{
static String cprLoc;
static int dcdrLoc;
static String givnm;
static String surnm;
static String db;
static String em;
static String lid;
static boolean emai;
static String pdw;
static String hintqu;
static String  hintan;
static String conpwd; 
static String capt;
public static boolean createPassport(String cprLocation,
int dsdrLocation,String givenName,String surName,String dob,
String email,String loginId,boolean isEmailLoginSame,String pwd,String hintQues,String hintAns,String confirmPwd,String captcha){
  boolean isPassportDataCreated =false;
  cprLoc = cprLocation;
  dcdrLoc = dsdrLocation;
  givnm = givenName;
  surnm = surName;
  db = dob;
  em = email;
  lid = loginId;
  emai = isEmailLoginSame;
  pdw = pwd;
  hintqu = hintQues;
  hintan = hintAns;
  conpwd = confirmPwd;
  capt = captcha;
  return isPassportDataCreated;
    }
	
	public static void getPassportDetails(){
		
		
	System.out.println("The Cpr Location is:" +cprLoc);
	System.out.println("The dcdr Location is:" +dcdrLoc);
	System.out.println("The given name  is:" +givnm);
	System.out.println("The Sur name is:" +surnm);
	System.out.println("The D O B  is:" +db);
	System.out.println("The Email  is:" +em);
	System.out.println("The Login id is:" +lid);
	System.out.println("Is Email Login same:" +emai);
	System.out.println("The Password is:" +pdw);
	System.out.println("The Hint Question is:" +hintqu);
	System.out.println("The Hint Ans is:" +hintan);
	System.out.println("The Confirm password is:" +conpwd);
	System.out.println("The Captcha is:" +capt);
	
	}
}	
	