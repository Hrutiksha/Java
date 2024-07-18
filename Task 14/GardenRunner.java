class GardenRunner{

    public static void main(String[] args){
  
     Garden gar=new Garden();
	 boolean isCreated=gar.toEnjoyy("Lalbagh",1,"Banglore");
	 System.out.println("Created: "+isCreated);
	 gar.getGardenInfo();
	 
	 Garden gar1=new Garden();
	 isCreated=gar1.toEnjoyy("Lotus Garden",2,"Mysore");
	 System.out.println("Created: "+isCreated);
	 gar1.getGardenInfo();
	 
	 Garden gar2=new Garden();
	 isCreated=gar2.toEnjoyy("Green Garden",3,"Mandya");
	 System.out.println("Created: "+isCreated);
	 gar2.getGardenInfo();
	 
	 Garden gar3=new Garden();
	 isCreated=gar3.toEnjoyy("Lily Garden",4,"Bijapur");
	 System.out.println("Created: "+isCreated);
	 gar3.getGardenInfo();
	 
	 Garden gar4=new Garden();
	 isCreated=gar4.toEnjoyy("Tulip",5,"Gulbarga");
	 System.out.println("Created: "+isCreated);
	 gar4.getGardenInfo();
	 
	 Garden gar5=new Garden();
	 isCreated=gar5.toEnjoyy("White Garden",6,"Tumkur");
	 System.out.println("Created: "+isCreated);
	 gar5.getGardenInfo();
	 
	 Garden gar6=new Garden();
	 isCreated=gar6.toEnjoyy("Maharaja Garden",7,"Hassan");
	 System.out.println("Created: "+isCreated);
	 gar6.getGardenInfo();
	 
	 Garden gar7=new Garden();
	 isCreated=gar7.toEnjoyy("Rani Garden",8,"Kerala");
	 System.out.println("Created: "+isCreated);
	 gar7.getGardenInfo();
	 
	 Garden gar8=new Garden();
	 isCreated=gar8.toEnjoyy("Mantri Garden",9,"Shivmogga");
	 System.out.println("Created: "+isCreated);
	 gar8.getGardenInfo();
	 
	 Garden gar9=new Garden();
	 isCreated=gar9.toEnjoyy("Rose Garden",10,"Kashmir");
	 System.out.println("Created: "+isCreated);
	 gar9.getGardenInfo();
	
    }
}