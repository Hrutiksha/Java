class HospitalRunner {
public static void main(String [] args){
System.out.println("the registration process has been started");
Hospital.createHospitalRegistration("raju","cancer","A positive",762,"cancer tablets","Apollo",56,80,"ram");
Hospital.getRegistrationDetails();
System.out.println("the registration process has been ended");
}
}