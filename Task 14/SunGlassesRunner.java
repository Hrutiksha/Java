class SunGlassesRunner{

    public static void main(String[] args){
  
     SunGlasses sun=new SunGlasses();
	 boolean isCreated=sun.toStylee("RayBan",1,"Square",1000.00);
	 System.out.println("Created: "+isCreated);
	 sun.getSunGlassesInfo();
	 
	 SunGlasses sun1=new SunGlasses();
	 isCreated=sun1.toStylee("Oakley",2,"Shield",2250.00);
	 System.out.println("Created: "+isCreated);
	 sun1.getSunGlassesInfo();
	 
	 SunGlasses sun2=new SunGlasses();
	 isCreated=sun2.toStylee("Carrera",3,"Heart",4580.00);
	 System.out.println("Created: "+isCreated);
	 sun2.getSunGlassesInfo();
	 
	 SunGlasses sun3=new SunGlasses();
	 isCreated=sun3.toStylee("Persol",4,"Gradient",1800.00);
	 System.out.println("Created: "+isCreated);
	 sun3.getSunGlassesInfo();
	 
	 SunGlasses sun4=new SunGlasses();
	 isCreated=sun4.toStylee("Gucci",5,"Browline",6770.00);
	 System.out.println("Created: "+isCreated);
	 sun4.getSunGlassesInfo();
	 
	 SunGlasses sun5=new SunGlasses();
	 isCreated=sun5.toStylee("Prada",6,"Classic",5645.00);
	 System.out.println("Created: "+isCreated);
	 sun5.getSunGlassesInfo();
	 
	 SunGlasses sun6=new SunGlasses();
	 isCreated=sun6.toStylee("Fastrack",7,"Octagonal",7850.00);
	 System.out.println("Created: "+isCreated);
	 sun6.getSunGlassesInfo();
	 
	 SunGlasses sun7=new SunGlasses();
	 isCreated=sun7.toStylee("Idee",8,"CatEye",2380.00);
	 System.out.println("Created: "+isCreated);
	 sun7.getSunGlassesInfo();
	 
	 SunGlasses sun8=new SunGlasses();
	 isCreated=sun8.toStylee("Ahlem",9,"Rectangle",3440.00);
	 System.out.println("Created: "+isCreated);
	 sun8.getSunGlassesInfo();
	 
	 SunGlasses sun9=new SunGlasses();
	 isCreated=sun9.toStylee("Blenders",10,"OverSized",6740.00);
	 System.out.println("Created: "+isCreated);
	 sun9.getSunGlassesInfo();
	
    }
}