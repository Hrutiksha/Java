class Sim{
   
   String name;
   int id;
   int plan;
   double price;
   
   public boolean toBuy(String name,int id,int plan,double price){
     boolean isforBuy=false;
	 if(name!=null&&id>0&&price>0){
	  this.name=name;
	  this.id=id;
	  this.plan=plan;
	  this.price=price;
	  isforBuy=true;
	 }
     return isforBuy;
   }
   
   public void getSimInfo(){
	   System.out.println("Brand Name is: "+name);
	   System.out.println("Id: "+id);
	   System.out.println("The plan is: "+plan);
	   System.out.println("Price: "+price);
}
}