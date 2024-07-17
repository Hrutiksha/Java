class Hospital{
 static String patientNm;
 static String diseaseNm;
 static String bloodGp;
 static int    patntId;
 static String prescrip;
 static String hospitalBrnch;
 static int    ag;
 static int    wght;
 static String drNm;
 
  public static boolean createHospitalRegistration(String patientName,String diseaseName,String bloodGroup,int patientId,String prescription,String hospitalBranch,int age,int weight,String doctorName ) {
	   
	    boolean isRegistrationCreated=false;
		boolean ispatientNamevalid=false;
		boolean isdiseaseNamevalid=false;
		boolean isbloodGroupvalid=false;
		boolean ispatientIdvalid=false;
		boolean isprescriptionvalid=false;
		boolean ishospitalBranchvalid=false;
		boolean isagevalid=false;
		boolean isweightvalid=false;
		boolean isdoctorNamevalid=false;
		
		
		

		if(patientName	!= null){
				patientNm=patientName;
					ispatientNamevalid=true;
		}else{
			  System.out.println("Please provide valid patientName");
		}
		if(diseaseName	!= null){
				diseaseNm=diseaseName;
					isdiseaseNamevalid=true;
		}else{
			  System.out.println("Please provide valid diseaseName");
		}
		if(bloodGroup!= null){
				bloodGp=bloodGroup;
					isbloodGroupvalid=true;
		}else{
			  System.out.println("Please provide valid bloodGroup");
		}
		if(patientId!= 0){
				patntId=patientId;
					ispatientIdvalid=true;
		}else{
			  System.out.println("Please provide valid patientId");
		}
		if(prescription!= null){
				prescrip=prescription;
					isprescriptionvalid=true;
		}else{
			  System.out.println("Please provide valid prescription");
		}	
		if(hospitalBranch!=null){
		        hospitalBrnch=hospitalBranch;
				   ishospitalBranchvalid=true;
		}else{
		       System.out.println("please provide valid hospitalBranch");
	    }
		if(age!=0){
		        ag=age;
				   isagevalid=true;
		}else{
		       System.out.println("please provide valid age");
	    }
		if(weight!=0){
		        wght=weight;
				   isweightvalid=true;
		}else{
		       System.out.println("please provide valid weight");
	    }
		if(doctorName!=null){
		        drNm=doctorName;
				   isdoctorNamevalid=true;
		}else{
		       System.out.println("please provide valid doctorName");
	    }
		if(ispatientNamevalid && isdiseaseNamevalid && isbloodGroupvalid && ispatientIdvalid && isprescriptionvalid && ishospitalBranchvalid && isagevalid && isweightvalid && isdoctorNamevalid){
				isRegistrationCreated = true;
		}
	return isRegistrationCreated;
		}
		 public static void getRegistrationDetails(){
		 System.out.println("Enter your registering details");
		 System.out.println("The patientName is :" + patientNm);
		 System.out.println("The diseaseName is :" + diseaseNm);
		 System.out.println("The bloodGroup is:" + bloodGp);
		 System.out.println("The patientId is :" +patntId);
		 System.out.println("The prescription is:"+prescrip);
		 System.out.println("The hospitalBranch is:"+hospitalBrnch);
		 System.out.println("The age is:"+ag);
		 System.out.println("The weight is:"+wght);
		 System.out.println("The doctorName is:"+drNm);
		
	}
}