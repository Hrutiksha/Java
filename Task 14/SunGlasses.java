class SunGlasses{

String name;
int id;
String type;
double price;


public boolean toStylee(String name,int id,String type,double price){
     boolean istoStyle=false;
	 if(name!=null&&id>0&&type!=null&&price>0){
	  this.name=name;
	  this.id=id;
	  this.type=type;
	  this.price=price;
	  
	  istoStyle=true;
	 }
     return istoStyle;
   }
   
    public void getSunGlassesInfo(){
	   System.out.println(" Name is: "+name);
	   System.out.println("Id: "+id);
	   System.out.println("Type is: "+type);
	   System.out.println("Price is: "+price);
	   
   }
}