class SimRunner{

    public static void main(String[] pay){
  
     Sim user=new Sim();
	 boolean isCreated=user.toBuy("BSNL",1,10,10.00);
	 System.out.println("Created: "+isCreated);
	 user.getSimInfo();
	 
	 Sim user1=new Sim();
	 isCreated=user1.toBuy("Airtel",2,15,50.00);
	 System.out.println("Created: "+isCreated);
	 user1.getSimInfo();
	 
	 Sim user2=new Sim();
	 isCreated=user2.toBuy("Jio",3,40,80.00);
	 System.out.println("Created: "+isCreated);
	 user2.getSimInfo();
	 
	 Sim user3=new Sim();
	 isCreated=user3.toBuy("Vodafone",4,50,100.00);
	 System.out.println("Created: "+isCreated);
	 user3.getSimInfo();
	 
	 Sim user4=new Sim();
	 isCreated=user4.toBuy("idea",5,15,70.00);
	 System.out.println("Created: "+isCreated);
	 user4.getSimInfo();
	 
	 Sim user5=new Sim();
	 isCreated=user5.toBuy("Airtel",6,10,45.00);
	 System.out.println("Created: "+isCreated);
	 user5.getSimInfo();
	 
	 Sim user6=new Sim();
	 isCreated=user6.toBuy("Reliance",7,50,50.00);
	 System.out.println("Created: "+isCreated);
	 user6.getSimInfo();
	 
	 Sim user7=new Sim();
	 isCreated=user7.toBuy("Telenor",8,30,80.00);
	 System.out.println("Created: "+isCreated);
	 user7.getSimInfo();
	 
	 Sim user8=new Sim();
	 isCreated=user8.toBuy("Tata",9,30,40.00);
	 System.out.println("Created: "+isCreated);
	 user8.getSimInfo();
	 
	 Sim user9=new Sim();
	 isCreated=user9.toBuy("Mtnl",10,12,40.00);
	 System.out.println("Created: "+isCreated);
	 user9.getSimInfo();
	
}
}