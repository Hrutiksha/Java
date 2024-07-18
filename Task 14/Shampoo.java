class Shampoo{

 String name ;
 double price ;
 int id ;
 String type;
 String mfgDate;
 String expDate;
 
 public boolean tocreateShampoo(String name ,double price ,int id ,String type ,String mfgDate,String expDate){
			  boolean isShampooCreated=false;
			  if(name != null && price > 0 && id >0){
			  this.name = name;
			  this.type = type;
			  this.price = price;
			  this.id = id;
			  this.mfgDate = mfgDate;
			  this.expDate = expDate;
			  isShampooCreated=true;
   }
   return isShampooCreated;
  
 }
 
 public void displayShampooInfo(){
	 System.out.println("The name is:"+this.name);
	 System.out.println("The type is:"+this.type);
	 System.out.println("The price is:"+this.price);
	 System.out.println("The id is:"+this.id);
	 System.out.println("The mfg date is:"+this.mfgDate);
	 System.out.println("The exp date is:"+this.expDate);
	 
    }
}