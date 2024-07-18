class Garden{

int id;
String name;
String address;

public boolean toEnjoyy(String name,int id,String address){
     boolean istoEnjoy=false;
	 if(name!=null&&id>0&&address!=null){
	  this.name=name;
	  this.id=id;
	  this.address=address;
	  
	  istoEnjoy=true;
	 }
     return istoEnjoy;
   }
   
    public void getGardenInfo(){
	   System.out.println(" Name is: "+name);
	   System.out.println("Id: "+id);
	   System.out.println("Address is: "+address);
	   
   }
}