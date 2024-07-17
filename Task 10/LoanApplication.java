class LoanApplication{
static String bankAccNo;
static String banNam;
static String credScor;
static String ratOfInter;
static String loaTyp;


public static boolean createLoanApplication(String bankAccountNo ,String bankName ,String creditScore, String rateOfInterest ,
String loanType){
   boolean isAccountCreated = false;
   boolean isbankAccountNoValid= false;
   boolean isbankNameValid = false;   
   boolean iscreditScoreValid = false;
   boolean israteOfInterestValid = false;
   boolean isloanTypeValid =false;
   if(bankAccountNo!= null){
		   bankAccNo=bankAccountNo;
		    isbankAccountNoValid=true;
		}else{
		     System.out.println("Please provide the valid bankAccountNo");
	    }
		if(bankName!= null){
		   banNam=bankName;
		    isbankNameValid=true;
		}else{
		     System.out.println("Please provide the valid bankName");
	    }
		if(creditScore!= null){
		   credScor=creditScore;
		    iscreditScoreValid=true;
		}else{
		     System.out.println("Please provide the valid creditScore");
	    }
		if(rateOfInterest!= null){
		    ratOfInter =rateOfInterest;
		      israteOfInterestValid =true;
		}else{
		     System.out.println("Please provide the rateOfInterest");
	    }
		if(loanType!= null){
		   loaTyp=loanType;
		    isloanTypeValid=true;
		}else{
		     System.out.println("Please provide the valid loanType");
	    }
		if(isbankAccountNoValid && isbankNameValid && iscreditScoreValid && israteOfInterestValid && isloanTypeValid){
				isAccountCreated = true;
		}
	return isAccountCreated;
}

		public static void getAccountDetails(){
		
		
	System.out.println("The bank Account No is:" +bankAccNo);
	System.out.println("The bank Name is:" +banNam);
	System.out.println("The credit Score  is:" +credScor);
	System.out.println("The rate OfInterest is:" +ratOfInter);
	System.out.println("The loan Type  is:" +loaTyp);
	}
}